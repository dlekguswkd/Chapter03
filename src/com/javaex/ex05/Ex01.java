package com.javaex.ex05;

public class Ex01 {
	
	public static void main(String[] args) {
		
		String s00=new String("안녕하세요");	//이게 정석 (그냥 다 각자 새롭게 만듬)
		String s01=new String("안녕하세요");	
		
		System.out.println(s00.toString());
		
		String str00="hi";		//hi로 된 String 찾아봄 없어서 만듬
		String str01="굿모닝";	//굿모닝으로 된 String 찾아봄 없어서 만듬	
		String str02="굿모닝";	//굿모닝으로 된 String 찾았는데 있음 남의꺼에 숟가락 얹기
								//둘중하나라도 바꾸면 같이 바뀜 (굿모닝이)
		System.out.println(str01);	//굿모닝
		System.out.println(str02);	//굿모닝
		
		str01="굿 이브닝";			//굿이브닝을 새로 만들어버림
		System.out.println(str01);	//굿이브닝
		System.out.println(str02);	//굿모닝
	}

}
