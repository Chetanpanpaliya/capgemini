package Javaconditionalstatements;
import java.util.Scanner;

public class Nstedifelse {

public static void main(String[] args) {
int num1,num2,num3;
Scanner sc=new Scanner(System.in);
num1=sc.nextInt();
System.out.println("The 1st Number is:" + num1);
num2=sc.nextInt();
System.out.println("The 2st Number is:" + num2);
num3=sc.nextInt();
System.out.println("The 3st Number is:" + num3);
sc.close();
if(num1 >= num2) {
	if(num1 >= num3) {
	System.out.println(num1 + ":greater out of num2 and num2");
}
else 
	System.out.println(num3 + ": greater out of num1 and num3");
}
else
	if(num1 >= num3){
		System.out.println(num2 + ": greater out of num1 and num2");
		}//else
			//{System.out.println(num3);}
}
}
