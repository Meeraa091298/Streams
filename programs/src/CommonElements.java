import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 6, 9, 3, 7,1 };
		int[] arr2 = { 3, 5, 8, 1, 4,2 };
		
		List<Integer> arr3 = Arrays.stream(arr1)
				.filter(n1-> Arrays.stream(arr2).anyMatch(n2 -> n2==n1)).boxed().collect(Collectors.toList());
		
		System.out.println(arr3);
		}
}

