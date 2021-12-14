package Javaconditionalstatements;
import java.util.Scanner;
public class Reversestring {

public static void main(String[] args) {
		// TODO Auto-generated method stub
String original_string, reverse_string=" ";
System.out.println("Enter string");
Scanner string=new Scanner(System.in);
original_string=string.nextLine();
int length=original_string.length();
for(int i=length-1;i>=0;i--)
{
	reverse_string = reverse_string+original_string.charAt(i);

}
System.out.println(reverse_string);
string.close();
	}

}
