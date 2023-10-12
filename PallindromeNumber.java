package week1.day2;

public class PallindromeNumber {
	public static void main(String[] args) {

		int num = 34343;
		int temp;
		temp = num;
		int rev = 0;
		for (;num!=0;num=num/10) {  
			rev = rev * 10 +num%10; 
		}
		if(temp==rev) {
			System.out.println(temp+ " is a Palindrome Number");
		}

		else {

			System.out.println(temp+ " is a not Palindrome Number");
		}
	}

}

