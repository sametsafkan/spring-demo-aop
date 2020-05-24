package com.sametsafkan.aop.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class DemoLoggingAspect {

	@Before("com.sametsafkan.aop.order.AopPointcutDeclarations.forAddAccount()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n==========> Executing @Before advice on addAccount method.");
	}
}
