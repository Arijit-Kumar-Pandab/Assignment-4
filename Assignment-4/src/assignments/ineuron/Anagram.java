// Question 5 :- WAP to implement Anagram Checking least inbuilt methods being used.
package assignments.ineuron;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "anagram".toLowerCase();
		String str2 = "nagaram".toLowerCase();
		if (checkAnagram(str1, str2)) {
			System.out.println("The given strings are Anagram.");
		} else {
			System.out.println("The given strings are not Anagram.");
		}
	}
	
	private static boolean checkAnagram(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		sort(ch1);
		sort(ch2);
		
		return isEqual(ch1, ch2);
		
	}
	private static boolean isEqual(char[] ch1, char[] ch2) {
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				return false;
			}
		}
		return true;
	}
	private static void sort(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			for (int j = 1; j < ch.length - 1; j++) {
				if (ch[j] < ch[j - 1]) {
					char temp = ch[j];
					ch[j] = ch[j - 1];
					ch[j - 1] = temp;
				}
			}
		}
	}

}
