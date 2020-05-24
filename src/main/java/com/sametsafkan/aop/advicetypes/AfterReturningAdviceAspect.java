package com.sametsafkan.aop.advicetypes;

import java.util.List;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterReturningAdviceAspect {

	private Logger logger = Logger.getLogger(getClass().getName());

	
	@Pointcut("execution(* com.sametsafkan.aop.advicetypes.AccountDAO.findAccounts(..))")
	public void forListAccount() {}
	
	
	@AfterReturning(pointcut = "forListAccount()", returning = "result")
	public void afterReturningListAccount(JoinPoint joinPoint, List<Account> result) {
		logger.info("After Returnin " + joinPoint.getSignature());
		result.forEach(a -> logger.info(a.toString()));
		increaseAccountIds(result);
	}
	
	private void increaseAccountIds(List<Account> accounts) {
		for(Account a : accounts) {
			int id = a.getAccountId();
			a.setAccountId(id+10);
		}
	}
}
