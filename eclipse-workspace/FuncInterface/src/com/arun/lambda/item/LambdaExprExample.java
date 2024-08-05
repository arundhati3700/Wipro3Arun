package com.arun.lambda.item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;

public class LambdaExprExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Item> itemList = new ArrayList<Item>();
		
		itemList.add(new Item(1,"Dell Laptop", 80000f));
		itemList.add(new Item(2,"iPhone 15", 91000f));
		itemList.add(new Item(3,"Dell Keyboard", 50000f));
		itemList.add(new Item(4,"HP Pavillion Laptop", 74000f));
		
		System.out.println("List of Items : ");
		
		for(Item i : itemList)
			System.out.println(i);
		
		Collections.sort(itemList, (i1,i2) -> {
			return i1.name.compareTo(i2.name);
		});
		
		System.out.println("List of Items after Sorting : ");
		
		for(Item i : itemList)
			System.out.println(i);
		
		Stream<Item> filteredData = 
				itemList.stream().filter(i -> i.price > 20000f);
		
		System.out.println("List of Items costlier than 20000f: ");
		
		filteredData.forEach(i -> System.out.println(i.name + " " + i.price));
		
		
	}

}
