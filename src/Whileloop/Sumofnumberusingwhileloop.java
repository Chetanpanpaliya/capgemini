package Whileloop;
import java.util.Scanner;
public class Sumofnumberusingwhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int add=0;
		Scanner input=new Scanner(System.in);
System.out.println("Enter the number :");
int number= input.nextInt();
while(number>=0) {
	add=add+number;
	number--;
	
}System.out.println("Sum of Enter number is:" + add);
input.close();
	}

}
