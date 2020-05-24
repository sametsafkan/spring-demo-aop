package com.sametsafkan.aop.joinpoints;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class CloudLogAsyncAspect {
	
	@Before("com.sametsafkan.aop.joinpoints.AopPointcutDeclarations.forAddAccount() && "
			+ "!(com.sametsafkan.aop.joinpoints.AopPointcutDeclarations.forAddAccountGetter() || "
			+ "com.sametsafkan.aop.joinpoints.AopPointcutDeclarations.forAddAccountSetter())")
	public void forCloudLogging() {
		System.out.println("\n==========>Cloud Loging the method");
	}
}
