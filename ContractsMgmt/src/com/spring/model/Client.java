package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agreements")
public class Client {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name = "number")
	private Long number;
	
	@Column(name = "system")
	private String system;
	

	@Column(name = "start_date")
	private java.util.Date start;
	
	@Column(name = "end_date")
	private java.util.Date end;
	
	@Column(name = "amount")
	private Long amount;
	
	@Column(name = "settlement")
	private String settlement;
	
	@Column(name = "active")
	private String status;
	
	public Client() {
		
	}
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", number=" + number + ", system=" + system + ", start=" + start + ", end=" + end
				+ ", amount=" + amount + ", settlement=" + settlement + ", status=" + status + "]";
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public java.util.Date getStart() {
		return start;
	}

	public void setStart(java.util.Date start) {
		this.start = start;
	}

	public java.util.Date getEnd() {
		return end;
	}

	public void setEnd(java.util.Date end) {
		this.end = end;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getSettlement() {
		return settlement;
	}

	public void setSettlement(String settlement) {
		this.settlement = settlement;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	
}