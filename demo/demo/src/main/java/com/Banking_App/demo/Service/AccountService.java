package com.Banking_App.demo.Service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Banking_App.Models.Account;
import com.Banking_App.demo.Repo_DAO.AccountRepository;

@Service
public class AccountService 
{
	@Autowired
	private AccountRepository accountRepository;
	
	public Account openAccount(String accountNumber, BigDecimal initialBalance)
	{
		Account account= new Account(null, accountNumber, initialBalance);
		account.setAccountNumber(accountNumber);
		account.setBalance(initialBalance);
		return accountRepository.save(account);
	}
	public BigDecimal checkBalance(String accountNumber)
	{
		Account account = accountRepository.findByAccountNumber(accountNumber);
		return account != null ?  account.getBalance() : BigDecimal.ZERO;
	}
	
	public void creditmoney(String accountNumber, BigDecimal amount)
	{
		Account account= accountRepository.findByAccountNumber(accountNumber);
		if(account !=null)
		{
			account.setBalance(account.getBalance().add(amount));
			accountRepository.save(account);
		}
	}
	
	public void debitmoney(String accountNumber, BigDecimal amount)
	{
		Account account= accountRepository.findByAccountNumber(accountNumber);
		if(account != null && account.getBalance().compareTo(amount)>= 0)
		{
			account.setBalance(account.getBalance().subtract(amount));
			accountRepository.save(account);
		}
	}
}
