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
	System.out.println("�� ����: "+sum);
	System.out.println("a ����: "+sum_a);
	System.out.println("g ����: "+sum_g);
	
	System.out.println("===============");
	
	String str = new String ("tESt sTring  chang      first");
	String changeStr = new String();
	int i=0;
	str = str.toLowerCase(); //��� ���� �ҹ��ڷ� �����
	if(str.charAt(0)>='a' && str.charAt(0)<='z') {//���ڰ� ������
		changeStr+=(char)(str.charAt(i)-32);//����ȯ�� �� �빮�ڷ� ����� �� �� ���� ����
		i++; //i�� +�Ͽ� i=1
	}
	while(i<str.length()) {
		if(str.charAt(i) != ' ') {//������ �ƴϸ� 
			changeStr+=str.charAt(i); //i=1�� ���ͼ� 1���ڸ� ���ڰ� �״�� ������ ��
			i++; 
			continue; //i�� ������ ���� �� ��ų�� Ż��(=�����̸� Ż��)
		}
		while(str.charAt(i)==' ') {
			changeStr+=str.charAt(i); //�״�� ����
			i++;
		}
		if(str.charAt(i)>='a'&& str.charAt(i)<='z')
			changeStr+=(char)(str.charAt(i)-32);
		i++;
	}
	System.out.println(str);
	System.out.println(changeStr);
	System.out.println("����");
	
	
	
}
}
