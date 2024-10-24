/* File name: MyHealthDataTest.java
 * Author: Polina Debchuk, 041137365
 * Course: CST8284 – OOP
 * Assignment: Assignment1
 * Date: October 13, 2024
 * Professor: Reginald Dyer
 * Purpose: This program prompt the user for input of the patient's data. Then calculate some additional data related to patient, and then prints all the data.
 * Class list: [include this only if there is more than one class in the file]
 */
package assignment1;

import java.time.LocalDate;
import java.util.Scanner;
/**
 * <code>MyHealthDataTest</code> prompt the user for input of the patient's data. Then calculate some additional data related to patient, and then prints all the data.
 */
public class MyHealthDataTest {
	/**
	 * This is the start point for the program.
	 * @param args Command line arguments are not used by this program. 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first name: ");
		String fn = input.nextLine();
		
		System.out.print("Enter last name: ");
		String ln = input.nextLine();
		
		System.out.print("Enter gender: ");
		String gen = input.nextLine();
		
		System.out.print("Enter home address: ");
		String homeAddr = input.nextLine();
		
		System.out.print("Enter level of education: ");
		String levEdu = input.nextLine();
		
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		input.nextLine();	//clean input buffer after the number was read
		
		System.out.print("Enter date of birth in YYYY/MM/DD: ");
		String birDat = input.nextLine();
		LocalDate lD = MyHealthDataBase.convertStringToLocalDate(birDat);
		
		MyHealthData myData = new MyHealthData(fn, ln, gen, homeAddr, levEdu, height, weight, lD);
		myData.displayMyHealthData();
		
		input.close();	//close Scanner to avoid resource leak
	}

}
