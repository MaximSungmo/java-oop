package object.test;

import javax.sound.midi.SysexMessage;

public class ObjectTest02 {

	public static void main(String[] args) {

		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		Point p3 = p2;
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		// == : 두 객체의 동일성 
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		
		//eqauls : 두 객체의 동질성을 비교(즉, 내용비교)
		//object의 equals() 기본 구현은 == 연산과 같다. 따라서 객체 비교 시에는 오버라이드를 통해서 구현해야 한다.
		
		//hashCode를 equals 오버라이드할 때 같이 오버라이드가 되는 이유는 성능상의 이유 때문이다.
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		//String
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode() + ":" +s2.hashCode());
		System.out.println(System.identityHashCode(s1) + ":" +System.identityHashCode(s2));
		
		
		// 객체를 만들 때 new String으로 해야 하는데, 아래와 같은 코드는 사실 말이 되지 않는다. 다만 자바에서 무언가 개입이 되어 동일한 객체로 만들게 된다. 
		String s3 = "ABC";
		String s4 = "ABC";
		System.out.println(s1.hashCode() + ":" +s2.hashCode()+ ":" + s3.hashCode() + ":" +s4.hashCode());
		System.out.println(System.identityHashCode(s1) + ":" +System.identityHashCode(s2)+":"+System.identityHashCode(s3)+":"+System.identityHashCode(s4));
		
		// 무언가는 바로 다음과 같다. method area에 string constant pool 이 따로 있다. 근데 "ABC"를 만들었을 때는 HEAP 영역에 ABC객체를 가르키는 위치를 String에 돌려주므로 동일한 객체를 가르키게 된다
		// 이와 같은 동작을 하는 것은 wrapper class도 동일하게 constant pool 이 운영되는 불변 클래스이다. 
	}

}
