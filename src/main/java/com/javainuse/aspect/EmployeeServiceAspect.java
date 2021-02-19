package com.javainuse.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

	@Around("@within(com.javainuse.annotation.Permission)")
	public Object myAdvicePermission(ProceedingJoinPoint thisJoinPoint) throws Throwable {
		System.out.println(thisJoinPoint);
		System.out.println("  " + thisJoinPoint.getThis());
		return thisJoinPoint.proceed();
	}

	@Around("@within(com.javainuse.annotation.SecurityEnforcer)")
	public Object myAdviceSecurity(ProceedingJoinPoint thisJoinPoint) throws Throwable {
		System.out.println(thisJoinPoint);
		System.out.println("  " + thisJoinPoint.getThis());
		return thisJoinPoint.proceed();
	}
//	@Before("@target(com.javainuse.annotation.Permission)")
//	public void myAdviceSecurity(JoinPoint thisJoinPoint) throws Throwable {
//		System.out.println(thisJoinPoint);
//		System.out.println("  " + thisJoinPoint.getThis());
//		return thisJoinPoint.proceed();
//	}


	@Pointcut("within(@com.javainuse.annotation.Permission *)")
	public void beanAnnotatedWithMonitor() {}

	@Pointcut("execution(public * *(..))")
	public void publicMethod() {}



//	@Before("@target(com.javainuse.annotation.Permission)")
//	public void myAdvice(JoinPoint thisJoinPoint) throws Throwable {
//		System.out.println(thisJoinPoint);
//		System.out.println("  " + thisJoinPoint.getThis());
////		return thisJoinPoint.proceed();
//	}

//	@Before(value = "execution(* com.javainuse.service.EmployeeService.*(..)) and args(name,empId)")
//	public void beforeAdvice(JoinPoint joinPoint, String name, String empId) {
//		System.out.println("Before method:" + joinPoint.getSignature());
//
//		System.out.println("Creating Employee with name - " + name + " and id - " + empId);
//	}
//
//	@After(value = "execution(* com.javainuse.service.EmployeeService.*(..)) and args(name,empId)")
//	public void afterAdvice(JoinPoint joinPoint, String name, String empId) {
//		System.out.println("After method:" + joinPoint.getSignature());
//
//		System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
//	}
}
