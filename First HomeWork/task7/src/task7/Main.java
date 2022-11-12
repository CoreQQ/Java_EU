package task7;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int sum, num_int = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num: ");
		String num = scan.nextLine();		
	    String strArr[] = num.split("");
	     int numArr[] = new int[strArr.length];
	        for (int i = 0; i < strArr.length; i++) {
	            numArr[i] = Integer.parseInt(strArr[i]);
	        }
	       num_int = Integer.parseInt(num);
	       sum = (numArr[0] * numArr[0] * numArr[0]) + (numArr[1] * numArr[1] * numArr[1]) + (numArr[2] * numArr[2] * numArr[2]);
	       if(num_int == sum) {
	    	   System.out.println("True");
	       }
	       else {
	    	   System.out.println("False");
	       }
	}

}
