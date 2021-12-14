package Patternloops;

import java.util.Scanner;

public class Piramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows:");
int rows=sc.nextInt();		
for(int i=rows;i<=0;i--) {
	System.out.println(" ");
	for(int j=0;j<=1;j++) {
		System.out.println("*");
	}
	System.out.println("*" + " ");
}
sc.close();
	}

}
