package lab2;

import java.util.Scanner;

public class GCDofANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        int gcd = 1;
        int i = 1;
        while(i <= num1 && i <= num2) {
            if(num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

	}

}
