// Level 1: Base Class/Super Class
class Father {
	// class attributes/variables
	String Features = "Pogi";
	String EyeColor = "Green";
	int Money = 612879;

	// class method/function
	public void printFatherFeatures() {
		System.out.println(Features);
		System.out.println(EyeColor);
		System.out.println(Money);
	}
}

// Level 2: Derived Class (Subclass of Animal, Parent Class of Dog)
class Son extends Father {
	// class attributes/variables
	// the 'super' keyword pertains or points the the CURRENT PARENT CLASS, not the TOP-MOST SUPER CLASS (in case of multi-level inheritance)
	String FeaturesDin = super.Features;
	String EyeColorDin = super.EyeColor;
	int MoneyDin = super.Money / 100;

	// class method/function
	public void printSonFeatures() {
		System.out.println(FeaturesDin);
		System.out.println(EyeColorDin);
		System.out.println(MoneyDin);
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		// object created only uses 'Son' class but can access Son's BASE CLASS which the the 'Father' class
		Son rupart = new Son();
		rupart.printFatherFeatures();
		rupart.printSonFeatures();
	}
}
