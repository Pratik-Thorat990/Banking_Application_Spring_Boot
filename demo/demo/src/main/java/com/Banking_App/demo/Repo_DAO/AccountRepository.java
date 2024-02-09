package com.Banking_App.demo.Repo_DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Banking_App.Models.Account;

public interface AccountRepository extends JpaRepository<Account,Long> 
{
	Account findByAccountNumber(String accountNumber);
}
