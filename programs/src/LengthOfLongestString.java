import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class LengthOfLongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"apple", "banana", "cherry", "date","Muskmelon"};
		Integer length = Arrays.stream(arr).sorted(Comparator.comparing(String::length).reversed())
				.findFirst().map(String::length).orElse(0);
		Integer length1 = Arrays.stream(arr).mapToInt(String::length).max().orElse(0);
		System.out.println("longest length is " + length1);
		System.out.println(length);
	
	}

}
