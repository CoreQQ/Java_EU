package task10;
import java.util.Scanner;


public class Main {

	private static int delete(int a, int  b, int c){
        int result;
        if (a<=b && a > c){
            result = 10 * b + a;
        } else {
            if (b <= a && a <= c) {
                result = 10 * c + a;
            }
            else if (b <= a && a > c) {
                result = 10 * a + c;
            }
            else if (b >= a && c < b) {
                result = 10 * b + c;
            }
            else {
                result = 10 *c + b;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int num_int;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num: ");
        String num = scan.nextLine();
        String strArr[] = num.split("");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++){
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println(delete(numArr[0], numArr[1], numArr[2]));

    }
	
}
