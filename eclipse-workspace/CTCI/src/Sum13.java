public class Sum13{
/*public static double sqrt(int number) {
	}*/
public static void main(String[] args) {
	String str = new String("Hello I am");
	System.out.println(str);
	String wrd[]=str.split(" ");
	for (int i=0;i<wrd.length;i++) {
		if(i==wrd.length-1)
		{
			System.out.print(wrd[i]);
		}
		else {
			
	System.out.print(wrd[i] + "%20");
		}
}}
}