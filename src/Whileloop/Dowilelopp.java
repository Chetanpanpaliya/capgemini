package Whileloop;

public class Dowilelopp {

	public static void main(String[] args) {
	int i=1,n=5;
	do {
		System.out.println(i);
		i++;
		if(i<0)
			break;
		else if (i==4)
			continue;
	}while(i<=5);{
		System.out.println("While block is true:" );
	}

	}

}
