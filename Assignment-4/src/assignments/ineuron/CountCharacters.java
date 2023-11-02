// Question 4:- WAP to count the number of consonants, vowels, special characters in a String.
package assignments.ineuron;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "jbashagu&^$#^&*abscec*&^aeioubhdwk^^^)(";
		countCharacters(str);

	}
	private static void countCharacters(String str) {
		int vowels = 0, consonants = 0, specialChar = 0;
		for (char ch : str.toCharArray()) {
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				if (isVowel(ch)) {
					++vowels;
				} else {
					++consonants;
				}
			} else {
				++specialChar;
			}
		}
		
		System.out.println("The numbers of Vowels are " + vowels + ", Consonants are " + consonants + ", Special characters are " + specialChar + ".");
	}
	private static boolean isVowel(char ch) {
		return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
				|| ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

}
