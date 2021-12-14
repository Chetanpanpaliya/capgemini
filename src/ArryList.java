
public class ArryList {

	public static void main(String[] args) {
		int[] age  = {12,24,36,5,6,710,10};

		/*System.out.println();
		
		for(int i=0;i<age.length;i++);
		System.out.println(age{i});
	}
}*/
int sum=0;
double average;
for(int result:age) {
	sum +=result;
	//System.out.println("Sum of numbers :" + sum);
}
int arraylength=age.length;
	average=((double)sum/(double)arraylength);
	System.out.println("Average of numbers :" + average);
	System.out.println("Sum of numbers :" + sum);
}
}

