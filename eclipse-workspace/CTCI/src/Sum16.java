//String Compression Input: "aabbb" Output: "a2b3"
public class Sum16{
	public static String StringCompression(String s) {
		StringBuilder s1= new StringBuilder();
		int m=s.length();
		int count=0;
		//char c=' ';
		for (int i=0;i<m;i++) {
			count++;
			if(i+1>=m||s.charAt(i)!=s.charAt(i+1)) {
					s1.append(s.charAt(i));
					s1.append(count);
				
				count=0;
			}	
		}
		
		if (s1.length()<=m) {
		return s1.toString();
	}
		else {
			return s;
		}
	}
	
	public static void main (String[] args) {
		String s=new String("aabbbccccc");
		System.out.println(StringCompression(s.toLowerCase()));
	}
}