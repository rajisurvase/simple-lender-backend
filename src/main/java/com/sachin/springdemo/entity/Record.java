package com.sachin.springdemo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "record")
public class Record {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "borrower_name")
	private String borrowerName;

	@Column(name = "principle_amount")
	private String principleAmount;

	@Column(name = "roi")
	private String roi;

	@Column(name = "purchase_date")
	private String purchaseDate;

	@Column(name = "due_date")
	private String dueDate;

	@Column(name = "status")
	private String status;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "borrower_id", nullable = false)
	private Borrower borrower;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "record", cascade = CascadeType.ALL)
    private List<Transaction> transactions;

	public Record() {
		super();
	}

	public Record(int id, String borrowerName, String principleAmount, String roi, String purchaseDate, String dueDate,
			String status, Borrower borrower, List<Transaction> transactions) {
		super();
		this.id = id;
		this.borrowerName = borrowerName;
		this.principleAmount = principleAmount;
		this.roi = roi;
		this.purchaseDate = purchaseDate;
		this.dueDate = dueDate;
		this.status = status;
		this.borrower = borrower;
		this.transactions = transactions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBorrowerName() {
		return borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}

	public String getPrincipleAmount() {
		return principleAmount;
	}

	public void setPrincipleAmount(String principleAmount) {
		this.principleAmount = principleAmount;
	}

	public String getRoi() {
		return roi;
	}

	public void setRoi(String roi) {
		this.roi = roi;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Borrower getBorrower() {
		return borrower;
	}

	public void setBorrower(Borrower borrower) {
		this.borrower = borrower;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "Record [id=" + id + ", borrowerName=" + borrowerName + ", principleAmount=" + principleAmount + ", roi="
				+ roi + ", purchaseDate=" + purchaseDate + ", dueDate=" + dueDate + ", status=" + status + ", borrower="
				+ borrower + ", transactions=" + transactions + "]";
	}

}
