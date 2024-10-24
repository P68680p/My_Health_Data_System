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

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

/**
 * This class is used for JUnit tests for methods: getFirstName(),
 * getLastName(), and calculateBMI(double weightParam, double heightParam).
 * 
 * The calculateBMI(double weightParam, double heightParam) method will be
 * modified and calculated by using the wrong BMI formula: weight / (height * height).
 * This will cause the test to fail. 
 */
public class MyHealthDataTest2 {
	/**
	 * This method is used to test the getFirstName()
	 */
	@Test
	public void jUnitTestGetFirstName() {
		LocalDate myBirthDay = MyHealthData.convertStringToLocalDate("1978/04/14");
		MyHealthData myHD = new MyHealthData("Polina", "Debchuk", "female", "555 Home Street", "master's degree", 66.9,
				123.5, myBirthDay);
		String result = myHD.getFirstName();
		assertEquals("Polina", result);
	}

	/**
	 * This method is used to test the getLastName()
	 */
	@Test
	public void jUnitTestGetLastName() {
		LocalDate myBirthDay = MyHealthData.convertStringToLocalDate("1996/05/18");
		MyHealthData myHD = new MyHealthData("Karl", "Jonson", "male", "777 Home Street", "master's degree", 66.9,
				123.5, myBirthDay);
		String result1 = myHD.getLastName();
		assertEquals("Jonson", result1);
	}

	/**
	 * This method is used to test the calculateBMI(double weightParam, double heightParam).
	 * 
	 *  
	 * Modifications and Assumptions:
	 * 
	 * An intentional error is introduced by using the wrong BMI formula: weight /
	 * (height * height), instead of the correct formula: weight * 703 / (height *
	 * height). This will cause the test to fail.
	 * 
	 * The test assumes the calculateBMI method is correctly implemented using the
	 * proper formula, and the test failure will highlight the discrepancy.
	 * 
	 * A small tolerance of 0.01 is included to account for floating-point
	 * precision, though the test is expected to fail due to the incorrect formula.
	 */
	@Test
	public void jUnitTestBMI() {
		LocalDate myBirthDay = MyHealthData.convertStringToLocalDate("1996/05/18");
		MyHealthData myHD = new MyHealthData("Karl", "Jonson", "male", "777 Home Street", "master's degree", 66.9,
				123.5, myBirthDay);
		double result2 = myHD.calculateBMI(myHD.getWeight(), myHD.getHeight());
		double bmi = 123.5 * 703 / (66.9 * 66.9);
		assertEquals(bmi, result2, 0.01);
	}

}
