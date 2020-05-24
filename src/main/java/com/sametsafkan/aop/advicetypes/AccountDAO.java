package com.sametsafkan.aop.advicetypes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	
	public void addAccount(Account account, boolean value) {
		System.out.println(getClass() + " : ADDING ACCOUNT");
	}
	
	public List<Account> findAccounts(){
		List<Account> accounts = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			accounts.add(new Account(i));
		}
		return accounts;
	}
	
	public void delete() {
		throw new RuntimeException("Error happened");
	}
	
	public void closeAccount(Account account) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Closing Account " + account);
	}
	
	public boolean transferAccount(Account account) {
		throw new RuntimeException("Error happened @transferAccount");
	}
}
