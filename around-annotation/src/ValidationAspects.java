package com.capgemini.Calculator.aspects;

import org.springframework.stereotype.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.*; 

@Component
@Aspect
public class ValidationAspects{

	@Around("execution(* com.capgemini.calculator.service.impl.CalculatorImpl.add(..))")
	public void addValidation(ProceedingJoinPoint pjp)throws Throwable
	{	
		Object[] args = pjp.getArgs();
		
		Integer arg1 = Integer.parseInt(args[0].toString());
		Integer arg2 = Integer.parseInt(args[1].toString());
		if(arg1>0 && arg2>0)		
		{
			pjp.proceed();
			System.out.println("Added successfully...");
		}
		else
			System.out.println("addition failed");
	}

	@Around("execution(* com.capgemini.calculator.service.impl.CalculatorImpl.divide(..))")
	public void divideValidation(ProceedingJoinPoint pjp)throws Throwable
	{	
		Object[] args = pjp.getArgs();
		Double arg1 = Double.parseDouble(args[0].toString());
		Double arg2 = Double.parseDouble(args[1].toString());
		if(arg2!=0)
		{
			pjp.proceed();
			System.out.println("Divided successfully...");
		}
		else
			System.out.println("Division failed...");
	}
}