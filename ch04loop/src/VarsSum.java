// 여러개의 데이터(5개 - 0 ~ 4)가 들어 있는 점수들의 합계를 내서 출력하는 프로그램 작성


public class VarsSum {

	public static void main(String[] args) {

		// 배열 선언 - 참조형 변수 -> 생성 : new
		int[] scores = new int[5]; // <- int 공간 5개를 잡는다.
		scores[0] = 100;
		scores[1] = 75;
		scores[2] = 90;
		scores[3] = 80;
		scores[4] = 85; // 자리를 5개를 잡았는데 인덱스 번호 4까지 사용할수 있다.
		// 4가 넘는 5가 나오면 ArrayIndexOutOfBoundsException 이라는 오류를 보게 된다.

		// 더한 결과를 저장하는 변수
		int sum = 0;

		// 반복회수가 정해진 경우 for
		for (int i = 0; i <= 4; i++) {
			// 더하는 연산
			sum += scores[i];

		}

		System.out.println(sum);

		// 과목의 갯수(길이)에 맞춰서 반복처리하자. -> 모든 배열 데이터에 대해서 처리한다. : foreach
		sum = 0; // 초기값 셋팅
		for (int i = 0; i < scores.length; i++) {
			// 더하는 연산
			sum += scores[i];
		}

		System.out.println(sum);

		// 모든 데이터에 대해서 처리하는 foreach: 향상된 for문
		// 결과값의 초기화
		sum = 0;
		// foreach를 이용한 합계 구하기
		for (int score : scores) {
			sum += score;
		}
		System.out.println(sum);
	}

}


