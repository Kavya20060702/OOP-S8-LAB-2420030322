package lab2;

import java.util.Scanner;

public class alphabetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=0;
	    System.out.print("Enter a character: ");
	    char ch = sc.next().charAt(0);
	    if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
	    		x=1;
	    }
	    if(x==1) {
	    		System.out.println("It is an alphabet");
	    }else {
	    		System.out.println("It is not an alphabet");
	    }

	}

}
