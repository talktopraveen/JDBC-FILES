public class Program4 {
	public static void main(String[] args) {
		int n = 323;
		int reverse = 0, remainder;
		int original = n;
		while (n != 0) {
			remainder = n % 10;
			reverse = (reverse * 10) + remainder;
			n /= 10;
		}
		if (original == reverse) {
			System.out.println(original + " is palindrome");
		} else {
			System.out.println(original + " is not a palindrome");
		}
	}
}
