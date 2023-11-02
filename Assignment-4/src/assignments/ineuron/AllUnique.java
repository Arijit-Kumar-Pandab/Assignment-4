// Question 7 :- WAP to find if String contains all unique characters.

package assignments.ineuron;

public class AllUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcdefg";
		String str2 = "abcdEfGhiJKlMNOPqRstuVWXyZ*(*&^*(";
		String str3 = "abceraanjdhs";
		
		if (checkIfAllUnique(str1)) {
			System.out.println("Str1 has all unique characters.");
		} else {
			System.out.println("Str1 contains duplicate characters.");
		}
		
		if (checkIfAllUnique(str2)) {
			System.out.println("Str2 has all unique characters.");
		} else {
			System.out.println("Str2 contains duplicate characters.");
		}
		
		if (checkIfAllUnique(str3)) {
			System.out.println("Str3 has all unique characters.");
		} else {
			System.out.println("Str3 contains duplicate characters.");
		}
	}
	
	private static boolean checkIfAllUnique(String str) {
		int[] check = new int[256];
		for(char ch : str.toCharArray()) {
			check[ch]++;
		}
		for (int i = 0; i < check.length; i++) {
			if (check[i] > 1) {
				return false;
			}
		}
		return true;
	}

}
