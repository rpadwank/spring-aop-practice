package com.capgemini.Calculator.aspects;

import org.springframework.stereotype.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.*; 

@Component
@Aspect
public class ValidationAspects{

	/*@Around("execution(* com.capgemini.calculator.service.impl.CalculatorImpl.add(..))")
	public void addValidation(ProceedingJoinPoint pjp)throws Throwable
	{	
		Object[] args = pjp.getArgs();
		pjp.proceed();
		Integer arg1 = Integer.parseInt(args[0].toString());
		Integer arg2 = Integer.parseInt(args[1].toString());
		
		System.out.println("arg1= "+arg1+"\targ2= "+arg2);
	}

	@Around("execution(* com.capgemini.calculator.service.impl.CalculatorImpl.divide(..))")
	public void divideValidation(ProceedingJoinPoint pjp)throws Throwable
	{	
		Object[] args = pjp.getArgs();
		pjp.proceed();
		Double arg1 = Double.parseDouble(args[0].toString());
		Double arg2 = Double.parseDouble(args[1].toString());

		System.out.println("arg1= "+arg1+"\targ2= "+arg2);
	}*/

	/*@After("execution(* com.capgemini.calculator.service.impl.CalculatorImpl.divide(..))")
	public void divideValidation()
	{	
		System.out.println("inside before divide");
	}

	@After("execution(* com.capgemini.calculator.service.impl.CalculatorImpl.add(..))")
	public void addValidation()throws Throwable
	{	
		System.out.println("inside before");
	}*/

	/*@AfterReturning(pointcut="execution(* com.capgemini.calculator.service.impl.CalculatorImpl.add(..))", returning="retVal")
    	public void addValidation(Object retVal) 
	{
		System.out.println(Integer.parseInt(retVal.toString()));
	}*/
	@AfterThrowing (pointcut="execution(* com.capgemini.calculator.service.impl.CalculatorImpl.divide(..))", throwing = "ex")
    	public void logThrowAdd(JoinPoint joinpoint, Throwable ex) throws Throwable  
	{
		System.out.println("exception");
	}
}