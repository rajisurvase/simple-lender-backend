package com.sachin.springdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.sachin.springdemo.dao.TransactionRepository;
import com.sachin.springdemo.entity.Transaction;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	@Transactional
	public List<Transaction> getTransactions(int theRecordId) {
		return transactionRepository.findAllByRecord_id(theRecordId);
	}

	@Override
	@Transactional
	public Transaction getTransaction(int theId) {
		return transactionRepository.findById(theId).orElse(null);
	}

	@Override
	@Transactional
	public void saveTransaction(Transaction theTransaction) {
		transactionRepository.save(theTransaction);
	}

	@Override
	@Transactional
	public void deleteTransaction(int theId) {
		transactionRepository.deleteById(theId);
	}

	@Override
	@Transactional
	public List<Transaction> findAll(PageRequest pageRequest) {
		List<Transaction> theTransactions = new ArrayList<>();
		
		transactionRepository.findAll(pageRequest).forEach(theTransactions :: add);
		
		return theTransactions;
	}

}
