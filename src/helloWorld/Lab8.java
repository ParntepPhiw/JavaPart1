package helloWorld;

public class Lab8 {
	public static void main(String[] args) {
		for (int count = 0; count <= 20; count++) {
			if (count == 11) {
				System.out.println("Break " + count);
				break;
			}
			System.out.println("Normal " + count);
		}
		
	}
}
