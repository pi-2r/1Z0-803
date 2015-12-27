package certification;

public class TestClass4 {

	static TestClass4 ref;
	String[] arguments;
	
	public static void main(String[] args) {
		ref =  new TestClass4();
		ref.func(args);
	}
	
	public void func(String[] args) {
		ref.arguments = args;
	}
	

}
