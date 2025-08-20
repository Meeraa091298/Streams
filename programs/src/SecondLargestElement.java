import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {45,76,90, 90,23,26,19,66};
		int result = Arrays.stream(arr1)
				.boxed().distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst().orElseThrow(() -> new IllegalArgumentException("No elemenet found"));
		
		System.out.println(result);
				}

}
