package Whileloop;
import java.util.Scanner;
public class Dowhileforsumofpositivenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0,number=0;
Scanner input=new Scanner(System.in);
do {
	sum+=number;
	System.out.println("Enter a number:");
number=input.nextInt();
}while(number>=0);
System.out.println("Sum of number :" + sum);
input.close();
	}

}
