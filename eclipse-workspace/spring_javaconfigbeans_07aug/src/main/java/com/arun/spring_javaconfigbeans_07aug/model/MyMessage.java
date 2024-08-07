package com.arun.spring_javaconfigbeans_07aug.model;

public class MyMessage {
	private String message;

	public void getMessage() {
		System.out.println("Hi everyone !! " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
