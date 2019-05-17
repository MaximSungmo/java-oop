package exception;

public class MyClass {

	public void dangerous() throws MyException{
		System.out.println("Normal State1");
		
		boolean isDanger = true; 
		if(isDanger) {
			// 예외상황 발생 
			throw new MyException("abc");
		}
		System.out.println("Normal State2");
		
	}
	
}
