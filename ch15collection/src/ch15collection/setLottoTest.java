package ch15collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class setLottoTest {

	public static void main(String[] args) {

		// 로또 프로그램 작성
		// 1. 랜덤으로 숫자를 만들어 내야 한다. -> Math.random() : 0.0 <= r < 1.0 : 각각에 대해서 *45 -> 0.0 <= r < 45.0
		// 정수형으로 만든다. ==> 0 <= (int) r * 45 < 45 :: 0~44 : 각각에 대해서 + 1 <= (int) (r * 45) + 1 < 46
		// 2. 배열을 만든다.
		int[] lotto = new int[6];
		int bonus = 0;
		// 랜덤 숫자를 발생시켜서 데이터의 갯수가 중복되지 않도록 처리한 6개의 데이터를 가져온다.
		int index = 0;
		while (index < 6) {
			int num = (int) (Math.random() * 45) + 1;
			System.out.println("랜덤 숫자 : " + num);
			boolean check = false; // 중복이 되지 않았다.
			for (int i = 0; i < index; i++) { // 이전 데이터가 현재 뽑은 데이터와 중복이 되는지 비교하기 위해 반복처리한다.
				if (lotto[i] == num) { // 데이터가 중복이 되면
					check = true; // 중복이 되었다고 표시를 한다.
					break; // 그리고 for 반복문을 빠져 나간다.
				}
			}
			if (!check) { // 중복이 되지 않았으면
				lotto[index] = num; // 숫자를 배열에 저장한다.
				index++; // 다음번호를 받기 위해 index를 1증가시킨다.
			}
			System.out.println(Arrays.toString(lotto));

		}

		// 배열의 데이터를 오름차순으로 정렬시킨다.
		Arrays.sort(lotto, 0, lotto.length - 1);
		System.out.println("당첨 로또 번호 : " + Arrays.toString(lotto));

		// 특수문자 출력 : \n - 줄바꿈. \\ - \, \" - "
		System.out.println("\n\n===[Set을 이용한 로또번호 생성]=====================");
		Set<Integer> lottoSet = new HashSet<>();
		// set의 데이터 갯수가 7인지 물어 봐서 7이 되면 빠져나가자
		// while (lottoSet.size() < 6) {
		// 1~45 사이의 랜덤 숫자를 만들어 낸다.
		// int num = (int) (Math.random() * 45) + 1;
		// System.out.println("발생된 랜덤 숫자 : " + num);
		// set에 추가
		// lottoSet.add(num);
		// System.out.println(lottoSet);

		// }

		while (lottoSet.size() < 6)
			lottoSet.add((int) (Math.random() * 45) + 1);
		System.out.println("6개 숫자 출력");
		System.out.println(lottoSet);

		// 보너스 점수 구하기
		while (true) {
			int num = (int) (Math.random() * 45) + 1;
			if (!lottoSet.contains(num)) { // 로또 번호에 포함되어 있지 않으면
				bonus = num; // 보너스 번호 셋팅
				break; // while문을 빠져나간다.
			}
		}
		// 정렬해서 출력하고 싶다. -->
		// 1. set은 순서가 없으므로 순서가 있는 배열로 만든다.
		Object[] arr = lottoSet.toArray();
		// 2. 배열 정렬
		Arrays.sort(arr);
		// 3. 정렬된 배열 출력
		System.out.println("출력된 숫자 배열 정렬");
		System.out.println(Arrays.toString(arr));

		// 보너스 번호 출력하기
		System.out.println("보너스 : " + bonus);
	}

}
