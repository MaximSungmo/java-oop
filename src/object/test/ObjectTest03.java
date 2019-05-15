package object.test;

import java.util.HashSet;
import java.util.Set;

public class ObjectTest03 {

	public static void main(String[] args) {

		Set<Point> set = new HashSet<Point>();
		
		Point p1 = new Point(10,20);
		set.add(p1);
		
		Point p2 = new Point(20,20);
		set.add(p2);

		Point p3 = new Point(10,20);
		set.add(p3);
		
		for(Point p : set) {
			System.out.println(p);
		}
		
		//해쉬코드를 비교하여 값을 넣으므로 만약에 point객체에 오버라이드가 안되었다면 세 가지 객체 모두 다르다고 판정
		// 단 해쉬코드를 오버라이드한다면 같은 값은 같은 객체로 판정 
		
	}

}
