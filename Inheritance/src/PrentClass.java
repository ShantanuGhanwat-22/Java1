
class PrentClass {
	public void parentmethod() {
		System.out.println("This is Parent Class");
	}
}
class ChildClass extends PrentClass {
	public void childmethod() {
		System.out.println("This is child class");
	}
}
class Answer {
	public static void main(String[] args) {
		PrentClass m = new PrentClass();
		ChildClass n = new ChildClass();
		m.parentmethod();
		n.childmethod();
		n.childmethod();
	}
}