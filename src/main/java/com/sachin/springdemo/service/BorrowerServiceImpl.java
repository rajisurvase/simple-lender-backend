package com.sachin.springdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.sachin.springdemo.dao.BorrowerRepository;
import com.sachin.springdemo.entity.Borrower;

@Service
public class BorrowerServiceImpl implements BorrowerService {
	
	@Autowired
	private BorrowerRepository borrowerRepository;

	@Override
	@Transactional
	public List<Borrower> getBorrowers() {
		
		List<Borrower> theBorrowers = new ArrayList<>();
		
		borrowerRepository.findAll().forEach(theBorrowers :: add);
		
		return theBorrowers;
	}

	@Override
	@Transactional
	public Borrower getBorrower(int theId) {
		return borrowerRepository.findById(theId).orElse(null);
	}

	@Override
	@Transactional
	public void saveBorrower(Borrower theBorrower) {
		borrowerRepository.save(theBorrower);
	}

	@Override
	@Transactional
	public void deleteBorrower(int theId) {
		borrowerRepository.deleteById(theId);
	}

	@Override
	@Transactional
	public List<Borrower> findAll(PageRequest pageRequest) {
		
		List<Borrower> theBorrowers = new ArrayList<>();
		
		borrowerRepository.findAll(pageRequest).forEach(theBorrowers :: add);
		
		return theBorrowers;
	}

}
