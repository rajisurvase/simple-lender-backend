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

import com.sachin.springdemo.entity.Record;
import com.sachin.springdemo.payload.response.RecordListWithCount;
import com.sachin.springdemo.service.BorrowerService;
import com.sachin.springdemo.service.RecordService;

@EnableGlobalMethodSecurity
@RestController
@RequestMapping("/api")
public class RecordRestController {

	@Autowired
	private RecordService recordService;
	
	@Autowired
	private BorrowerService borrowerService;
	
	@GetMapping("/borrowers/{borrowerId}/allRecords")
	@CrossOrigin(origins = "http://localhost:3000") // Allow requests from this origin
	public List<Record> getRecords(@PathVariable("borrowerId") int theBorrowerId) {
		return recordService.getRecords(theBorrowerId);
	}
	
	@GetMapping("/borrowers/{borrowerId}/records")
	@CrossOrigin(origins = "http://localhost:3000") // Allow requests from this origin
    public RecordListWithCount getAllRecordsByPageRequest(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(name = "sortBy", defaultValue = "id") String sortBy,
            @RequestParam(name = "sortOrder", defaultValue = "asc") String sortOrder
    ) {
		
		PageRequest pageRequest = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sortOrder), sortBy));
		
//        return recordService.findAll(pageRequest);
		return recordService.findAllWithRecordCount(pageRequest);
    }
	
	@GetMapping("/borrowers/{borrowerId}/records/{id}")
	@CrossOrigin(origins = "http://localhost:3000") // Allow requests from this origin
	public Record getRecordById(@PathVariable("borrowerId") int theBorrowerId, 
			@PathVariable("id") int theId) {
		
		return recordService.getRecord(theId);
	}
	
	@PostMapping("/borrowers/{borrowerId}/records")
	@CrossOrigin(origins = "http://localhost:3000") // Allow requests from this origin
	public Record saveRecord(@PathVariable("borrowerId") int theBorrowerId, 
			@RequestBody Record theRecord) {
		
		theRecord.setId(0);
		System.out.println(borrowerService.getBorrower(theBorrowerId).toString() + "######################");
		theRecord.setBorrower(borrowerService.getBorrower(theBorrowerId));
		
		recordService.saveRecord(theRecord);
		
		return theRecord;
	}
	
	@PutMapping("/borrowers/{borrowerId}/records")
	@CrossOrigin(origins = "http://localhost:3000") // Allow requests from this origin
	public Record updateRecord(@PathVariable("borrowerId") int theBorrowerId,
			@RequestBody Record theRecord) {
		
		theRecord.setBorrower(borrowerService.getBorrower(theBorrowerId));
		recordService.saveRecord(theRecord);
		
		return theRecord;
	}
	
	@DeleteMapping("/borrowers/{borrowerId}/records/{id}")
	@CrossOrigin(origins = "http://localhost:3000") // Allow requests from this origin
	public String deleteRecord(@PathVariable("borrowerId") int theBorrowerId,
			@PathVariable("id") int theId) {
		
		recordService.deleteRecord(theId);
		
		return "Record with ID " + theId + " is deleted.";
	}
}