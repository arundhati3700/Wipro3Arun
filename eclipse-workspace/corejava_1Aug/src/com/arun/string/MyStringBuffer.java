package com.arun.string;

public class MyStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer sbuffer = new StringBuffer("Hello, ");
		
		StringBuffer sbuffer = new StringBuffer(50);
		
		//String str = sbuffer;
		//sbuffer.setLength(0);
		
		sbuffer.append("Hello, World.");
		
		//sbuffer.append("World. Welcome to the world of Java.");
		//sbuffer.insert(37, "might");
		//sbuffer.delete(0, 13);
		//sbuffer.reverse();
		
		sbuffer.replace(7, 12, "Everyone");
		
		System.out.println(sbuffer + 
					"\nCapacity : " + sbuffer.capacity() +
					"\nLength : " + sbuffer.length());

	}

}
