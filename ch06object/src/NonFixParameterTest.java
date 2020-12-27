

import java.util.Arrays;

public class NonFixParameterTest {

	// 문] 자바에서 처음 시작되는 main 메서드를 작성하시오.
	public static void main(String[] args) {
		System.out.println("NonFixparameterTest.main()");
		int kor = 100;
		int eng = 80;
		int meth = 90;
		int sci = 85;

		// 위 과목의 합계와 평균을 구하시오.
		// 합계 구하기
		// 아래 배열을 받는 sum() 사용하기 위해서 배열로 만든다.
		int[] scores = new int[] {kor, eng, meth};
		// int sum = sum(scores);
		// int sum = sum(new int[]{kor, eng, meth});
		// 타입이 int인 여러개의 데이터를 받는 메서드는 배열도 받는다.
		int sum = sum(kor, eng, meth, sci);
		System.out.println("sum = " + sum);
		// 평균 구하기
	}

	// 중복, 복잡해지면 꺼낸다.
	// 합계 구하는 메서드
	// 타입이 배열인 데이터를 받는 sum 메서드
	// public static int sum(int[] scores) {
	// 타입이 int 여러개의 데이터를 받는 sum 메서드 -> 이때 scores는 배열이다. ... 은 매자미가 매개변수에서만 사용이 가능하다.
	public static int sum(int... scores) {
		System.out.println("NonFixparameterTest.main().scores : " + Arrays.toString(scores));

		int result = 0;
		for (int i = 0; i < scores.length; i++)
			result += scores[i];
		return result;
	}
}
