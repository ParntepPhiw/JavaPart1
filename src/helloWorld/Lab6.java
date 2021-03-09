package helloWorld;

public class Lab6 {
	public static void main(String[] args) {
		System.out.println("-----Lab6.1-----");
		main1();
		
		System.out.println("-----Lab6.2-----");
		main2();
		
		System.out.println("-----Lab6.3-----");
		main3();
		
		System.out.println("-----Lab6.4-----");
		main4();
		
	}
	
	public static void main1() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main2() {
		int a = 1;
		int sumA = 0;
		while (a <= 10) {
			sumA = sumA + a;
			a++;
		}
		System.out.println("Sum of 1-10 = " + sumA);
	}
	
	public static void main3() {
		int b = 1;
		while (b <= 100) {
			if (b % 12 == 0) {
				System.out.println(b);
				b++;
			} else {
				b++;
			}
		}
	}
	
	public static void main4() {
		int myArr[] = {1, 2, 3, 4, 5};
		for (int c : myArr) {
			System.out.println(c);
		}
	}
	
}
