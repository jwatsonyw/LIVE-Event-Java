package lab3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int age = getInt("How old are you");
		System.out.println(age);
	}
	public static int getInt(String prompt){
		System.out.printf(prompt + ": ");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

}
