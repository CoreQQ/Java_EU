package task5;

import java.util.Scanner;
import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args) {
		ArrayList<Integer> numArr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i = 0; i < 10; i++) {
			System.out.print("Input num - ");
			int num = sc.nextInt();
			numArr.add(num);
		}
		for(int i = 0; i < numArr.size(); i++) {
			if(numArr.get(i) == 0) {
				for(int j = i+1 ;j < numArr.size(); j++) {
					if(numArr.get(j) == 0) {
						break;
					}
					sum += numArr.get(j);
				}
				break;
			}
		}
		System.out.println("Result - " + sum);
	}

}