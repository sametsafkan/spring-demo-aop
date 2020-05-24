package com.sametsafkan.aop.joinpoints;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class DemoLoggingAspect {

	@Before("com.sametsafkan.aop.joinpoints.AopPointcutDeclarations.forAddAccount()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println("\n==========> Executing @Before advice on addAccount method.");
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method signature : " + methodSignature);
		Object[] args = joinPoint.getArgs();
		for(Object o : args)
			System.out.println("Arg Value : " + o);
	}
}
