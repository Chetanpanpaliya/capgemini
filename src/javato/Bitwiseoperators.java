package javato;

public class Bitwiseoperators {
	public static void main(String[] args) {
int bitnum=12;
int bitanother=14;

int result;
result=bitnum&bitanother;
System.out.println("Bitwise And operators, value is " + result);
result=bitnum|bitanother;
System.out.println("Bitwise OR operators, value is " + result);
result=bitnum^bitanother;
System.out.println("Bitwise XOR operators, value is " + result);
result=~bitnum;
System.out.println("Bitwise Negation operators, value is " + result);
result=~bitanother;
System.out.println("Bitwise Negation operators, value is " + result);
result=bitnum<<2;
System.out.println("Bitwise leftshift operators, value is " + result);
result=bitnum>>2;
System.out.println("Bitwise rightshift operators, value is " + result);
	}
	}
