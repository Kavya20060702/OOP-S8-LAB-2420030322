package lab2;

import java.util.Scanner;

public class SUmOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int num = sc.nextInt();
        
        while (num >= 10) { 
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum; 
        }

        System.out.println("The sum of digits to a single digit is: " + num);

	}

}
