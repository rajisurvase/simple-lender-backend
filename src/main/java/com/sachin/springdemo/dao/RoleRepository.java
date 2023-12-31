package com.sachin.springdemo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sachin.springdemo.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

	List<Role> findRoleByName(String name);
	
	Optional<Role> findByName(String name);
}
