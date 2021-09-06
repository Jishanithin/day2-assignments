package week1.day2;

public class palindrome {

	public static void main(String[] args) {
		int num = 454;
		int r, sum = 0;
		int temp;
		temp = num;

		while (num != 0) {
			r = num % 10;
			sum = (sum*10) + r;
			num = num / 10;
		}
		if (temp == sum)
			System.out.println("is  a palindrome");

		else
			System.out.println("is not a palindrome");

	}

}
