package lab1;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Morning Shift Earning: ");
        
        int morningShiftEarnings= sc.nextInt();
        System.out.println("Enter Evening Shift Earnings : ");
        int eveningShiftEarnings= sc.nextInt();
        int  totalDailyEarnings= morningShiftEarnings+eveningShiftEarnings;
        
        
        
        System.out.println("The Total Daily Earning is : " +totalDailyEarnings );

	}

}
