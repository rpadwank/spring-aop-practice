package com.capgemini.calculator.test;

import org.springframework.context.support.*;
import org.springframework.context.ApplicationContext;
import com.capgemini.calculator.service.*;

public class CalculatorTest{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Calculator calculator = (Calculator)context.getBean("calculatorImpl");
		calculator.add(12,18);
		calculator.divide(15.0,5.0);		
	}
}