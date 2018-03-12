//rotate image or matrix -but not in-place
import java.util.Arrays;

public class Sum17_G{
	public static void RotateMatrix(int[][] image) {
		
		int lenImage=image.length;
		int[][] rotateImage=new int[lenImage][lenImage];
		//System.out.println("Number of rows:"+lenImage);
		for(int i=0; i<lenImage; i++) {
			//int lenCol=image[i].length;
			//System.out.println("Number of column:"+lenCol);
			for(int j=0; j<lenImage; j++) {
				//System.out.println("Elements:"+image[i][j]);
				rotateImage[lenImage-j-1][i]=image[i][j];
				//System.out.println("Elements:"+rotateImage[lenCol-j-1][i]);
			}
			
		}
		
		System.out.println(Arrays.deepToString(rotateImage).replace("], ", "]\n"));
		
	}
	public static void main (String[] args) {
		int[][] image= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.deepToString(image).replace("], ", "]\n"));
		System.out.println("If the given matrix is rotated by 90 degree then the output is ");
		RotateMatrix(image);
		
	}
}