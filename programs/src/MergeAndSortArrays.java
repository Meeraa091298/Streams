

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeAndSortArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 2, 6, 9, 3, 7 };
		int[] arr2 = { 3, 5, 8, 1, 4 };

		int[] arr3 = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();

		System.out.println(Arrays.toString(arr3));

	}

}
