package task4;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean isTrue = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num:");
			String num = scan.nextLine();		
		    String strArr[] = num.split("");
		     int numArr[] = new int[strArr.length];
		        for (int i = 0; i < strArr.length; i++) {
		            numArr[i] = Integer.parseInt(strArr[i]);
		        }
		      for (int i = 0; i < strArr.length-1; i++) {
		        if (numArr[i] == numArr[i+1]) {
		        	System.out.println("True");
		        	isTrue = true;
		        	break;
		        }
		  
		        }
		      if (isTrue == false) {
		    	  if (numArr[0] == numArr[2] || numArr[0] == numArr[3] || numArr[1] == numArr[3]) {
		    		  System.out.println("True");
		      }
		    	  else {
		    		  System.out.println("False");
		    	  }
		      }
		}
}
