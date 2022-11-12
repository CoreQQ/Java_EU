package task12;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a: ");
		float a = sc.nextFloat();
		System.out.print("Input n: ");
		int n = sc.nextInt();
		
		System.out.println("Pow - " + Math.pow(a, n));
		
	}

}