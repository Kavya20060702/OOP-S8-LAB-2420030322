package lab2;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the character :");
		boolean x=false;
		int ch=sc.next().charAt(0);
		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='U')||(ch=='O')||(ch=='I')||(ch=='E')||(ch=='A')) {
			x=true;
		}
		if(x==true) {
			System.out.println("It is a vowel");
		}else {
			System.out.println("It is a consonant");
		}

	}

}
