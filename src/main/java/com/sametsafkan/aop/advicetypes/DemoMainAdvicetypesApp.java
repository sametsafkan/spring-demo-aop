package com.sametsafkan.aop.advicetypes;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMainAdvicetypesApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO accountDAO = context.getBean(AccountDAO.class);
		List<Account> result = accountDAO.findAccounts();
		result.forEach(a -> System.out.println(a));
		try {
			accountDAO.delete();
		} catch (Exception e) {
		}

		accountDAO.closeAccount(new Account(99));

		boolean r = accountDAO.transferAccount(new Account(100));
		System.out.println(r);
		context.close();
	}
}
