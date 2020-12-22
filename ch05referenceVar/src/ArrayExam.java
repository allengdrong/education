import java.util.Arrays;

public class ArrayExam {

	// 여기서 부터 시작이 됩니다.
	public static void main(String[] args) {
		System.out.println("배열 예제");
		int[] intArray; // int intArray[]
		intArray = new int[5];

		// 교재 p.157
		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		System.out.println(arr1);
		// Arrays -> 배열 데이터를 문자열로 만들어서 출력할때 많이 사용한다.
		System.out.println(Arrays.toString(arr1));

		// for 0~2 인덱스를 이용한다.
		for (int i = 0; i <= 2; i++)
			System.out.println(arr1[i]);

		// arr1의 길이를 이용한 출력
		for (int i = 0; i < arr1.length; i++)
			System.out.println(arr1[i]);

		// 향상된 for를 이용한 arr1 출력
		// 변수 d에 배열 arr1의 데이터를 순서대로 있는 만큼 한개씩 d에 저장하고 반복실행한다.
		for (int d : arr1)
			System.out.println(d);

		// =======================================
		// 배열을 사용할 때 이미 값이 주어져 있는 경우에
		int[] scores = new int[] {83, 90, 87};
		scores = new int[] {80, 90, 85};

		System.out.println(scores);
		// 값 출력하기 위한 Arrays 사용
		System.out.println(Arrays.toString(scores));

		// 합계구하기
		int sum = 0;
		for (int i = 0; i < scores.length; i++)
			sum += scores[i];
		System.out.println("합계:" + sum);

		// 평균 = 합계 / 점수 갯수(length)
		// System.out.println((double)sum / scores.length);
		System.out.println(1.0 * sum / scores.length);
	}

}
