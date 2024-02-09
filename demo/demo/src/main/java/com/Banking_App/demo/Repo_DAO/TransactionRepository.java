package com.Banking_App.demo.Repo_DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Banking_App.Models.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>
{
	
}
