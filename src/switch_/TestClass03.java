package switch_;

import java.util.Scanner;

public class TestClass03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String str;
		
		System.out.println("문자열 입력");
		str = scan.next();
		
		switch(str) {
		case "안녕" : System.out.println("안녕 입력");
		case "그래" : System.out.println("그래 입력");
		default : System.out.println("그 외의값 입력");
		}
		
	}

}
