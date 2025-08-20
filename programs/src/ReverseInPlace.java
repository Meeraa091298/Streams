import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseInPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 6, 9, 3, 7,1 };
		IntStream.range(0, arr1.length/2).forEach( i -> {
			int temp = arr1[i];
			arr1[i] = arr1[arr1.length-i-1];
			 arr1[arr1.length-i-1] = temp;		
		});
            System.out.print(Arrays.toString(arr1));      
	}

}
