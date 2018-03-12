import java.util.Arrays;

//rotate matrix but matrix must be in-place.
public class Sum17{
	public static void RotateMatrixInplace(int[][] image) {
		int lenImage=image.length;
		for (int i=0;i<lenImage/2;i++){
			for (int j=i;j<lenImage-i-1;j++) {
				int temp=image[i][j];//save first element of first column;
				image[i][j]=image[j][lenImage-i-1];
				image[j][lenImage-i-1]=image[lenImage-i-1][lenImage-j-1];
				image[lenImage-i-1][lenImage-j-1]=image[lenImage-j-1][i];
				image[lenImage-j-1][i]=temp;			
				
			}
			
		}
		
		System.out.println(Arrays.deepToString(image).replace("], ", "]\n"));
		
		
	}
	public static void main (String[] args) {
		int[][] image= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.deepToString(image).replace("], ", "]\n"));
		System.out.println("If the given matrix is rotated by 90 degree then the output is ");
		RotateMatrixInplace(image);
	}
}