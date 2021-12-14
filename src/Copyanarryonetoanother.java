import java.util.Arrays;

public class Copyanarryonetoanother {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6};
		System.out.println(numbers);
		int[] number=numbers;
		for(int result:number) {
		System.out.println(result);
		

}
int[] source= {1,2,3,4,5,6};
int[] destination=new int[6];

for(int i=0;i<source.length;i++) {
	destination[i]=source[i];
	System.out.println(Arrays.toString(destination));
}
}
	}