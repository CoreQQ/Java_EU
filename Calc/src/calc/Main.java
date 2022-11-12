package calc;
import java.lang.String;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static char getOperation(){
			Scanner scan = new Scanner(System.in);
        System.out.println("Enter Operation:");
        char operation;
        if(scan.hasNext()){
            operation = scan.next().charAt(0);
        } else {
            System.out.println("You made a mistake. Try again.");
            scan.next();
            operation = getOperation();
        }
        return operation;
    }
	
	
	    public static int calc(int num1, int num2, char operation){
	        int result;
	        switch (operation){
	            case '+':
	                result = num1+num2;
	                break;
	            case '-':
	                result = num1-num2;
	                break;
	            case '*':
	                result = num1*num2;
	                break;
	            case '/':
	                result = num1/num2;
	                break;
	            case '%':
	                result = num1%num2;
	                break;
	            default:
	                System.out.println("You made a mistake. Try again.");
	                result = calc(num1, num2, getOperation());
	        }
	        return result;
}
	    
	    
	    
		public static void main(String[] args) {
			System.out.println("Enter your name: ");
			Scanner scan = new Scanner(System.in);
			String name = scan.nextLine();
			
			char operation = getOperation();
			
			System.out.println("Enter num1: ");
			int num1 = scan.nextInt();
			System.out.println("Enter num2: ");
			int num2 = scan.nextInt();
			
			int result = calc(num1,num2,operation);
			System.out.println(name);
			System.out.println("Result: " + result);
		}
		
		
}


