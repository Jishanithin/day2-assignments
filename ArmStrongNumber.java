package week1.day2;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int calc = 0, original, remainder;
		int num = 153;
		original = num;

		while (num > 0) {
			remainder = num % 10;
			calc = calc + (remainder * remainder * remainder);
			num = num / 10;
		}
		if (original == calc)

			System.out.println(original + "is a ARMSTRONG NUMBER");

		else
			System.out.println(original + "is not a armstrong number");

	}

}
