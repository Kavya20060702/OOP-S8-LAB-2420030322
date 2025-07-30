package lab1;

import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Fahrenheit;
		System.out.println("Enter the temperature: ");
		Scanner sc=new Scanner(System.in);
		Fahrenheit=sc.nextInt();
		int Celsius=(Fahrenheit-32)*5/9;
		System.out.println("The temperature in Celsius= "+Celsius);
		}


}


