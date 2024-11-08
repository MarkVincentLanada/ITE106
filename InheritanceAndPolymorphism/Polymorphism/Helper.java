public class OverloadedClass {
	public void giveMeValue(String text) {
		System.out.println("You gave me a text: " + text);
	}
	
	public void giveMeValue(int number) {
		System.out.println("You gave me a text: " + number);
	}
	
	public void giveMeValue(boolean bool) {
		System.out.println("You gave me a text: " + bool);
	}
}
