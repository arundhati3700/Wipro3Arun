package com.arun.regexp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile(".xx.", Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher("MyxxZ");
		
		System.out.println("Input String Match : " + matcher.matches());

	}

}
