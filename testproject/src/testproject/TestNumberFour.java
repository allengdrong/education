package testproject;

public class TestNumberFour {

	public static void main(String[] args) {
		int[] scores = {90, 100, 80, 85};

		int sum = 0;
		int avg = 4;
		sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / avg);

	}

}
