package task4;

public class Main {
	
	public static void main(String[] args) {
		int list = 0;
		for(int i = 0; i <= 24; i++) {
			for(int j = 0; j <= 60; j++) {
				if(_controle(i, j)) {
					list +=1;
				} 
			}
		}
		System.out.println("Result is - " + list);
	}
	
	private static boolean _controle(int i, int j) {
		int hour = i/10;
		int h = i%10;
		int minute = j/10;
		int m = j%10;
		if(hour == m && h == minute) {
			return true;
		}
		return false;
	}
	
}
