// Question 6 :- WAP to implement Pangram Checking with least inbuilt methods being used.
package assignments.ineuron;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The quick brown fox jumps over the lazy dog";
		if (isPangram(str)) {
			System.out.println("The given string is a pangram.");
		} else {
			System.out.println("The given string is not Pangram.");
		}
		
		String str2 = "The quick brown fox jumps over the lazy cow";
		if (isPangram(str2)) {
			System.out.println("The given string is a pangram.");
		} else {
			System.out.println("The given string is not Pangram.");
		}
	}
	
	private static boolean isPangram(String str) {
		int[] check = new int[26];
		for(char ch : str.toCharArray()) {
			if (ch >= 'A' && ch <='Z') {
				check[ch - 65]++;
			} else if (ch >= 'a' && ch <='z') {
				check[ch - 97]++;
			}
		}
		for(int i = 0;i < check.length - 1;i++) {
			if (check[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
