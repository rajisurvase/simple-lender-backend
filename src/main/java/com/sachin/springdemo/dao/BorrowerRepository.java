package com.sachin.springdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sachin.springdemo.entity.Borrower;

@Repository
public interface BorrowerRepository extends JpaRepository<Borrower, Integer> {
	
}
