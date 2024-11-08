// Level 1: Base Class/Super Class
class Father {
	String Features = "Pogi";
	String EyeColor = "Green";
	int Money = 612879;
	
	public void printFatherFeatures() {
		System.out.println(Features);
		System.out.println(EyeColor);
		System.out.println(Money);
	}
}

// Level 2: Derived Class (Subclass of Animal, Parent Class of Dog)
class Son extends Father {
	String Features = super.Features;
	String EyeColor = super.EyeColor;
	int Money = super.Money / 100;
	
	public void printSonFeatures() {
		System.out.println(Features);
		System.out.println(EyeColor);
		System.out.println(Money);
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		Son rupart = new Son();
		rupart.printFatherFeatures();
		rupart.printSonFeatures();
	}
}
