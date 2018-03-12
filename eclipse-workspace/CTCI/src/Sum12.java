//Arrays and Strings
//Anagram/ Permutation

import java.util.Arrays;

public class Sum12{
	public static boolean isPermutation(String[] str) {
		//we can just write return to reduce code
			if(sorts(str[0]).equals(sorts(str[1]))) {
				return true;
			}
		return false;
	}
	public static String sorts(String word) {
		char[] chrs=word.toCharArray();
		Arrays.sort(chrs);
		String content= new String(chrs);
		//System.out.println(content);
		return content;
		
	}
	public static void main(String[] args) {
		String[] words= {"abc","cabd"};
		System.out.println(words[0]+" & "+words[1]+" is permutation/anagram strings : "+isPermutation(words));
	}
}