package com.cafe24.paint.text;

import com.cafe24.paint.i.Drawable;

public class GraphicString implements Drawable {

	private String graphic = "헬로";
	
	@Override
	public void draw() {
		System.out.println("그래픽"+graphic +" 을 그렸습니다.");	
		
	}

}
