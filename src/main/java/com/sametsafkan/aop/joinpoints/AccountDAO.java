package com.sametsafkan.aop.joinpoints;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	
	public void addAccount(Account account, boolean value) {
		System.out.println(getClass() + " : ADDING ACCOUNT");
	}
}
