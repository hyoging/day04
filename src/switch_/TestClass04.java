package switch_;

import java.util.Scanner;

public class TestClass04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String name;
		while(true) {
			System.out.println("이름입력");
			name = scan.next();
			System.out.println("입력한 이름 : " + name);
		}
		
	}

}
