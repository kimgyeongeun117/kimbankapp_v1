package com.example.bank.repository.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Histroy {

	private Integer id;
	private Long amount;
	private Long wBalance;
	private Long dBalance;
	private Integer wAccountId;
	private Integer dAccountId;
	private Timestamp createdAt;
}
