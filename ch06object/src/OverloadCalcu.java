
public class OverloadCalcu {

	public static void main(String[] args) {

		// 2개의 데이터를 더하는 메서드를 작성

		// add()
		// 아래 메서드들을 사용하려면 객체를 생성해야 한다.
		OverloadCalcu oc = new OverloadCalcu();

		// add(10,20)- int 더하기 결과는 int, add(2.3, 4.5)-double 더하기 결과는 double,
		// add("자바", "짱") - 문자열 이어 붙이기 결과는 문자열
		oc.add(10, 20);
		oc.add(2.3, 4.5);
		oc.add("자바", "짱");

	}

	// 이곳 밑으로 각각의 메서드들을 만든다.
	public void add(int x, int y) {
		System.out.println("int 더하기 결과 : " + (x + y));
	}

	public void add(double x, double y) {
		System.out.println("double 더하기 결과 : " + (x + y));
	}

	public void add(String x, String y) {
		System.out.println("String 더하기 결과 : " + x + y);
	}

}
