package day08;

import java.util.ArrayList;

public class Quiz02 {
public static void main(String[] args) {
	
	
	String str1 = new String ("Have a nice day Have a nice day Have a nice day");
	
	//System.out.println(str.charAt(0));
	ArrayList arr = new ArrayList();
	for (int i = 0 ;i<str1.length();i++) {
		if(str1.charAt(i)=='a')
		//System.out.println(i);
			arr.add(i);
	}System.out.println(arr);
	
	System.out.println("===============");
	
	
	String s = new String ("It is a fun java programming");
	int sum_a=0, sum_g=0, sum=0;
	for (int i=0; i<s.length();i++) {
		if (s.charAt(i)=='a') {
			sum_a+=1;
			
		}else if (s.charAt(i)=='g') {
			sum_g+=1;
		}
		sum+=1;
	}
	System.out.println("총 개수: "+sum);
	System.out.println("a 개수: "+sum_a);
	System.out.println("g 개수: "+sum_g);
	
	System.out.println("===============");
	
	String str = new String ("tESt sTring  chang      first");
	String changeStr = new String();
	int i=0;
	str = str.toLowerCase(); //모든 글자 소문자로 만들기
	if(str.charAt(0)>='a' && str.charAt(0)<='z') {//글자가 들어오면
		changeStr+=(char)(str.charAt(i)-32);//형변환을 해 대문자로 만든다 그 후 글자 보관
		i++; //i를 +하여 i=1
	}
	while(i<str.length()) {
		if(str.charAt(i) != ' ') {//공백이 아니면 
			changeStr+=str.charAt(i); //i=1이 들어와서 1번자리 글자가 그대로 보관이 됨
			i++; 
			continue; //i가 조건을 충족 못 시킬때 탈출(=공백이면 탈출)
		}
		while(str.charAt(i)==' ') {
			changeStr+=str.charAt(i); //그대로 보관
			i++;
		}
		if(str.charAt(i)>='a'&& str.charAt(i)<='z')
			changeStr+=(char)(str.charAt(i)-32);
		i++;
	}
	System.out.println(str);
	System.out.println(changeStr);
	System.out.println("종료");
	
	
	
}
}
