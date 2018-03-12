import java.util.Arrays;

public class Sum18{
	public static void ReplacewithZero(int[][] image) {
		int lenRow=image.length;
		int lenCol=image[0].length;
		boolean[] row=new boolean[lenRow];
		boolean[] col=new boolean[lenCol];
		for (int i=0;i<lenRow;i++) {
			for (int j=0;j<lenCol;j++) {
				//check which row and column has zero
				if(image[i][j]==0) {
					row[i]=true;
					col[j]=true;
				}
			}
		}//Set zero for the row
				for(int k=0;k<lenRow;k++) {
					if(row[k]) {
						for(int m=0;m<lenCol;m++) {
							image[k][m]=0;
						}
					}
				}//Set zero for the column
				for(int k=0;k<lenCol;k++) {
					if(col[k]) {
						for(int m=0;m<lenRow;m++) {
							image[m][k]=0;
						}
					}
				}		
		System.out.println(Arrays.deepToString(image).replace("], ", "]\n"));	
	}
	
	
	public static void main (String[] args) {
		int[][] image= {{0,2,3,4},{4,5,6,8},{7,8,9,0}};
		System.out.println(Arrays.deepToString(image).replace("], ", "]\n"));
		System.out.println("If zero is assigned to a row and column containing a zero then the output is ");
		ReplacewithZero(image);
	}
}