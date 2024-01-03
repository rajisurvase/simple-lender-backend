package com.sachin.springdemo.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;

import com.sachin.springdemo.entity.Record;
import com.sachin.springdemo.payload.response.RecordListWithCount;

public interface RecordService {
	
	List<Record> getRecords(int theBorrowerId);

	Record getRecord(int theId);

	void saveRecord(Record theRecord);

	void deleteRecord(int theId);

	List<Record> findAll(PageRequest pageRequest);

	RecordListWithCount findAllWithRecordCount(PageRequest pageRequest);

}
