package com.Banking_App.demo.Service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Banking_App.Models.Transaction;
import com.Banking_App.demo.Repo_DAO.TransactionRepository;

@Service
public class TransactionService
{
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Autowired
	private AccountService accountService;
	
	public void transferMoney(String fromAccountNumber, String toAccountNumber, BigDecimal amount)
	{
		accountService.debitmoney(fromAccountNumber, amount);
		accountService.creditmoney(toAccountNumber, amount);
	
		Transaction transaction = new Transaction(null, toAccountNumber, toAccountNumber, amount);
		transaction.setFromAccount(fromAccountNumber);
		transaction.setToAccount(toAccountNumber);
		transaction.setAmount(amount);
		transactionRepository.save(transaction);
	}
}
