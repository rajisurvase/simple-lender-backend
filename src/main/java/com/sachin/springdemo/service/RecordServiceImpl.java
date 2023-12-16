package com.sachin.springdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.sachin.springdemo.dao.RecordRepository;
import com.sachin.springdemo.entity.Record;

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

}
