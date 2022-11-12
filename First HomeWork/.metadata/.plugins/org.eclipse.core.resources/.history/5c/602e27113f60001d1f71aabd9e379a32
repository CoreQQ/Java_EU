package task11;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num: ");
        String num = scan.nextLine();
        String strArr[] = num.split("");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(numArr);
        int intArr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            intArr[i] = numArr[i + 2];
        }
        System.out.println(intArr[2] + "" + intArr[1] + "" +intArr[0]);
    }
	
}
