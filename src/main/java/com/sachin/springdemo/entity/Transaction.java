package com.sachin.springdemo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "due_date")
	private String dueDate;

	@Column(name = "description")
	private String description;

	@Column(name = "withdraw_amount")
	private String withdrawAmount;
	
	@Column(name = "deposit_amount")
	private String depositAmount;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "record_id", nullable = false)
	@JsonIgnore
	private Record record;

	public Transaction() {
		super();
	}

	public Transaction(int id, String dueDate, String description, String withdrawAmount, String depositAmount,
			Record record) {
		super();
		this.id = id;
		this.dueDate = dueDate;
		this.description = description;
		this.withdrawAmount = withdrawAmount;
		this.depositAmount = depositAmount;
		this.record = record;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(String withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public String getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", dueDate=" + dueDate + ", description=" + description + ", withdrawAmount="
				+ withdrawAmount + ", depositAmount=" + depositAmount + ", record=" + record + "]";
	}

}
