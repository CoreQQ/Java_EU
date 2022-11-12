package task7;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num: ");
		String temp = sc.nextLine();
		String arr[] = temp.split("");
		ArrayList<Integer> num = new ArrayList<Integer>();
		int nums[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
		for(int i = 0; i< nums.length; i++) {
			if (nums[i] != 3 && nums[i] != 8) {
				num.add(nums[i]);
			}
		}
		System.out.println(num);
	}
	
}