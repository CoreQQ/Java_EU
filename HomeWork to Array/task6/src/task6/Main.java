package task6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> numArr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.print("Input num - ");
			int num = sc.nextInt();
			numArr.add(num);
		}
		int max = 0;
		for(int i = 0; i < numArr.size(); i++) {
			if(max < numArr.get(i)) {
				max = numArr.get(i);
			}
		}
		System.out.println("Result - " + max);
	}
	
}
