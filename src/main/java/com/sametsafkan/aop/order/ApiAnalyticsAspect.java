package com.sametsafkan.aop.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class ApiAnalyticsAspect {
	
	@Before("com.sametsafkan.aop.order.AopPointcutDeclarations.forAddAccount()")
	public void forApiAnalytics() {
		System.out.println("\n==========> Analiyzing API...");
	}
}
