package com.javaex.ex02;

public class Point {

	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//메소드
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
		
	///메소드 일반
	/*
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	*/
	
	@Override
	public boolean equals(Object obj) {		//equals 메소드 바꾸기
		
		//this.x==0x777.x &&this.y==0x777.y 라는 의미
		Point p=(Point)obj;
	
		boolean result;
		
		if(this.x == p.x && this.y == p.y) {
			result=true;
			//return true;
		}else {
			result=false;
			//return false;
		}
		return result;
	}

	
	
}
