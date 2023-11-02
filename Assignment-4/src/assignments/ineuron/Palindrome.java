
// Question 3:- WAP to check if “2552” is palindrome or not.
package assignments.ineuron;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "2552";
		if (checkPalindrome(str)) {
			System.out.println("The entered string is palindrome.");
		} else {
			System.out.println("The entered string is not palindrome.");
		}
	}
	
	private static boolean checkPalindrome(String str) {
		int start = 0, end = str.length() - 1;
		while (start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			++start;
			--end;
		}
		return true;
	}

}
