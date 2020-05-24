package com.sametsafkan.aop.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class CloudLogAsyncAspect {
	
	@Before("com.sametsafkan.aop.order.AopPointcutDeclarations.forAddAccount() && "
			+ "!(com.sametsafkan.aop.order.AopPointcutDeclarations.forAddAccountGetter() || "
			+ "com.sametsafkan.aop.order.AopPointcutDeclarations.forAddAccountSetter())")
	public void forCloudLogging() {
		System.out.println("\n==========>Cloud Loging the method");
	}
}
