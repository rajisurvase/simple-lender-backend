package com.sachin.springdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sachin.springdemo.entity.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Integer> {
	
	List<Record> findAllByBorrower_id(int theBorrowerId);
}
