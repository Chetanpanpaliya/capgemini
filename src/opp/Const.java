package opp;
class computer{
	int i;
	private computer() {
		i=5;
		System.out.println("This is no argconstructor....");
		computer object=new computer();
		System.out.println(object.i);
	}
	
}
class publicConst{
	int stats;
	public publicConst() {
		stats=100;
		System.out.println("This is no age public const");
	}


public publicConst(String language,int number) {
	language="java";
	System.out.println("lang is :"+  language + "is eay");
	System.out.println("Eneter number is "+ number);
}
}
public class Const {

	public static void main(String[] args) {
	publicConst obj=new publicConst("java",10);
		System.out.println("Value of stats is:"+ obj.stats);
	}

}

