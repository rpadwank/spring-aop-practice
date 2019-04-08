package com.capgemini.calculator.service.impl;

import com.capgemini.calculator.service.Calculator;
import org.springframework.stereotype.*; 

@Component("calculatorImpl")
public class CalculatorImpl implements Calculator{

	public void add(Integer num1, Integer num2){
		System.out.println(num1+num2);
	}

	public void divide(Double num1, Double num2){
		System.out.println(num1/num2);
	}
}