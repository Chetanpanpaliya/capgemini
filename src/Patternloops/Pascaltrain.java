package Patternloops;
import java.util.Scanner;

public class Pascaltrain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("Enter number");
		// TODO Auto-generated method stub
for(int i=0; i<=rows;i++) {
	int num=9;
	for(int j=0;j<1;j++) {
		System.out.print(" ");
		
	}
	for(int k=i; k<=rows;k++) {
		System.out.print(num+k + " ");
	}
}
{
	System.out.println("*");

	}
sc.close();
}
}
