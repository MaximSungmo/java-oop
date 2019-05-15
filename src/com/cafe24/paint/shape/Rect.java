package com.cafe24.paint.shape;

public class Rect extends Shape {
	private int x1;
	private int x2;
	private int x3;
	private int x4;
	
	private int y1;
	private int y2;
	private int y3;
	private int y4;
	
	@Override
	public void draw() {
		System.out.println("사각형을 그렸습니다.");
	}

	@Override
	public float calcArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
