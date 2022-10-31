public class Program2 {
	public static void main(String[] args) {
		int n = 3;
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
			}
			if (prime == true) {
				System.out.println(n +" is prime");
			} else {
				System.out.println(n +" is not prime");
			}
		}
		int num = 5;
		if (num % 2 == 0) {
			System.out.println(num +" it is even number");
		} else {
			System.out.println(num +" it is odd number");
		}
	}
}
