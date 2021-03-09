package helloWorld;

public class Lab7 {
	public static void main(String[] args) {
		System.out.println("-----Lab7.1-----");
		main1();
		
		System.out.println("-----Lab7.2-----");
		main2();
	}
	
	public static void main1() {
		int num = 20;
		do {
			System.out.println(num);
			num--;
		} while (num > 0);
	}
	
	public static void main2() {
		int i = 88;
		do {
			System.out.println(i);
			i--;
		} while (i % 2 == 0);
	}
}
