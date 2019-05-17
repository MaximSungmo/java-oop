package exception;

public class MyClassTest {

	public static void main(String[] args) {
		try {
			MyClass myClass= new MyClass();
			myClass.dangerous();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

}
