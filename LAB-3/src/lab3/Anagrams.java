package lab3;

import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the 2nd string: ");
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not an Anagram");
        } else {
            boolean[] matched = new boolean[str2.length()];
            boolean isAnagram = true;

            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);
                boolean found = false;

                for (int j = 0; j < str2.length(); j++) {
                    if (ch == str2.charAt(j) && !matched[j]) {
                        matched[j] = true; 
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                System.out.println("They are Anagrams");
            } else {
                System.out.println("They are not Anagrams");
            }
        }
    }
}
