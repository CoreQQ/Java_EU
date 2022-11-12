package task2;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int a, b, c, d, i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = scan.nextInt();
		a = num % 10;
		b = (num / 10) % 10;
		c = (num / 100) %10;
		d = (num / 1000) %10;
		i = (num / 10000) %10;
		if (a == b || b == c || c == d || d == i || a == i) {
			System.out.println("True");
		}
		else if (b == d || b == i || c == a || c == i || a == d) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
			}
		
	}
	
}
