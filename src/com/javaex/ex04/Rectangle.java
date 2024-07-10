package com.javaex.ex04;

public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle() {
		super();
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Rectangle r=(Rectangle)obj;
		
		boolean result;
		
		if(this.width*this.height == r.width*r.height) {
			result=true;
			//return true;
		}else {
			result=false;
			//return false;
		}
		return result;
	
}
	
	

}
