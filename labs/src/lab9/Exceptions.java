package lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Exceptions {


	public static void main(String[] args) {
		try {
			readMyFile("c:\\qa\\tx100\\server.js");
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			return;
		}
		finally {
			System.out.println("Runs no matter what!");  // Death, Tax, Finally!
		}
		
		System.out.println("Doing other things!");
	}


	private static void readMyFile(String fileName) throws IllegalArgumentException
	{
		try {
			File myObj = new File(fileName);


			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
		} catch (Exception e) {
			System.out.println("readMyFile handled the exception");
			throw new IllegalArgumentException("File not found");
		}


	}


}
