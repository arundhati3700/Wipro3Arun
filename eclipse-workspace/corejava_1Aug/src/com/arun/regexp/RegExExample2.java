package com.arun.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("xy", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("XYzwxyXZ");
		
		while(matcher.find()) {
			System.out.println("Found the text \"" + matcher.group()
							+ "\" Starting at index " + matcher.start() 
							+ " and ending at index " 
							+ matcher.end());
		}
		
		pattern = Pattern.compile("\\W");
		
		String[] fruits = pattern.split("Apple@Banana$Cherry#Dates$Kiwi");
		
		for(String f : fruits) {
			System.out.println("Split using Pattern.split() : " + f);
		}

	}

}
