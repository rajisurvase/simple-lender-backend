package com.sachin.springdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.sachin.springdemo.dao.RecordRepository;
import com.sachin.springdemo.entity.Borrower;
import com.sachin.springdemo.entity.Record;
import com.sachin.springdemo.payload.response.BorrowerListWithCount;
import com.sachin.springdemo.payload.response.RecordListWithCount;

@Service
public class RecordServiceImpl implements RecordService {
	
	@Autowired
	private RecordRepository recordRepository;

	@Override
	@Transactional
	public List<Record> getRecords(int theBorrowerId) {
		
		return recordRepository.findAllByBorrower_id(theBorrowerId);
	}

	@Override
	@Transactional
	public Record getRecord(int theId) {
		return recordRepository.findById(theId).orElse(null);
	}

	@Override
	@Transactional
	public void saveRecord(Record theRecord) {
		recordRepository.save(theRecord);

	}

	@Override
	@Transactional
	public void deleteRecord(int theId) {
		recordRepository.deleteById(theId);
	}

	@Override
	@Transactional
	public List<Record> findAll(PageRequest pageRequest) {
		List<Record> theRecords = new ArrayList<>();
		
		recordRepository.findAll(pageRequest).forEach(theRecords :: add);
		
		return theRecords;
	}

	@Override
	public RecordListWithCount findAllWithRecordCount(PageRequest pageRequest) {
		// TODO Auto-generated method stub
		
		List<Record> theRecords = new ArrayList<>();
		
		Page<Record> record = recordRepository.findAll(pageRequest);
		long pageCount= record.getTotalPages();
		System.out.println(pageCount+ "count++++++++++++++++++++++++");
		record.forEach(theRecords :: add);
		RecordListWithCount b = new RecordListWithCount(pageCount, theRecords);
		return b;
		
	}

}
