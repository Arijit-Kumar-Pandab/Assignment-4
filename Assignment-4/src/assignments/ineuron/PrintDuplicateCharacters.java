// Question 2:- WAP to print Duplicates characters from the String.
package assignments.ineuron;

public class PrintDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdegabc";
		printDuplicates(str);
	}
	
	private static void printDuplicates(String str) {
		int[] chars = new int[256];
		for (char ch : str.toCharArray()) {
			chars[ch]++;
		}
		
		System.out.println("The duplicate characters are :-");
		for (int i = 0;i < chars.length;i++) {
			if (chars[i] > 1) {
				System.out.print((char)i + "\t");
			}
		}
	}

}
