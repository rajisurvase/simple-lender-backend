package com.sachin.springdemo.payload.response;

import java.util.List;

import com.sachin.springdemo.entity.Borrower;
import com.sachin.springdemo.entity.Record;

public class RecordListWithCount {
     long pageCount;
     List<Record> records;
     
	
	public long getCount() {
		return pageCount;
	}


	public void setCount(long count) {
		this.pageCount = count;
	}


	public List<Record> getRecords() {
		return records;
	}


	public void setRecords(List<Record> records) {
		this.records = records;
	}


	public RecordListWithCount(long count, List<Record> records) {
		this.pageCount= count;
		this.records = records;
		// TODO Auto-generated constructor stub
	}

}
