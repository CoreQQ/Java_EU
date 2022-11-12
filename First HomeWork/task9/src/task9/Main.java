package task9;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int num_int = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num: ");
		String num = scan.nextLine();
		String strArr[] = num.split("");
		int numArr[] = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			numArr[i] = Integer.parseInt(strArr[i]);
		}
		num_int = Integer.parseInt(num);
		for (int i = 0; i < strArr.length; i++) {
			if (num_int % numArr[i] == 0) {
				System.out.println(num_int + " divide " + numArr[i]);
			}
			else {
				System.out.println(num_int + " NOT divide " + numArr[i]);
			}
		}
	}

}
