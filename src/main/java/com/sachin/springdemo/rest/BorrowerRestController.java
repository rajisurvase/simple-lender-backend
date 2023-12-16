package com.sachin.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.springdemo.entity.Borrower;
import com.sachin.springdemo.service.BorrowerService;

@EnableGlobalMethodSecurity
@RestController
@RequestMapping("/api")
public class BorrowerRestController {

	@Autowired
	private BorrowerService borrowerService;
	
	@GetMapping("/allBorrowers")
	@CrossOrigin(origins = "http://localhost:4200") // Allow requests from this origin
	public List<Borrower> getBorrowers() {
		return borrowerService.getBorrowers();
	}
	
	@GetMapping("/borrowers")
	@CrossOrigin(origins = "http://localhost:4200") // Allow requests from this origin
    public List<Borrower> getAllBorrowersByPageRequest(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(name = "sortBy", defaultValue = "name") String sortBy,
            @RequestParam(name = "sortOrder", defaultValue = "asc") String sortOrder
    ) {
		
		PageRequest pageRequest = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sortOrder), sortBy));
		
        return borrowerService.findAll(pageRequest);
    }
	
	@GetMapping("/borrowers/{id}")
	@CrossOrigin(origins = "http://localhost:4200") // Allow requests from this origin
	public Borrower getBorrowerById(@PathVariable("id") int theId) {
		
		return borrowerService.getBorrower(theId);
	}
	
	@PostMapping("/borrowers")
	@CrossOrigin(origins = "http://localhost:4200") // Allow requests from this origin
	public Borrower saveBorrower(@RequestBody Borrower theBorrower) {
		
		theBorrower.setId(0);
		
		borrowerService.saveBorrower(theBorrower);
		
		return theBorrower;
	}
	
	@PutMapping("/borrowers")
	@CrossOrigin(origins = "http://localhost:4200") // Allow requests from this origin
	public Borrower updateBorrower(@RequestBody Borrower theBorrower) {
		
		borrowerService.saveBorrower(theBorrower);
		
		return theBorrower;
	}
	
	@DeleteMapping("/borrowers/{id}")
	@CrossOrigin(origins = "http://localhost:4200") // Allow requests from this origin
	public String deleteBorrower(@PathVariable("id") int theId) {
		
		borrowerService.deleteBorrower(theId);
		
		return "Borrower with ID " + theId + " is deleted.";
	}
}
