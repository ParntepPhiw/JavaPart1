package helloWorld;

public class Lab4 {
	public static void main(String[] args) {
		System.out.println("-----Lab4.1-----");
		int score = 60;
		if (score >= 80) {
			System.out.println("Good");
		} else if (score >= 50) {
			System.out.println("normal");
		} else {
			System.out.println("fail");
		}
		
		System.out.println("-----Lab4.2-----");
		boolean isHandSome = true;
		if (!isHandSome) {
			if (score >= 80) {
				System.out.println("Good");
			} else if (score >= 50) {
				System.out.println("normal");
			} else {
				System.out.println("fail");
			}
		} else {
			System.out.println("Good");
		}
	}
}
