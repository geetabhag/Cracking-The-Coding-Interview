/*PermutationPalindrome*/
/*Time complexity is O(n)-traverse over string of length n and Space complexity is O(1)
 * there is use of constant space of array of 128 size*/
public class Sum14{
	public static boolean PermutationPalindrome(String str) {
		int[] count_char=new int[128];
		//count number of characters in the input string
		for(int i=0; i < str.length();i++)
		{
			//remove space in the string
			if(str.charAt(i) != ' ') {
			count_char[str.charAt(i)]+=1;	
			}
		}
		int count = 0;
		//check how many characters are in odd count
		for (int i=0;i<count_char.length;i++ ) {
			if (count_char[i]%2!=0) {
				count+=1;
			}}
		
		// return true for count 0 or 1
		return count<2;		
	}
	public static void main (String[] args) {
		String s =new String("Tact Coa");
		
		Boolean check= PermutationPalindrome(s.toLowerCase());
		System.out.println(check);
		
	}
}