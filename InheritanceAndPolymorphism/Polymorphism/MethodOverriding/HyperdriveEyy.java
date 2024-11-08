// I will use inheritance to demonstrate method overriding
class TopMostDude {
	// you don't necessarily need a parameter for the method
	public void myMethod(String randomText) {
		System.out.println("Don't change my words bro! (" + randomText + ")");
	}
}

// LowerDude inherits all the attributes/variables and methods/functions of TopMostDude
class LowerDude extends TopMostDude {
	// overrides the 'myMethod' of TopMostDude
	@Override // use this keyword to imply Method Overriding
	public void myMethod(String randomText) {
		System.out.println("What you gonna do bout it? (" + randomText + ")");
	}
}

// LowerDude inherits all the attributes/variables and methods/functions of LowerDude and TopMostDude
class RandomDude extends LowerDude {
	// overrides the 'myMethod' of LowerDude
	@Override // use this keyword to imply Method Overriding
	public void myMethod(String randomText) {
		System.out.println("Whatchu goyz doin'? (" + randomText + ")");
	}
}

public class HyperdriveEyy {
	public static void main(String[] args) {
		TopMostDude theMan = new TopMostDude();
		LowerDude theDude = new LowerDude();
		RandomDude thePasserby = new RandomDude();
		
		theMan.myMethod("hatdog"); // calls original method
		theDude.myMethod("hehe"); // calls overriden method
		thePasserby.myMethod("oh wow"); // calls second overriden method
	}
}
