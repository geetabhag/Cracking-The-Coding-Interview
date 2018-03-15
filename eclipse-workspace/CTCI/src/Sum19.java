//Check if one string is rotational of other string using IsSubString function

public class Sum19{
	
	public static boolean isSubstring(String s3,String s2) {
		
		if (s3.indexOf(s2)>-1) {
			return true;
		}
		return false;
		
	}
	public static boolean IsRotate(String s1,String s2) {
		String s3=s1+s1;
		if(s1.length()==s2.length() && s1.length()>0 && s2.length()>0) {
			return isSubstring(s3,s2);
		}
		
		return false;
	}
	
	public static void main (String[] args) {
		String s1="waterbottle";
		String s2="erbottlewat";
		System.out.println(s1+" & "+s2+" are rotational string: "+IsRotate(s1,s2));
	}
}