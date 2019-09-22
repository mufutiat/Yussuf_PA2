package Yussuf_p2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		   double BMI = 0;

		   System.out.print("In order to calculate your BMI (Body Mass Index), please choose '1' for pounds/inches or '2' for kilograms/meters :");
		   int choice = scnr.nextInt();
		   
		   if(choice == 1) {
			   System.out.print("Please enter weight in pounds :");
			   double weight = scnr.nextDouble();
	           System.out.print("Please enter height in feet :");
	           double height = scnr.nextInt();
	           System.out.print("inches :");
	           double inches = scnr.nextInt();
	           height = height*12 + inches;
	           BMI = (703 * weight/height/height);

		   }
		   else if(choice == 2) { 
			   System.out.print("Please enter weight in Kg :");
			   double weight = scnr.nextDouble();
	           System.out.print("Please enter height in meters :");
	           double height = scnr.nextDouble();
	           BMI = weight/(Math.pow(height, 2));
		   }
		   
		   
		   System.out.printf("Your BMI is %.1f\n", BMI);
		   
		   if (BMI < 18.5) {
	           System.out.println("BMI is less than 18.5 (Underweight)");
	       } else if (BMI >= 18.5 && BMI <= 24.9) {
	           System.out.println("BMI is between 18.5 and 24.9 inclusive (Normal)");
	       } else if (BMI >= 25 && BMI < 30) {
	           System.out.println("BMI is between 25 and 29.9 inclusive (Overweight)");
	       } else {
	           System.out.println("BMI exceeds 30 (Obese)");
	       }
		   

	}

}
