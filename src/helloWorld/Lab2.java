package helloWorld;

public class Lab2 {
	public static void main(String[] args) {
		System.out.println("-----Lab2.1-----");
		bark();
		System.out.println("-----Lab2.2-----");
		main2();
		System.out.println("-----Lab2.3-----");
		main3();
	}
	public static void bark() {
		String dogName = "Bow-Wow";
		System.out.println("The Dog name = " + dogName + " bark");
	}
	
	public static void main2() {
		float myFloat = 9.99f;
		int myFloatInt = (int) myFloat;
		System.out.println("Float = " + myFloat);
		System.out.println("Float -> Integer = " + myFloatInt);
		
		int myInt = 12345;
		float myIntFloat = myInt;
		System.out.println("Interger = " + myInt);
		System.out.println("Interger -> Float = " + myIntFloat);
		
		double myDouble = 22.222d;
		float myDoubleFloat = (float) myDouble;
		System.out.println("Double = " + myDouble);
		System.out.println("Double -> Float = " + myDoubleFloat);
		
		char myChar = 'A';
		int myCharInt = myChar;
		System.out.println("Character = " + myChar);
		System.out.println("Character -> Integer = " + myCharInt);
	}
	
	public static void main3() {
		final String hello = "Hello";
//		hello = "World";
		System.out.println(hello);
	}
}
