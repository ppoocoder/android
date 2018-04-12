package com.practice;

public class MathFunction {
	
	public static double prRound(Double targetValue, int sequence) {
		
		double decimal = Math.pow(10, sequence);
		double returnValue = Math.round(targetValue*decimal)/decimal;
		
		return returnValue;
		
	}
		public static void main(String[] args) {
			double testValue = 12.23522;
			double answer = prRound(testValue,2);
			System.out.println("anser IS " + answer);
		}				
	
		
		
		

}
