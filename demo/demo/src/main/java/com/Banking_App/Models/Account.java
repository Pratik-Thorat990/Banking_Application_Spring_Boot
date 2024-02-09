package com.Banking_App.Models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;
private String accountNumber;
private BigDecimal balance;


//constructor, Getters and Setters

public Account(Long id, String accountNumber, BigDecimal balance) {
	super();
	this.id = id;
	this.accountNumber = accountNumber;
	this.balance = balance;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getAccountNumber() {
	return accountNumber;
}


public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}


public BigDecimal getBalance() {
	return balance;
}


public void setBalance(BigDecimal balance) {
	this.balance = balance;
}



}
