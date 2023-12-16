package com.sachin.springdemo.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.springdemo.entity.Role;
import com.sachin.springdemo.entity.User;
import com.sachin.springdemo.enums.ERole;
import com.sachin.springdemo.payload.request.LoginRequest;
import com.sachin.springdemo.payload.request.SignupRequest;
import com.sachin.springdemo.payload.request.UserChangePasswordRequest;
import com.sachin.springdemo.payload.response.JwtResponse;
import com.sachin.springdemo.payload.response.MessageResponse;
import com.sachin.springdemo.common.utils.AppUtils;
import com.sachin.springdemo.common.utils.PasswordValidatorUtils;
import com.sachin.springdemo.dao.RoleRepository;
import com.sachin.springdemo.dao.UserRepository;
import com.sachin.springdemo.security.jwt.JwtUtils;
import com.sachin.springdemo.security.services.UserDetailsImpl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private PasswordEncoder encoder;

	@Autowired
	private JwtUtils jwtUtils;

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
		logger.info("Login api called");
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);

		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
		List<String> roles = userDetails.getAuthorities().stream().map(item -> item.getAuthority())
				.collect(Collectors.toList());

		return ResponseEntity.ok(new JwtResponse(jwt, userDetails.getId(), userDetails.getUsername(),
				userDetails.getEmail(), roles));
	}

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
		if (userRepository.existsByUserName(signUpRequest.getUserName())) {
			return ResponseEntity.badRequest().body(new MessageResponse("Error: Username is already taken!"));
		}

		if (userRepository.existsByEmail(signUpRequest.getEmail())) {
			return ResponseEntity.badRequest().body(new MessageResponse("Error: Email is already in use!"));
		}

		// Create new user's account
		User user = new User(signUpRequest.getUserName(), encoder.encode(signUpRequest.getPassword()), 
				signUpRequest.getFirstName(), signUpRequest.getLastName(), signUpRequest.getEmail());

		Set<String> strRoles = signUpRequest.getRole();
		Set<Role> roles = new HashSet<>();

		if (strRoles == null) {
			Role userRole = roleRepository.findByName(ERole.ROLE_EMPLOYEE.name())
					.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
			roles.add(userRole);
		} else {
			strRoles.forEach(role -> {
				switch (role) {
				case "admin":
					Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN.name())
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(adminRole);

					break;
				case "manager":
					Role modRole = roleRepository.findByName(ERole.ROLE_MANAGER.name())
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(modRole);

					break;
				default:
					Role userRole = roleRepository.findByName(ERole.ROLE_EMPLOYEE.name())
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(userRole);
				}
			});
		}

		user.setRoles(roles);
		userRepository.save(user);

		return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
	}

	@PostMapping("/signout")
	public ResponseEntity<?> signOut(HttpServletRequest request) {
		String username = null;
		String headerAuth = request.getHeader("Authorization");

		if (StringUtils.hasText(headerAuth) && headerAuth.startsWith("Bearer ")) {
			String jwtToken = headerAuth.substring(7, headerAuth.length());
			username = jwtUtils.getUserNameFromJwtToken(jwtToken);

		}
		System.out.println("signout api username: " + username);
		return ResponseEntity.ok(new MessageResponse("User logout successfully!"));
	}

	@PostMapping("/changePassword")
	public ResponseEntity<?> changeUserPassword(@RequestBody UserChangePasswordRequest userChangePasswordRequest) {
		
		if (null == userChangePasswordRequest || AppUtils.isBlank(userChangePasswordRequest.getUsername())
				|| AppUtils.isBlank(userChangePasswordRequest.getCurrentPassword())
				|| AppUtils.isBlank(userChangePasswordRequest.getNewPassword())
				|| AppUtils.isBlank(userChangePasswordRequest.getConfirmNewPassword())) {
			return ResponseEntity.badRequest().body(new MessageResponse("Error: Missing required parameters!"));
		}
		Optional<User> userOp = userRepository.findByUserName(userChangePasswordRequest.getUsername());

		if (null != userOp && userOp.isPresent() && null != userOp.get()) {
			User userDb = userOp.get();
			if (encoder.matches(userChangePasswordRequest.getCurrentPassword(), userDb.getPassword())) {

				if (!userChangePasswordRequest.getNewPassword().trim()
						.equals(userChangePasswordRequest.getConfirmNewPassword().trim())) {
					return ResponseEntity.badRequest()
							.body(new MessageResponse("Error: New and confirm password must be same!"));
				}

				String check = PasswordValidatorUtils.validatePassword(userChangePasswordRequest.getNewPassword());
				if (!check.equalsIgnoreCase("success")) {
					return ResponseEntity.badRequest().body(new MessageResponse("Error: " + check));
				} else {
					userRepository.updatePassword(encoder.encode(userChangePasswordRequest.getNewPassword()),
							userChangePasswordRequest.getUsername());
					return ResponseEntity.ok(new MessageResponse("User password updated successfully!"));
				}

			} else {
				return ResponseEntity.badRequest().body(new MessageResponse("Error: Invalid current password!"));
			}

		} else {
			return ResponseEntity.badRequest().body(new MessageResponse("Error: Invalid Username!"));
		}

	}

}
