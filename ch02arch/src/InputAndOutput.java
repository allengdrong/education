import java.util.Scanner;

// // 여기부터 글 끝까지 주석입니다.

/*
 * 주석의 시작 범위 주석 데이터를 입력 받아서 그대로 출력하는 프로그램 주석의 끝
 */

public class InputAndOutput {
	public static void main(String[] args) {
		// main()부터 프로그램이 시작이 됩니다.main()이 많으면 열려져 있는 곳부터

		// 데이터를 입력 받기 위한 객체 - Scanner
		// 생성 : 컴퓨터 시스템에서 모든 클래스(파일)은 하드 디스크에 있다. 실행을 위해서 CPU에서 가져다가 실행해야한다.
		// CPU는 속도가 느린 하드디스크는 상대하지 않는다. RAM(메인메모리)을 상대한다. 즉 생성은 하드디스크에 있는
		// 클래스나 파일을 메인 메모리(RAM)에 올리는 동작을 의미한다.
		// 자바는 그 명령어가 끝났다는 의미로 ";"을 붙인다.
		// System.in - 시스템에 있는 표준 입력장치 -> 키보드 / System.out -> 모니터

		Scanner scanner = new Scanner(System.in);

		// 콘솔창을 띄워서 입력하라는 표시하기
		System.out.println("데이터를 입력하세요.");
		// 문자열 데이터를 입력 받는다.(엔터와 함께). 문자열 - String
		String data = scanner.nextLine();

		// data 를 출력한다.
		System.out.println(data);

	}
}
