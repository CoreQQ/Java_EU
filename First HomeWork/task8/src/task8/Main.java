package task8;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num: ");
		String num = scan.nextLine();		
	    String strArr[] = num.split("");
	     int numArr[] = new int[strArr.length];
	        for (int i = 0; i < strArr.length; i++) {
	            numArr[i] = Integer.parseInt(strArr[i]);
	        }
	        for (int i = 0; i < strArr.length; i++) {
	            sum = sum + numArr[i];
	        }
	       if(sum%2 == 0 && sum%3 == 0) {
	    	   System.out.println("True");
	       }
	       else {
	    	   System.out.println("False");
	       }
	}

}
