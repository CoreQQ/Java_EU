package task3;

public class Main {

	public static void main(String[] args) {
			int list = 0;
			for(int i = 0; i<=50000; i++) {
			String num = Integer.toString(i);		
		    String arr[] = num.split("");
		     int nums[] = new int[arr.length];
		        for (int j = 0; j < arr.length; j++) {
		            nums[j] = Integer.parseInt(arr[j]);
		        }
		        for(int j = 0; j < nums.length; j++) {
		        	if (nums[j] == 2) {
		        		list+=1;
		        	}
		 }
			}
			System.out.println("Result - " + list);
	}
	
}
