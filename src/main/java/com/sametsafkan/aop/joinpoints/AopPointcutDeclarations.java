package com.sametsafkan.aop.joinpoints;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopPointcutDeclarations {

	@Pointcut("execution(* com.sametsafkan.aop.joinpoints.*DAO.*(..))")
	public void forAddAccount() {}
	
	@Pointcut("execution(* com.sametsafkan.aop.joinpoints.*.get*(..))")
	public void forAddAccountGetter() {}
	
	@Pointcut("execution(* com.sametsafkan.aop.joinpoints.*.set*(..))")
	public void forAddAccountSetter() {}
}
