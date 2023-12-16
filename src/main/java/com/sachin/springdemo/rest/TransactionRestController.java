package com.sachin.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.springdemo.entity.Transaction;
import com.sachin.springdemo.service.RecordService;
import com.sachin.springdemo.service.TransactionService;

@EnableGlobalMethodSecurity
@RestController
@RequestMapping("/api")
public class TransactionRestController {

	@Autowired
	private TransactionService transactionService;
	
	@Autowired
	private RecordService recordService;
	
	@GetMapping("/records/{recordId}/allTransactions")
	@CrossOrigin(origins = "http://localhost:4200") // Allow requests from this origin
	public List<Transaction> getTransactions(@PathVariable("recordId") int theRecordId) {
		return transactionService.getTransactions(theRecordId);
	}
	
	@GetMapping("/records/{recordId}/transactions")
	@CrossOrigin(origins = "http://localhost:4200") // Allow requests from this origin
    public List<Transaction> getAllTransactionsByPageRequest(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(name = "sortBy", defaultValue = "id") String sortBy,
            @RequestParam(name = "sortOrder", defaultValue = "asc") String sortOrder
    ) {
		
		PageRequest pageRequest = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sortOrder), sortBy));
		
        return transactionService.findAll(pageRequest);
    }
	
	@GetMapping("/records/{recordId}/transactions/{id}")
	@CrossOrigin(origins = "http://localhost:4200") // Allow requests from this origin
	public Transaction getTransactionById(@PathVariable("recordId") int theRecordId, 
			@PathVariable("id") int theId) {
		
		return transactionService.getTransaction(theId);
	}
	
	@PostMapping("/records/{recordId}/transactions")
	@CrossOrigin(origins = "http://localhost:4200") // Allow requests from this origin
	public Transaction saveTransaction(@PathVariable("recordId") int theRecordId, 
			@RequestBody Transaction theTransaction) {
		
		theTransaction.setId(0);
		theTransaction.setRecord(recordService.getRecord(theRecordId));
		
		transactionService.saveTransaction(theTransaction);
		
		return theTransaction;
	}
	
	@PutMapping("/records/{recordId}/transactions")
	@CrossOrigin(origins = "http://localhost:4200") // Allow requests from this origin
	public Transaction updateTransaction(@PathVariable("recordId") int theRecordId,
			@RequestBody Transaction theTransaction) {
		
		theTransaction.setRecord(recordService.getRecord(theRecordId));
		transactionService.saveTransaction(theTransaction);
		
		return theTransaction;
	}
	
	@DeleteMapping("/records/{recordId}/transactions/{id}")
	@CrossOrigin(origins = "http://localhost:4200") // Allow requests from this origin
	public String deleteTransaction(@PathVariable("recordId") int theRecordId,
			@PathVariable("id") int theId) {
		
		transactionService.deleteTransaction(theId);
		
		return "Transaction with ID " + theId + " is deleted.";
	}
}