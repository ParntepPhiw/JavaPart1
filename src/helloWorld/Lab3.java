package helloWorld;

public class Lab3 {
	public static void main(String[] args) {
		System.out.println("-----Lab3.1-----");
		int i = 20;
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println(i);
		--i;
		--i;
		--i;
		--i;
		--i;
		System.out.println(i);
		
		System.out.println("-----Lab3.2-----");
		float f1 = 1.27f;
		float f2 = -9.87f;
		if ((f1 >= 0) && (f2 < 0))
			System.out.println(f1 + " > " + f2);
		
		System.out.println("-----Lab3.3-----");
		char c1 = 'M';
		if ((c1 > 'A') || (c1 < 'Z'))
			System.out.println(c1 + " greater than A or less than Z");
	}
	
}
