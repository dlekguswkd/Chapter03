package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		String a= new String(" abcd");
		String b= new String(",efg ");
		
		/*
		//System.out.println(a+b);
		System.out.println(a.concat(b));
		System.out.println(b.concat(a));
		*/
		
		a=a.concat(b);		//더하기
		System.out.println(a);
		
		a=a.trim();			//양쪽끝에 공백삭제
		System.out.println(a);
		
		a=a.replace("ab", "12");	//콤마 앞에껄 콤마 뒤에껄로 교체(바꿔치기)
		System.out.println(a);
		
		System.out.println("--------------");
		
		String[] sArray=a.split(",");	//콤마를 기준으로 나누기
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println("--------------2");
		
		String str="Hello JAVA!";
		
		String result01=str.substring(3);	//숫자 나온다음부터 나오기(다음부터)
		System.out.println(result01);
		String result02=str.substring(1, 7);	//숫자 기점으로 자르기(사이)
		System.out.println(result02);
		
		char result03=str.charAt(8);	//숫자방만 나오게하기(여기만)
		System.out.println(result03);
		
		System.out.println("--------------3");
		
		String s00=new String("안녕하세요");	//정석
		String s01=new String("안녕하세요");
		System.out.println(s00==s01);	//주소비교하는거라 false
		System.out.println(s00.equals(s01));	//글자가 같니?	true
		
		System.out.println("--------------4");
		
		String s03="안녕";	
		String s04="안녕";				//숟가락 얹기
		System.out.println(s03==s04);	//똑같은곳에 생겨서 true
		System.out.println(s03.equals(s04));
		
		System.out.println("--------------5");
		
		s03="안녕!";			//새로 만들어버림
		System.out.println(s03==s04);	//다른주소됨
		System.out.println(s03.equals(s04));
		
		System.out.println("--------------6");
		
		s04=null;
		
		/*
		if(s04.equals("안녕")) {
			System.out.println("같다");
		}
		*/
		
		if("안녕".equals(s04)) {		//s04가 비어있어도(주소가 없음) 오류가 안뜸
			System.out.println("같다");
		}
		
		
	}

}
