package project;

public class MethodOverloading {
	public static void main(String[] args) {
		OverloadedClass OC = new OverloadedClass();
		OC.giveValue(true);
		OC.giveValue("HOTDOG");
		OC.giveValue(123456890);
		OC.giveValue('A');
		OC.giveValue(12.81f);
	}
}