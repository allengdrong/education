
public class OverloadPrint {

	public static void main(String[] args) {

		String name = "고선호";
		int age = 32;
		OverloadPrint op = new OverloadPrint();
		op.print(name);
		op.print(age);
	}

	// 변수 이름과 파라메터 갯수는 같지만 파라메터의 타입이 틀려서 overload 시켜준다.
	// 데이터를 전달해서 출력한다.
	public void print(String str) {
		System.out.println("문자열 출력 : " + str);
	}

	// 변수 이름과 파라메터 갯수는 같지만 파라메터의 타입이 틀려서 overload 시켜준다.
	// 데이터를 전달해서 출력한다.
	public void print(int x) {
		System.out.println("int 출력 : " + x);

	}

}
