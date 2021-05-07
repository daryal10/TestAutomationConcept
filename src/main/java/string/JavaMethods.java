package string;

public class JavaMethods {

	// 1.sum
	public int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

//2.subtract
	public int subtract(int num1, int num2) {
		int diff = num1 - num2;
		return diff;
	}

	// 3.division
	public int division(int num1, int num2) {
		int divide = num2 / num1;
		return divide;
	}

	// 4.remainder
	public int rem(int num1, int num2) {
		int remainder = num2 % num1;
		return remainder;
	}

	// 5. is prime
	public boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}

	// 6. prime series
	public void getPrimeNumbers(int num) {
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Primenumber count: " + count);
	}

	// 7. fibonacci series of n numbers
	public void fibonacciseries(int num) {
		int num1 = 0;
		int num2 = 1;
		int sum;

		System.out.print(num1 + " " + num2 + " ");

		for (int i = 2; i < num; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(num2 + " ");

		}
		System.out.println();
	}

	// 8. number divisible by 3 & 5.
	public void divisibleByThreeAndFive(int num) {
		for (int i = 1; i < num; i++) {
			if (num / 3 == 0 && num / 5 == 0) {
				System.out.print(num + " ");
			}
		}
	}

	// sum of natural numbers
	public void sumNatural(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum from 0 to " + n + " : " + sum);
	}

	// 10. Factorial number
	public void findfactorial(int n) {
		int fact = 1;
		if (n == 0) {
			// System.out.println("factorial is 1");

		}

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + n + "  : " + fact);
	}

	// 11.Reverse String
	public void reverseString(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverser of : " + str + " :  is  " + rev);

		if (str.equalsIgnoreCase(rev)) {
			System.out.println(str + " is palindrome");
		} else
			System.out.println(str + " is not a palindrome");
	}

	// 12. Reverse Number

	public void revNum(int n) {
		int temp = n;
		int rev = 0;
		int rem;
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println("Reverse of: " + temp + "  : " + rev);
	}

	// 13.check Armstrong number
	public void checkArmstrong(int num) {
		int cube;
		int total = 0;
		int temp = num;
		while (num != 0) {
			cube = num % 10;
			total = total + cube * cube * cube;
			num = num / 10;
		}
		if (total == temp) {
			System.out.println(temp + " is Armstrong");
		} else
			System.out.println(temp + " is not Armstrong");

	}

	// 14.digit count
	public void digitCount(int a) {
		int count = 0;
		while (a != 0) {
			++count;
			a = a / 10;
		}
		System.out.println("DigitCount is: " + count);
	}

	// 15.swap number
	public void swapString(String st1, String st2) {
		st2=st1+st2;
		st2=st1.substring(st1.length());
		
		
	}

	// 16. factorial by recursive model

	// main method
	public static void main(String[] args) {

		JavaMethods jm = new JavaMethods();
		boolean b = jm.isPrime(0);
		System.out.println(b);// false
		System.out.println(jm.isPrime(1));// false
		System.out.println(jm.isPrime(2));// true
		System.out.println(jm.isPrime(3));// true
		System.out.println(jm.isPrime(4));// false
		System.out.println(jm.isPrime(5));// true
		System.out.println(jm.isPrime(6));// false
		System.out.println(jm.isPrime(7));// true
		System.out.println(jm.isPrime(8));// false

		jm.getPrimeNumbers(20);
		jm.getPrimeNumbers(102);

		jm.fibonacciseries(10);
		jm.fibonacciseries(25);

		jm.divisibleByThreeAndFive(10);
		jm.divisibleByThreeAndFive(50);
		jm.divisibleByThreeAndFive(100);

		jm.sumNatural(10);
		jm.sumNatural(50);
		jm.sumNatural(100);

		jm.findfactorial(0);
		jm.findfactorial(5);
		jm.findfactorial(6);

		jm.reverseString("HelloShyam");
		jm.reverseString("purusuttom");
		jm.reverseString("madam");

		jm.revNum(1);
		jm.revNum(112);
		jm.revNum(10010001);
		jm.revNum(12345);

		jm.checkArmstrong(0);
		jm.checkArmstrong(1);
		jm.checkArmstrong(153);
		jm.checkArmstrong(370);
		jm.checkArmstrong(371);
		jm.checkArmstrong(407);
		jm.checkArmstrong(112);
		jm.checkArmstrong(-1);
		jm.checkArmstrong(-153);

	}
}
