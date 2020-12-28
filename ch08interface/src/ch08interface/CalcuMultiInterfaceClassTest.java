package ch08interface;

public class CalcuMultiInterfaceClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 4칙연산을 주로 하는 부분
		ForeOpInterface calcu1 = new CalcuMultiInterfaceClass();
		System.out.println(calcu1.add(10, 20)); // 타입이 4칙연산 타입으로 선언했으므로 4칙연산만 처리하게 된다.


		// 합계와 평균을 주로 하는 부분
		int[] scores = {100, 80, 90, 85};
		SumAvgInterface calcu2 = new CalcuMultiInterfaceClass();
		int sum = calcu2.sum(scores);
		System.out.println(sum);
		System.out.println(calcu2.avg(sum, scores.length));
	}

}
