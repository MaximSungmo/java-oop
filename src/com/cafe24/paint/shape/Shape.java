package com.cafe24.paint.shape;

import com.cafe24.paint.i.Drawable;

public abstract class Shape implements Drawable {

	private String fillColor;
	private String lineColor;
	

	public abstract float calcArea();
}
