package com.sachin.springdemo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sachin.springdemo.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	//List<User> findByUserName(String userName);
	
	Optional<User> findByUserName(String userName);

	Boolean existsByUserName(String userName);

	Boolean existsByEmail(String email);

	@Modifying
	@Transactional
	@Query("update User u set u.password = :password where u.userName = :userName")
	public void updatePassword(@Param("password") String password, @Param("userName") String userName);
}
