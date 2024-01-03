package com.sachin.springdemo.payload.response;

import java.util.List;

import com.sachin.springdemo.entity.Borrower;
import com.sachin.springdemo.entity.Record;
import com.sachin.springdemo.entity.Transaction;

public class TransactionListWithCount {
     long pageCount;
     List<Transaction> transactions;
     
	
	public long getCount() {
		return pageCount;
	}


	public void setCount(long count) {
		this.pageCount = count;
	}


	public List<Transaction> getTransation() {
		return transactions;
	}


	public void setRecords(List<Transaction> transactions) {
		this.transactions = transactions;
	}


	public TransactionListWithCount(long count, List<Transaction> transactions) {
		this.pageCount= count;
		this.transactions = transactions;
		// TODO Auto-generated constructor stub
	}

}
