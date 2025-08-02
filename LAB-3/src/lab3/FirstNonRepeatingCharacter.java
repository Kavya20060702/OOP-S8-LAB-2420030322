package lab3;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=sc.nextLine().toLowerCase();
		int[] freq=new int[30];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				freq[ch-'a']++;
			}
		}
		boolean found=false;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z' && freq[ch-'a']==1) {
				System.out.println("First non-repating character: "+ch);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("No non-repeating characters found");
		}
		
		

	}

}
