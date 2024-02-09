package com.Banking_App.demo.Controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Banking_App.demo.Service.TransactionService;

@RestController
@RequestMapping
public class TransactionController 
{
	@Autowired
	private TransactionService transactionService;
	
	@PostMapping("/transfer")
	
		public void transferMoney(@RequestParam String fromAccountNumber,@RequestParam String toAccountNumber, BigDecimal amount)
		{
			transactionService.transferMoney(fromAccountNumber, toAccountNumber, amount);
		}
	
}
