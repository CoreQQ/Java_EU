package task7;

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
		
		int min = numArr.get(0);
		for(int i = 0; i < numArr.size(); i++) {
			if(numArr.get(i) %2 ==0 && numArr.get(i) < min) {
				min = numArr.get(i);
			}
		}
		
		System.out.println("Result - %s" + min);
	}
}