package com.arun.string;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sbuild = new StringBuilder("Hello, Everyone!");
		
		System.out.println("Builder String : " + sbuild);
		
		StringBuilder sbuild1 = new StringBuilder("Hello");
		StringBuilder sbuild2 = new StringBuilder("Welcome to the world of coding.");
		
		int compare1 = sbuild.compareTo(sbuild1);
		int compare2 = sbuild.compareTo(sbuild2);
		
		sbuild.deleteCharAt(9);
		
		boolean empty = sbuild.isEmpty();
		
		System.out.println("Builder String after deletion at index 9 : " + sbuild 
						+ "\nComparison with " + sbuild1 + " : " + compare1 
						+ "\nComparison with " + sbuild2 + " : " + compare2 
						+ "\nIs the string empty? " + empty);

	}

}
