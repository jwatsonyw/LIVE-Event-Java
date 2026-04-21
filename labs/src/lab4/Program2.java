//Minimum of the numbers

package lab4;

public class Program2 {

	public static void main(String[] args) {
	int[] numbers = {1,3,-5,7,0,4,6,8};
		
		int sum = 0;
		for(int number : numbers) {
		sum += number;
	}
		double average = (double)sum / numbers.length;
		System.out.println("The average is: " + average);
	}

}