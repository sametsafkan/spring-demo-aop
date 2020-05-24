package com.sametsafkan.aop.advicetypes;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAdviceAspect {

	private Logger logger = Logger.getLogger(getClass().getName());

	@Pointcut("execution(* com.sametsafkan.aop.advicetypes.AccountDAO.closeAccount(com.sametsafkan.aop.advicetypes.Account))")
	public void forCloseAccount() {
	}

	@Pointcut("execution(* com.sametsafkan.aop.advicetypes.AccountDAO.transferAccount(com.sametsafkan.aop.advicetypes.Account))")
	public void forTransferAccount() {
	}

	@Around("forCloseAccount()")
	public void aroundCloseAccount(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long begin = System.currentTimeMillis();
		proceedingJoinPoint.proceed();
		logger.info("Elapsed Time : " + (System.currentTimeMillis() - begin));
	}
	
	@Around("forTransferAccount()")
	public Object aroundTransferAccount(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long begin = System.currentTimeMillis();
		Object result;
		try {
			result = proceedingJoinPoint.proceed();
		}catch (Exception e) {
			logger.warning(e.toString());
			result = false;
		}
		logger.info("Elapsed Time : " + (System.currentTimeMillis() - begin));
		return result;
	}
}
