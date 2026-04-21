//Minimum of the numbers

package lab4;

public class Program2 {

	public static void main(String[] args) {
	
		
		int[] numbers = {1,3,-5,7,0,4,6,8};
		int min = numbers[1]; //Change to go through numbers
		if(numbers[1] < min)
			min = numbers[0];
	
		
			System.out.println("The minimum number is: " + min);
	}
	
}
