package com.sachin.springdemo.payload.response;

import java.util.List;

import com.sachin.springdemo.entity.Borrower;

public class BorrowerListWithCount {
     long pageCount;
     List<Borrower> borrowers;
     
	
	public long getCount() {
		return pageCount;
	}


	public void setCount(long count) {
		this.pageCount = count;
	}


	public List<Borrower> getBorrowers() {
		return borrowers;
	}


	public void setBorrowers(List<Borrower> borrowers) {
		this.borrowers = borrowers;
	}


	public BorrowerListWithCount(long count, List<Borrower> borrowers) {
		this.pageCount= count;
		this.borrowers = borrowers;
		// TODO Auto-generated constructor stub
	}

}
