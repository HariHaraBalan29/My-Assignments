package week1.day2;
import java.util.Arrays;
public class SecondSmallestNumber {
		public static void main(String[] args) {
			int input[]={23,45,67,32,89,22 };
			int len= input.length;
			Arrays.sort(input);
			System.out.println(input[len-2]);
			
		}

	}

