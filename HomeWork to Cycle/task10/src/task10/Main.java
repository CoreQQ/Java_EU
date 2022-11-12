package task10;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num: ");
		String num = sc.nextLine();		
	    String arr[] = num.split("");
	     int nums[] = new int[arr.length];
	        for (int i = 0; i < arr.length; i++) {
	            nums[i] = Integer.parseInt(arr[i]);
	        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
        	if(max < nums[i]) {
        		max = nums[i];
        	}
        }
        int list = 0;
        for (int i = 0; i < nums.length; i++) {
        	if(max == nums[i]) {
        		list+=1;
        	}
        }

        System.out.printf("Replit max - " + list);
        
	}
	
}