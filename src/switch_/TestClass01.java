package switch_;

public class TestClass01 {

	public static void main(String[] args) {

		int select = 1;
		switch( select ) {
		case 1 : System.out.println("1입력"); //break;
		case 2 : System.out.println("2입력"); //break;
		default : System.out.println("1,2 제외한 다른 값");
		}
		System.out.println("다음 문장들 실행!!!");
	}

}
