package com.arun.lambda;

public class LambdaExprWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WelcomeInterface s1 = (name) -> {
			return "Hello " + name;
		};
		
		System.out.println(s1.say("Amit"));
	}

}
