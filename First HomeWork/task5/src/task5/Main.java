package task5;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		boolean isTrue = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num: ");
		String num = scan.nextLine();		
	    String strArr[] = num.split("");
	     int numArr[] = new int[strArr.length];
	        for (int i = 0; i < strArr.length; i++) {
	            numArr[i] = Integer.parseInt(strArr[i]);
	        }
	      for (int i = 0; i < strArr.length; i++) {
	        if (numArr[i] == 3) {
	        	isTrue = false;
	        	System.out.println("True");
	        	break;
	        }
	      }
	     if(isTrue == true) {
	    	  System.out.println("False");
	      } 
	}
}
