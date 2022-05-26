package day08;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	String str= new String ("abcdefg");  	
	/*
	 //기존 스트링 설정이랑 같음

	System.out.println("문자열 입력: ");
	str= input.next();
	System.out.println(str);
	
	System.out.println(str.toUpperCase()); //대문자로 반환

	
	
	
	
	*/
	//abcdefg
	System.out.println(str.charAt(0));
	System.out.println(str.charAt(1)=='a');
	System.out.println(str.charAt(0)=='a');//0번째 값이 a와 같나?
	//문자열의 하나를 가지고 온다 문자하나 이므로 작은 따옴으로 처리
	
	System.out.println(str.charAt(0)-32);
	System.out.println((char)(str.charAt(0)-32));//형변환
	
	str += "z";
	str += " "; //공백도 가능하다
	str += "a";
	System.out.println(str);
	
	
	str = "  aaaa aaa aaa   ";
	System.out.println(str);
	String re= str.trim();
	System.out.println(re); //공백을 없애준다
	//웹으로 입력을 받을 때 이름을 입력받았는데 공백이 입력되는 경우가 생김
	//그럴경우 출력해도 원하느낻로 안됨
	String name ="홍길동   ";
	System.out.println("name: "+name);
	if (name.trim().equals("홍길동")) { //이름을 비교할때 공백을 제외하고 비교하겠다
		System.out.println("같다");
	}else {
		System.out.println("다르다");
	}
	
	
	
	String addr;
	addr="047869/ 서울시 종로구 종로3가 /3층";
	String[] ad= addr.split("/"); //어떤기준으로 자를것인가  " "이 기준
	System.out.println(ad[0]);
	System.out.println(ad[1]);
	
	
	String replace = addr.replace("/",",");//특정문자를 바꿔주는 기능
	System.out.println(replace);
	System.out.println(addr);
	
	
	
	
	
	
}
}
