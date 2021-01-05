package ch11basicAPI;
/*
 * String은 문자열로 되어져 있다. char[] 인덱스 사용, 길이가 있다. 부분 문자열 조작과 바꾸기, 삭제, 포함관계
 */

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자 추출 : charAt(인덱스)
		String subject = "자바 프로그래밍"; // 인덱스: 0~7, 길이:8
		System.out.println(subject.length());
		// 모든 글자를 한글자씩 출력하기
		for (int i = 0; i < subject.length(); i++)
			System.out.println("i :" + subject.charAt(i));
		char result = subject.charAt(3);
		System.out.println(result);

		// 주민등록 번호(고정길이) - 위치가 특별한 정보를 나타낸다.
		String ssn = "111111-2111111";
		char gender = ssn.charAt(7);
		if (gender == '1' || gender == '3')
			System.out.println("남자입니다.");
		else if (gender == '2' || gender == '4')
			System.out.println("여자입니다.");
		else
			System.out.println("잘못된 주민등록번호입니다.");

		// 주민등록번호 중에서 생년월일에 대한 부분만 잘라내기
		ssn = "123456-1122331";
		String birth = ssn.substring(0, 6); // 0부터 6을 포함하지 않는 이전까지의 문자 잘라내기
		System.out.println(birth);

		// 글자의 위치를 찾아 내는 indexOf()-앞에서, lastIndexOf()-뒤에서
		// 관심사에 대한 데이터가 하나의 문자열로 되어져 있다.
		String like = "자바, 오라클, HTML";
		// 자바가 관심사에 포함되어 있는지 확인. JSP가 관심사에 포함되어 있는지 확인
		if (like.indexOf("자바") >= 0)
			System.out.println("자바는 관심사입니다."); // indexOf()를 이용하면 숫자 0 이상이 나오면 찾았다.
		else
			System.out.println("자바는 관심사에 없습니다."); // 값이 (-1)이 나오면 못찾았다.
		System.out.println(like.indexOf("자바"));
		System.out.println(like.indexOf("JSP"));

		String file = "C:\\work\\save.ext\\test.mp4"; // \ + 글자 -> 특수문자 처리 \t=tab, \"=", \\=\ , \n
														// 줄바꿈을 의미
		// 파일명 출력하기
		String fileName = file.substring(file.lastIndexOf("\\") + 1);
		System.out.println(fileName);
		// 확장자명
		String extName = file.substring(file.lastIndexOf(".") + 1);
		System.out.println(extName);


		String url = "http://localhost/board/list.do";

		// 마지막 한 자 지우기
		// 마지막 구분자를 제거하자.
		String data = "10, 20, 30, 40,";
		data = data.substring(0, data.lastIndexOf(","));
		System.out.println(data);
		// 마지막 한글자를 지우자.
		data = "10, 20, 30, 40,";
		data = data.substring(0, data.length() - 1);
		System.out.println(data);
		// referenced libraries - ojdbc6.jar
	}

}
