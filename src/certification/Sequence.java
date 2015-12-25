package certification;

//public class Test {
//	Test(String n) {
//		name = n;
//	}
//
//	String name;
//
//	public static void main(String[] args) {
//		Test m1 = new Test("plane");
//		Test m2 = new Test("helicopter");
//		System.out.println(m2.equals(m1));
//	}
//
//	public boolean equals(Object o) {
//		Test m = (Test) o;
//		if (m.name != null)
//			return true;
//		return false;
//	}
//}

//public class Sequence {
//	Sequence() {
//		System.out.print("a ");
//	}
//
//	{
//		System.out.print("j ");
//	}
//
//	public static void main(String[] args) {
//		new Sequence().go();
//	}
//
//	void go() {
//		System.out.print("g ");
//	}
//
//	static {
//		System.out.print("z ");
//	}
//}

//class Sequence {
//	public static void main(String[] args) {
//		// String s = "Java";
//		// s.concat(" SE 6");
//		// s.replace('6', '7');
//		// System.out.print(s);
//		int[] a = { 1, 2, 3, 4, 5, 6 };
//		int i = a.length -1;
//
//		while (i >= 0) {
//			System.out.print(a[i]);
//			i--;
//		}
//	}
//}

class A {
	final public int GetResult(int a, int b) {
		return 0;
	}
}

class B extends A {
	public int GetResult(int a, int b) {
		return 1;
	}
}

public class Sequence {
	public static void main(String args[]) {
		B b = new B();
		System.out.println("x = " + b.GetResult(0, 1));
	}
}