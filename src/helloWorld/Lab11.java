package helloWorld;

public class Lab11 {
	public static void main(String[] args) {
		System.out.println("-----Return Value Method-----");
		int a = 2;
		int b = 3;
		int c = 10;
		int result = multiply(a, b, c);
		System.out.println("The multiply result of " + a + " , " + b + " , " + c + " = " + result);
		
		System.out.println("-----Void Method-----");
		shout("Hey!!!", 5);
	}
	
	public static int multiply(int a, int b, int c) {
		return a*b*c;
	}
	
	public static void shout(String x, int y) {
		for (int i = 0; i < y; i++) {
			System.out.println(x);
		}		
	}

}
