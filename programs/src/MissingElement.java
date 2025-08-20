import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 6, 9, 3, 7,1 };
		int[] arr2 = { 3, 5, 8, 1, 4,2 };
		Set<Integer> missingNumber = Arrays.stream(arr1).filter( n1 -> Arrays.stream(arr2).noneMatch( n2-> n2==n1))
				.boxed().collect(Collectors.toSet());
		System.out.println(missingNumber.isEmpty()? "No missing number" :missingNumber );
	}

}
