// I will use inheritance to demonstrate method overriding
class TopMostDude {
	public void myMethod() {
		System.out.println("Don't change my words bro!");
	}
}

// LowerDude inherits all the attributes/variables and methods/functions of TopMostDude
class LowerDude extends TopMostDude {
	// overrides the 'myMethod' of TopMostDude
	@Override // use this keyword to imply Method Overriding
	public void myMethod() {
		System.out.println("What you gonna do bout it?");
	}
}

public class HyperdriveEyy {
	public static void main(String[] args) {
		TopMostDude theMan = new TopMostDude();
		LowerDude theDude = new LowerDude();
		
		theMan.myMethod(); // calls original method
		theDude.myMethod(); // calls overriden method
	}
}
