package com.sametsafkan.aop.advicetypes;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterAdviceAspect {
	
	private Logger logger = Logger.getLogger(getClass().getName());

	
	@Pointcut("execution(* com.sametsafkan.aop.advicetypes.AccountDAO.delete(..))")
	public void forDeleteAccount() {}
	
	@After("forDeleteAccount()")
	public void afterDeleteAccounts(JoinPoint joinpoint) {
		logger.info("After Deletin Accounts...");
	}

}
