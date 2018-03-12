//Arrays and Strings
//Unique Characters
public class Sum11 {
	public static boolean isUniqueword(String str) {
		//find length of string
		int strl=str.length();
		//define array for a-to-z character, if wish to consider Upper case then 256
		boolean[] string_set=new boolean[128];
		for (int i =0;i<strl;i++) {
			//get ASCII value of character
			int val= str.charAt(i);
			if (string_set[val]) {
				return false;
			}
			string_set[val]=true;
			
		}		
		
		return true;
		
	}
	public static void main (String [] args) {
		String[] words= {"12","xxyz","akab"};
		for(int i=0;i<words.length;i++) {
			
			System.out.println(words[i]+":"+isUniqueword(words[i]));
			
		}
		
	}

}