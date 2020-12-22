import java.util.Calendar;

public class EnumExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String week = "";
		week = "Mnday";
		System.out.println("오늘의 요일:" + week);
		week = "MON";
		System.out.println("오늘의 요일:" + week);

		Week today = Week.TUESDAY;
		System.out.println("오늘의 요일:" + today);

		// ordinal() - 순번 : 0 부터 시작한 순번
		System.out.println("TUESDAY의 순번" + today.ordinal());
		today = Week.SUNDAY;
		System.out.println(today.ordinal());

		System.out.println(today.compareTo(Week.SUNDAY));

		// calendar를 이용한 처리
		// 오늘 날짜 생성.
		// Calendar.getInstance() -> new를 해주는 처리를 한다.
		// 클래스 : 실행하기 가능한 코드가 하드디스크에 저장되어 있는 것
		// 클래스를 메인 메모리(RAM)에 올리는 것은 생성이라고 한다.
		// 클래스의 예를 만드는 작업을 인스턴스화. 클래스를 가지고 예를 만들어 놓은 것(변수에 저장)은 인스턴스라고 한다.
		// 인스턴스 == 객체
		// Calendar - 날짜 정보를 가지고 있는 객체
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		// 년도를 출력해보자.
		System.out.println(now.get(1));
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		System.out.println(Calendar.HOUR_OF_DAY);
		System.out.println(now.get(Calendar.DAY_OF_WEEK));

	}

}
