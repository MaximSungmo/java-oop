package swap;

public class SwapTest {

	public static void main(String[] args) {

		int a= 10;
		int b= 20;
		System.out.println(a+ " : "+ b);
		
		swap(a, b);
		System.out.println(a+ " : "+ b);
		
		Value v1 = new Value();
		v1.val = 10; 
		Value v2 = new Value();
		v2.val = 20; 
		
		System.out.println(v1.val +":"+ v2.val);
		swap(v1, v2);
		System.out.println(v1.val +":"+ v2.val);
	}

	private static void swap(int m, int n) {
		int temp = m;
		m = n;
		n = temp;		
		System.out.println(m+ " : "+ n);
	}
	
	private static void swap(Value m, Value n) {
		int temp = m.val;
		m.val = n.val;
		n.val = temp;
	}
}
