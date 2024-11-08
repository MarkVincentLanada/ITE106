class Parent {
	String EyeColor = "Green";
	String HairColor = "Blonde";
	String Nose = "Matangos";
	float Height = 5.1; // feet
}

class Child1 extends Parent {
	String Inherited = super.EyeColor;
}

class Child2 extends Parent {
	String Inherited = super.HairColor;
}

class Child3 extends Parent {
	String Inherited = super.Nose;
}

class Child4 extends Parent {
	float Inherited = super.Height;
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Child1 jane = new Child1();
		Child2 lean = new Child2();
		Child3 rufert = new Child3();	
		Child4 mark = new Child4();

		System.out.println(jane.Inherited);
		System.out.println(lean.Inherited);
		System.out.println(rufert.Inherited);
		System.out.println(mark.Inherited);
	}
}
