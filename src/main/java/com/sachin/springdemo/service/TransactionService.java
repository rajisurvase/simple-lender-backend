package com.sachin.springdemo.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;

import com.sachin.springdemo.entity.Transaction;

public interface TransactionService {

	List<Transaction> getTransactions(int theRecordId);

	Transaction getTransaction(int theId);

	void saveTransaction(Transaction theTransaction);

	void deleteTransaction(int theId);

	List<Transaction> findAll(PageRequest pageRequest);

}
