/* File name: MyHealthData.java
 * Author: Polina Debchuk, 041137365
 * Course: CST8284 – OOP
 * Assignment: Assignment1
 * Date: October 13, 2024
 * Professor: Reginald Dyer
 * Purpose: This program maintains important health information about a patient.
 * Class list: [include this only if there is more than one class in the file]
 */

package assignment1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Class <code>MyHealthData</code> is a child class of the class
 * <code>MyHealthDataBase</code>. Note: This class assumes values passed to the set methods are correct.
 */
public class MyHealthData extends MyHealthDataBase {

	/** Patient's first name */
	private String firstName;

	/** Patient's last name */
	private String lastName;

	/** Patient's gender */
	private String gender;

	/** Patient's home address */
	private String homeAddress;

	/** Patient's level of education */
	private String levelOfEdication;

	/** Patient's height, in inches */
	private double height;

	/** Patient's weight, in pounds */
	private double weight;

	/** Patient's date of birth */
	private LocalDate dateOfBirth;

	/**
	 * This is a constructor that receives all instance variables as parameters
	 * 
	 * @param firstName        Patient's first name
	 * @param lastName         Patient's last name
	 * @param gender           Patient's gender
	 * @param homeAddress      Patient's home address
	 * @param levelOfEdication Patient's level of education
	 * @param height           Patient's height, in inches
	 * @param weight           Patient's weight, in pounds
	 * @param dateOfBirth      Patient's date of birth
	 */
	public MyHealthData(String firstName, String lastName, String gender, String homeAddress, String levelOfEdication,
			double height, double weight, LocalDate dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.homeAddress = homeAddress;
		this.levelOfEdication = levelOfEdication;
		this.height = height;
		this.weight = weight;
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * Returns Patient's first name
	 * @return firstName Patient's first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Assigns a value to the Patient's first name
	 * @param name Patient's first name
	 */
	public void setFirstName(String name) {
		this.firstName = name;
	}

	/**
	 * Returns Patient's last name
	 * @return firstName Patient's last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Assigns a value to the Patient's last name
	 * @param name Patient's last name
	 */
	public void setLastName(String name) {
		this.lastName = name;
	}

	/**
	 * Returns Patient's gender
	 * @return gender Patient's gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Assigns a value to the Patient's gender
	 * @param gender Patient's gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Returns Patient's home address
	 * @return homeAddress Patient's home address
	 */
	public String getHomeAddress() {
		return homeAddress;
	}

	/**
	 * Assigns a value to the Patient's home address
	 * @param homeAddress Patient's home address
	 */
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	/**
	 * Returns Patient's level of education
	 * @return levelOfEdication Patient's level of education
	 */
	public String getLevelOfEdication() {
		return levelOfEdication;
	}

	/**
	 * Assigns a value to the Patient's level of education
	 * @param levelOfEdication Patient's level of education
	 */
	public void setLevelOfEdication(String levelOfEdication) {
		this.levelOfEdication = levelOfEdication;
	}

	/**
	 * Returns Patient's height
	 * @return height Patient's height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Assigns a value to the Patient's height
	 * @param height Patient's height
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Returns Patient's weight
	 * @return weight Patient's weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Assigns a value to the Patient's weight
	 * @param weight Patient's weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Returns Patient's date of birth
	 * @return dateOfBirth Patient's date of birth
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * Assigns a value to the Patient's date of birth
	 * @param dateOfBirth Patient's date of birth
	 */
	public void setBirthDay(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * This method displays all the patient's health data and reference information about BMI VALUES
	 */
	public void displayMyHealthData() {
		String dobStr = dateOfBirth.toString();
		int age = this.ageInDays(dateOfBirth);
		int maxHR = this.calculateMaximumHeartRate(dateOfBirth);
		double minTHR = this.calculateMinimumTargetHeartRate(maxHR);
		double maxTHR = this.calculateMaximumTargetHeartRate(maxHR);
		double bMI = this.calculateBMI(weight, height);
		
		System.out.printf("\nALL THE PATIENT's HEALTH DATA:\nFirst name: %s\nLast name: %s\nGender: %s"
				+ "\nHome address: %s\nLevel of Education: %s\nDate of Birth: %s\nHeight = %.1f\nWeight = %.1f"
				+ "\nAge in Days: %d\nMaximum Heart Rate: %d\nMinimum Target Heart Rate: %.1f\nMaximum Target Heart Rate: %.1f"
				+ "\nBMI: %.1f\n\n", firstName, lastName, gender, homeAddress, levelOfEdication, dobStr, height, weight,
				age, maxHR, minTHR, maxTHR, bMI);

		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
	}
}