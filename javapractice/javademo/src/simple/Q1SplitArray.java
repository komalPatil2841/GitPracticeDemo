package simple;
import java.util.Arrays;
public class Q1SplitArray {

	public static void main(String[] args) {
		
		int []array = {58,24,13,15,63,9,8,81,1,78};
		int n=array.length;
		int Array1[] =Arrays.copyOfRange(array,0,n/2);
		int Array2[] =Arrays.copyOfRange(array,n/2,n);
		System.out.println(Arrays.toString(Array1));
		System.out.println(Arrays.toString(Array2));
	
	}
	
	

}
