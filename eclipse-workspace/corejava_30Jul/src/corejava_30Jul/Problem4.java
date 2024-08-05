package corejava_30Jul;

import java.util.Scanner;

public class Problem4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		
		int i,j;
		
		for(i=1;i<=rows;i++) {
			for(j=rows;j>i;j--)
				System.out.print(" ");
			System.out.print("*");
			for(j=1;j<(i-1)*2;j++)
				System.out.print(" ");
			if(i==1)
				System.out.println();
			else
				System.out.println("*");
		}
		
		for(i=rows-1;i>=1;i--) {
			for(j=rows;j>i;j--)
				System.out.print(" ");
			System.out.print("*");
			for(j=1;j<(i-1)*2;j++)
				System.out.print(" ");
			if(i==1)
				System.out.println();
			else
				System.out.println("*");
		}
	}
}
