package day08;

public class Quiz01 {
public static void main(String[] args) {
	
	String str = "�谳��-2017�� \nȫ�浿���� -2015�� \n����� -2018��";
	System.out.println("====������ str===");
	System.out.println(str);
	str = str.replace("-", ":"); //-�� :�� ����
	String[] arrStr =  str.split("\n"); // \n�� �������� �ڸ�
	//arrStr[0] = �谳��:2017�� arrStr[1] = ȫ�浿����:2015�� arrStr[2] =���켱��:2018��
	str=""; //str�ʱ�ȭ
	
	for (int i=0; i<arrStr.length;i++) {
		String[] reStr = arrStr[i].split(":");
		//arrStr[0]�� �����鼭 :�� �������� �������� 
		//�������� ���̵� reStr[0] = �谳��  , reStr[1] =2017�� 
		reStr[1]=reStr[1].replace(reStr[1], "1999��");
		
		str+=(reStr[0]+":"+reStr[1]+"\n");
	}
	
	System.out.println("====������ str===");
	System.out.println(str);
}
}
