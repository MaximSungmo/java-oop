package com.cafe24.paint.point;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {	
		super(x, y);
		this.color = color;		
	}
	
	@Override
	public void show() {
		System.out.println("점("+ x +","+ y + ","+color+")에 점을 찍었습니다.");
	}

}
