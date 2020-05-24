package com.sametsafkan.aop.advicetypes;

public class Account {
	private int accountId;
	
	public Account() {}
	
	public Account(int accountId) {
		this.accountId = accountId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + "]";
	}
}
