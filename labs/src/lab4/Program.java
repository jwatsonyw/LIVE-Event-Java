//Sum (+) of all the numbers
package lab4;

public class Program {

	public static void main(String[] args) {
		int[] numbers = {1,3,-5,7,0,4,6,8};
		
		int total = 0;
		for(int number : numbers) {
		total += number;
	}
		System.out.println(total);
	}

}
