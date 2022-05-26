package day08;

public class Quiz01 {
public static void main(String[] args) {
	
	String str = "김개똥-2017년 \n홍길동구리 -2015년 \n선운선녀 -2018년";
	System.out.println("====변경전 str===");
	System.out.println(str);
	str = str.replace("-", ":"); //-를 :로 변경
	String[] arrStr =  str.split("\n"); // \n을 기준으로 자름
	//arrStr[0] = 김개똥:2017년 arrStr[1] = 홍길동구리:2015년 arrStr[2] =선우선녀:2018년
	str=""; //str초기화
	
	for (int i=0; i<arrStr.length;i++) {
		String[] reStr = arrStr[i].split(":");
		//arrStr[0]이 들어오면서 :를 기준으로 나뉘어짐 
		//나누어진 아이들 reStr[0] = 김개똥  , reStr[1] =2017년 
		reStr[1]=reStr[1].replace(reStr[1], "1999년");
		
		str+=(reStr[0]+":"+reStr[1]+"\n");
	}
	
	System.out.println("====변경후 str===");
	System.out.println(str);
}
}
