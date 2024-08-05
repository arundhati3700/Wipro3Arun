package corejava_30Jul;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		
		int i,j,k;
		k = rows -1;
		
		for(i=1;i<=rows;i++) {
			for(j=1;j<=k;j++)
				System.out.print(" ");
			for(j=1;j<(i+1);j++)
				System.out.print("* ");
			System.out.println();
			k--;
		}
		
		k = 1;
		
		for(i=rows-1;i>0;i--) {
			for(j=0;j<k;j++)
				System.out.print(" ");
			for(j=0;j<=(i-1);j++)
				System.out.print("* ");
			System.out.println();
			k++;
		}

	}

}
