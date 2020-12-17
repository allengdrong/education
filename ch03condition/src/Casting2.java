public class Casting2 {

	public static void main(String[] args) {
		
		char ch = 'a';
		System.out.println(ch);
		// 숫자로 캐스팅해서 찍는다.
		System.out.println((int) ch);
		
		// int로 ch를 캐스팅해서 받아오기
		int code = (int) ch; // 강제 캐스팅 - 형 변환 선언
		code = ch; // 자동 캐스팅 - 데이터 손실이 일어 나지 않는다.

		System.out.println(code);
		ch = (char) (code + 1); // 강제 캐스팅
		System.out.println(ch);
		System.out.println((char) (code + 2));
	}

}
