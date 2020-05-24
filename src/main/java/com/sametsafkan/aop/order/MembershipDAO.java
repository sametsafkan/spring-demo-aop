package com.sametsafkan.aop.order;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	private int membershipNumber;
	
	public void addAccount() {
		System.out.println("Adding membership account....");
	}
	
	public boolean addMembership() {
		System.out.println("Adding new membership...");
		return true;
	}

	public int getMembershipNumber() {
		System.out.println("Getting membership numnber " + this.membershipNumber);
		return membershipNumber;
	}

	public void setMembershipNumber(int membershipNumber) {
		System.out.println("Setting membership number " + membershipNumber);
		this.membershipNumber = membershipNumber;
	}
}
