import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "welcome";
		String str = word.toLowerCase();
		String reversed = new StringBuilder(str).reverse().toString();
		if(str.equals(reversed))
		{
			System.out.println("String is a palindrome");
		}
		else
		{
			System.out.println("String is not a palindrome");
		}
		
		
		
		String sentence = "Hello world java";
		String[] str1 = sentence.trim().split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = str1.length-1; i >=0; i--)
		{
			sb.append(str1[i]);
			if(i!=0) sb.append(" ");
		}
		System.out.println(sb.toString());
		
		String sentence1 = "Hello world java";
		String[] str2 = sentence.split(" ");
		StringBuilder sb1 = new StringBuilder();
		for(int i=0; i< str2.length; i++) {
			String reverseWord = new StringBuilder(str2[i]).reverse().toString();
			sb1.append(reverseWord);
			if(i != str2.length -1)
			{
				sb1.append(" ");
			}			
		}
		System.out.println(sb1.toString());
		
	}

}
