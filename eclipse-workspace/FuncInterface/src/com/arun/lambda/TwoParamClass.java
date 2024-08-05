package com.arun.lambda;

public class TwoParamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoParamInterface tw = (x,y) -> (x+y);
		
		System.out.println(tw.add(10,24));
	}

}
