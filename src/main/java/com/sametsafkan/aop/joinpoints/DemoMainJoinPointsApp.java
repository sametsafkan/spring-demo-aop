package com.sametsafkan.aop.joinpoints;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMainJoinPointsApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		System.out.println("\nAccount adding...");
		AccountDAO accountDao = context.getBean(AccountDAO.class);
		accountDao.addAccount(new Account(), true);
		System.out.println("\nMembership Account Adding...");
		MembershipDAO membershipDao = context.getBean(MembershipDAO.class);
		membershipDao.addAccount();
		System.out.println("\nMembership Adding...");
		membershipDao.addMembership();
		
		membershipDao.setMembershipNumber(123);
		System.out.println(membershipDao.getMembershipNumber());
		context.close();
	}

}
