/* File name: MyHealthDataBase.java
 * Author: Polina Debchuk, 041137365
 * Course: CST8284 – OOP
 * Assignment: Assignment1
 * Date: October 13, 2024
 * Professor: Reginald Dyer
 * Purpose: This program MyHealthDataBase is a base class to be extended for the digital Health Records System, also known as Assignment 1.
 * Class list: [include this only if there is more than one class in the file]
 */

package assignment1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * <code>MyHealthDataBase</code> is a base class to be extended for the digital
 * Health Records System, also known as Assignment 1. It contains a method to
 * calculate BMI and other methods to calculate data.
 * 
 * @author Polina Debchuk
 * @version 1.1
 * @since Java 1_8.301
 * @see MyHealthData
 */
public class MyHealthDataBase {
	
	/**
	 * This method returns the patient's age in days
	 * 
	 * @param dateOfBirth patient's date of birth
	 * @return age patient's age in days
	 */
	public int ageInDays(LocalDate dateOfBirth) {
	    LocalDate currentDate = LocalDate.now();  
	    long ageInDays = ChronoUnit.DAYS.between(dateOfBirth, currentDate);  // Calculate difference in days
	    return (int) ageInDays; 
	}

	/**
	 * This method returns the patient's age in years
	 * 
	 * @param dateOfBirth patient's date of birth
	 * @return age patient's age in years
	 */
	public int ageInYears(LocalDate dateOfBirth) {
		int currYear = LocalDate.now().getYear();
		int birthYear = dateOfBirth.getYear();
		int age = currYear - birthYear;
		return age;
	}

	/**
	 * This method returns the calculated Body Mass Index (BMI) from data provided.
	 * 
	 * @param weightParam Weight of the patient in pounds.
	 * @param heightParam Height of the patient in inches.
	 * @return calculated BMI
	 */
	public double calculateBMI(double weightParam, double heightParam) {
		return weightParam * 703 / (heightParam * heightParam);
	}
	
	/**
	 * This method convert "date of birth" String data type (that was entered by
	 * user) to LocalDate data type for storing as a MyHealtData instance variable
	 * dateOfBirth.
	 * 
	 * @param dateOfBirthString Patient's date of birth
	 * @return dateOfBirth Patient's date of birth as a LocalDate
	 */
	public static LocalDate convertStringToLocalDate(String dateOfBirthString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString, formatter);
		return dateOfBirth;
	}

	/**
	 * This method returns the maximum heart rate according to patient's age in
	 * years, calculated as 220 - age(in years)
	 * 
	 * @param dateOfBirth patient's date of birth
	 * @return maxHR the maximum heart rate
	 */
	public int calculateMaximumHeartRate(LocalDate dateOfBirth) {
		int maxHR = 220 - this.ageInYears(dateOfBirth);
		return maxHR;
	}

	/**
	 * This method returns patient's minimum target heart rate, calculated as 50% of
	 * maximum heart rate. This is the lowest value of the Target Heart Rate Range.
	 * 
	 * @param maxHeartRate the minimum heart rate calculated as 220 - age (in years)
	 * @return minTHR the minimum target heart rate
	 */
	public double calculateMinimumTargetHeartRate(int maxHeartRate) {
		double minTHR = maxHeartRate * 0.5;
		return minTHR;
	}

	/**
	 * This method returns patient's maximum target heart rate, calculated as 85% of
	 * maximum heart rate. This is the highest value of the Target Heart Rate Range.
	 * 
	 * @param maxHeartRate the maximum heart rate calculated as 220 - age (in years)
	 * @return maxTHR the maximum target heart rate
	 */
	public double calculateMaximumTargetHeartRate(int maxHeartRate) {
		double maxTHR = maxHeartRate * 0.85;
		return maxTHR;
	}

}