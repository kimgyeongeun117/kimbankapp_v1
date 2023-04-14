package com.example.bank.repository.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Account {

	private Integer id;
	private String number;
	private String password;
	private Long balance;
	private Integer userId;
	private Timestamp createdAt;
	
	public void withdraw(Long amount) {
		this.balance -= amount;
	}
	
	public void deposite(Long amount) {
		this.balance += amount;
	}
}
