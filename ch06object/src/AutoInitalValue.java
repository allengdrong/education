
public class AutoInitalValue {

	// 위치 상 : 전역 변수 ==> 클래스 안에 있는 필드 = 항목 = 속성 ==> 객체가 가지고 변수 : 객체 변수
	static int a;
	static boolean b;
	static String str;

	public static void main(String[] args) {

		System.out.println("전역 변수 출력 : int - " + a + ", boolean - " + b + ", String - " + str);

		// main 안에서만 접근이 되는 지역 변수
		// 초기값을 지정하지 않으면 --> 자동 초기화시켜주지 않는다. 오류가 나면서 초기값을 넣으라고 한다.
		// --> 이 변수들을 사용하려면 반드시 강제적으로 초기값을 셋팅하여야만 사용할 수 있다.

		int a2 = 0;
		boolean b2 = false;
		String str2 = null;

		System.out.println("전역 변수 출력 : int - " + a2 + ", boolean - " + b2 + ", String - " + str2);

	}

}
