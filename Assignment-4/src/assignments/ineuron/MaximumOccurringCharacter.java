// Question 8:- WAP to find the maximum occurring character in a String.
package assignments.ineuron;

public class MaximumOccurringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbbbbaaacbbbbedeytashj";
		char maxChar = findMaxOccurringChar(str);
		System.out.println("The maximum occurring character is " + maxChar + ".");
	}
	
	private static char findMaxOccurringChar (String str) {
		char maxChar = str.charAt(0);
		int[] count = new int[256];
		for(char ch : str.toCharArray()) {
			count[ch]++;
		}
		
		for (int i = 0; i < count.length; i++) {
			if (count[i] > count[maxChar]) {
				maxChar = (char)i;
			}
		}
		
		return maxChar;
		
	}

}
