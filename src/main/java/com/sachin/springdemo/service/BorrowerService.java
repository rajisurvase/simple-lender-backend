package com.sachin.springdemo.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;

import com.sachin.springdemo.entity.Borrower;
import com.sachin.springdemo.payload.response.BorrowerListWithCount;


public interface BorrowerService {

	List<Borrower> getBorrowers();

	Borrower getBorrower(int theId);

	void saveBorrower(Borrower theBorrower);

	void deleteBorrower(int theId);

	List<Borrower> findAll(PageRequest pageRequest);
     BorrowerListWithCount findAllWithPageCount(PageRequest pageRequest);
}
