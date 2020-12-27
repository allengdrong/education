
public class OverloadCalcu {

	public static void main(String[] args) {

		// 2개의 데이터를 더하는 메서드를 작성

		// add()
		// 아래 메서드들을 사용하려면 객체를 생성해야 한다.
		OverloadCalcu oc = new OverloadCalcu();

		// add(10,20)- int 더하기 결과는 int, add(2.3, 4.5)-double 더하기 결과는 double,
		// add("자바", "짱") - 문자열 이어 붙이기 결과는 문자열

		// oc.add(10, 20);
		// oc.add(2.3, 4.5);
		// oc.add("자바", "짱");

		System.out.println(oc.add(10, 20));
		System.out.println(oc.add(2.3, 4.5));
		System.out.println(oc.add("자바", "짱"));
		System.out.println(oc.add("" + 10, "짱")); // 문자열 이어붙이기
		// 숫자 -> 문자열로 변환 : ""+ 숫자

		// 원래는 정수 연산만 가능하도록 코딩을 하고 있다.
		// Overload를 사용하면 상당히 편하지만 어떤 경우는 생각지 않을 논리 오류가 날 수도 있다.
		// 아래와 같은 경우 논리 오류로 서로 값이 틀리게 된다. 그래서 이런 경우는 Overload를 이용하는 것보다 메서드 이름을 다르게 하는 것을 지향한다.
		// int 연산인 경우는 addInt(), double 연산인 경우는 addDouble()로 만드는 것을 권장한다.
		System.out.println((int) oc.add(2.7, 4.5));
		System.out.println(oc.add((int) 2.7, (int) 4.5));

	}

	// 이곳 밑으로 각각의 메서드들을 만든다.
	// public void add(int x, int y) {
	// System.out.println("int 더하기 결과 : " + (x + y));
	// }
	//
	// public void add(double x, double y) {
	// System.out.println("double 더하기 결과 : " + (x + y));
	// }
	//
	// public void add(String x, String y) {
	// System.out.println("String 더하기 결과 : " + x + y);
	// }

	public int add(int x, int y)

	{
		System.out.print("int 연산 실행 : ");
		return x + y;
	}

	public double add(double x, double y)

	{
		System.out.print("double 연산 실행 : ");
		return x + y;
	}

	public String add(String x, String y)

	{
		System.out.print("String 연산 실행 : ");
		return x + y;
	}

}
