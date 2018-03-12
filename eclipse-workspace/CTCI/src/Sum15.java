//one edit away
public class Sum15{
	public static void main (String[] args) {
		String s1=new String("pale");
		String s2=new String("ple");
		System.out.println(OneEditAway(s1,s2));
		
		
	}
	public static boolean OneEditAway(String s1, String s2) {
		int count=0;
		int m=s1.length(),n=s2.length();
		int i=0,j=0;
		while(i<m && j<n) {
			if (s1.charAt(i)==s2.charAt(j)) {
				//go to next character as they are same
				i++;
				j++;
			}
			else
			{
				if(m<n) {
					//Element is required to be added so increase index for second string
					j++;
				}
				else if (m>n)
				{//Element is required to be deleted 
					i++;
				}
			}
		}
		return count==1;
		
	}
}
