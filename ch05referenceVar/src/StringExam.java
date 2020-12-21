
public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strVar1 = "고선호";
		String strVar2 = "고선호";

		System.out.println(strVar1 + "-1/" + strVar2 + " -2");
		System.out.println(strVar1 == strVar2);

		String strVar3 = new String("고선호");
		String strVar4 = new String("고선호");

		System.out.println(strVar3 + "-1/" + strVar4 + " -new 4");
		System.out.println(strVar3 == strVar4);

		// 무조건 문자열이나 클래스의 값으로 비교할때는 equals() 메서드를 사용해야만 한다. - 이때 프로그램을 작성되어 있어야 한다.

		// 문자열 String의 비교는 ==로 비교하면 주소 비교가 된다.
		System.out.println(strVar1 + "-1/" + strVar3 + " -3");
		System.out.println(strVar1 == strVar3);

		System.out.println(strVar3 + "-new 3/" + strVar4 + " -new  :4 equals 비교");
		System.out.println(strVar3.equals(strVar4));

	}

}
