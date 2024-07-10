package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		
		int a=3;	//기본
		System.out.println(a);
		
		//사용가능하나 복잡해서 권장하지않음
		Integer i=new Integer(3);	//주소
		System.out.println(i.toString());
		
		//3+5
		Integer sum=new Integer(3) + new Integer(5);
		System.out.println(sum);
		
		//Integer v01=new Integer(3);
		Integer v01=3;	//(자동)박싱 boxing 몸짓이 작은아이가 크게 형변환되는것 
						//종이에 담겨야할아이가 박스에 담김(int -> integer)
		
		int v02= i;		//(자동)언박싱 unboxing
						//i는 박스 박스를 종이에 담겠다(부가기능(메소드)말고 숫자만 담는다)
		
		System.out.println("------------------");
		
		//문자열-->정수
		//덜 좋은 방식
		Integer r01 =100;	//자동 박싱
		int result=r01.parseInt("1234567");
		System.out.println(result); //1234567이라는 문자가 숫자로 바뀜 
		System.out.println(result+3);	//-->1234570 숫자라서 가능
		
		//바로 위에꺼 간단하게 하기
		//조금더 좋은방식  static 이해
		int result02=Integer.parseInt("123456");
		System.out.println(result02);
		
		System.out.println("------------------2");
		
		//정수--->문자열
		String s99=String.valueOf(5555);
		System.out.println(s99);
		System.out.println(s99+5); //문자열되서 덧셈이 아닌 그냥 뒤에 붙음
		
		//위에꺼 간단하게 하기 ->문자열
		String s100=""+5555;  
		System.out.println(s100+9);
		
	}

}
