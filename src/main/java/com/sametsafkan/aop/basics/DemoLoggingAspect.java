package com.sametsafkan.aop.basics;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

	@Pointcut("execution(* com.sametsafkan.aop.basics.*DAO.*(..))")
	public void forAddAccount() {}
	
	@Pointcut("execution(* com.sametsafkan.aop.basics.*.get*(..))")
	public void forAddAccountGetter() {}
	
	@Pointcut("execution(* com.sametsafkan.aop.basics.*.set*(..))")
	public void forAddAccountSetter() {}
	
	//@Before("execution(public void addAccount())")
	//@Before("execution(public void com.sametsafkan.aop.AccountDAO.addAccount())")
	//@Before("execution(public * add*())")
	//@Before("execution(public * add*(com.sametsafkan.aop.Account))")
	//@Before("execution(public * add*(com.sametsafkan.aop.Account,..))")
	@Before("forAddAccount()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n==========> Executing @Before advice on addAccount method.");
	}
	
	@Before("forAddAccount()")
	public void forApiAnalytics() {
		System.out.println("\n==========> Analiyzing API...");
	}
	
	@Before("forAddAccount() && !(forAddAccountGetter() || forAddAccountSetter())")
	public void forLogging() {
		System.out.println("\n==========> Loging the method");
	}
}
