package task3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b, c, d;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = scan.nextInt();
		a = num % 10;
		b = (num / 10) % 10;
		c = (num / 100) %10;
		d = (num / 1000) %10;
		
		if(a == b && b == c) {
			System.out.println("True");
		}
		else if(b == c && c == d) {
			System.out.println("True");
		}
		else if(a == c && c == d) {
			System.out.println("True");
		}
		else if(a == b && b == d) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
