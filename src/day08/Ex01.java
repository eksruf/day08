package day08;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	String str= new String ("abcdefg");  	
	/*
	 //���� ��Ʈ�� �����̶� ����

	System.out.println("���ڿ� �Է�: ");
	str= input.next();
	System.out.println(str);
	
	System.out.println(str.toUpperCase()); //�빮�ڷ� ��ȯ

	
	
	
	
	*/
	//abcdefg
	System.out.println(str.charAt(0));
	System.out.println(str.charAt(1)=='a');
	System.out.println(str.charAt(0)=='a');//0��° ���� a�� ����?
	//���ڿ��� �ϳ��� ������ �´� �����ϳ� �̹Ƿ� ���� �������� ó��
	
	System.out.println(str.charAt(0)-32);
	System.out.println((char)(str.charAt(0)-32));//����ȯ
	
	str += "z";
	str += " "; //���鵵 �����ϴ�
	str += "a";
	System.out.println(str);
	
	
	str = "  aaaa aaa aaa   ";
	System.out.println(str);
	String re= str.trim();
	System.out.println(re); //������ �����ش�
	//������ �Է��� ���� �� �̸��� �Է¹޾Ҵµ� ������ �ԷµǴ� ��찡 ����
	//�׷���� ����ص� ���ϴ��K�� �ȵ�
	String name ="ȫ�浿   ";
	System.out.println("name: "+name);
	if (name.trim().equals("ȫ�浿")) { //�̸��� ���Ҷ� ������ �����ϰ� ���ϰڴ�
		System.out.println("����");
	}else {
		System.out.println("�ٸ���");
	}
	
	
	
	String addr;
	addr="047869/ ����� ���α� ����3�� /3��";
	String[] ad= addr.split("/"); //��������� �ڸ����ΰ�  " "�� ����
	System.out.println(ad[0]);
	System.out.println(ad[1]);
	
	
	String replace = addr.replace("/",",");//Ư�����ڸ� �ٲ��ִ� ���
	System.out.println(replace);
	System.out.println(addr);
	
	
	
	
	
	
}
}
