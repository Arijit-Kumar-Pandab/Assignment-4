// Question 1:- WAP to remove Duplicates from a String.(Take any String ex with duplicates
// character)
package assignments.ineuron;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sinstriiintng";
		System.out.println(removeDuplicates(str));
	}
	private static String removeDuplicates(String str) {
		StringBuilder res = new StringBuilder("");
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (res.indexOf(ch + "") == -1) {
				res.append(ch);
			}
		}
		
		return res.toString();
	}

}
