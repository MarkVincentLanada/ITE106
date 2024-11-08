package project;

public class OverloadedClass {
	public void giveValue(String text) {
		System.out.println("You gave me a text: " + text);
	}
	
	public void giveValue(int number) {
		System.out.println("You gave me a number: " + number);
	}
	
	public void giveValue(boolean bool) {
		System.out.println("You gave me a boolean: " + bool);
	}
	
	public void giveValue(char character) {
		System.out.println("You gave me a character: " + character);
	}
	
	public void giveValue(float decimal) {
		System.out.println("You gave me a decimal: " + decimal);
	}
}
