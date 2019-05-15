package object.test;

import java.util.BitSet;

public class ObjectTest01 {

	public static void main(String[] args) {

		Point p = new Point(10, 20);

		Point p2 = new Point(10, 20);
		Point p3 = new Point(10, 20);
		System.out.println(p.getClass()); // reflection, 객체의 탄생 정보를 아는 것 
		
		System.out.println(p.hashCode()); // reference value는 아니며 reference 변수에 저장되어 있다. 
										  // Address 도 아니다. 
		 								  // Address 기반 hashing 값
		
		System.out.println(p); // getClass + "@" + hashCode();
		System.out.println(p.toString()); // getClass + "@" + hashCode();
		
	}
	
	

}
