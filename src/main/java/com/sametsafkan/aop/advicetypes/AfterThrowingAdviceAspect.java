package com.sametsafkan.aop.advicetypes;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowingAdviceAspect {

	private Logger logger = Logger.getLogger(getClass().getName());

	@Pointcut("execution(* com.sametsafkan.aop.advicetypes.AccountDAO.delete())")
	public void forDeleteAccount() {}
	
	@AfterThrowing(pointcut = "forDeleteAccount()", throwing = "ex")
	public void afterThrowingDeleteAccount(JoinPoint joinpoint, Throwable ex) {
		logger.warning(ex.toString());
	}
}
