package com.Banking_App.demo.Controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Banking_App.Models.Account;
import com.Banking_App.demo.Service.AccountService;

@RestController
public class AccountController
{
	@Autowired
	private AccountService accountService;
	
	@PostMapping("/open")
	public Account openAcount(@RequestParam String accountNumber, @RequestParam BigDecimal initialBalance)
	{
		return accountService.openAccount(accountNumber, initialBalance);
	}
	
	@GetMapping("/balance")
	public BigDecimal checkBalance(@RequestParam String accountNumber)
	{
		return accountService.checkBalance( accountNumber);
	}
}
