package switch_;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		String home = null, com = null;
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			
			System.out.println("숫자를 입력하세요");
			num = scan.nextInt();
			
			switch(num) {
			case 1 : 
				System.out.println("우리집 등록 : ");
				home = scan.next();
				break;
				
			case 2 : 
				System.out.println("회사 등록 : ");
				com = scan.next();
				break;
				
			case 3 : 
				System.out.println("우리집 : " + home);
				System.out.println("회사 : " + com);
				break;
			}
			
		}
		
		
	}

}
