package com.sametsafkan.aop.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopPointcutDeclarations {

	@Pointcut("execution(* com.sametsafkan.aop.order.*DAO.*(..))")
	public void forAddAccount() {}
	
	@Pointcut("execution(* com.sametsafkan.aop.order.*.get*(..))")
	public void forAddAccountGetter() {}
	
	@Pointcut("execution(* com.sametsafkan.aop.order.*.set*(..))")
	public void forAddAccountSetter() {}
}
