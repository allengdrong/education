import java.util.Arrays;

public class ToMainDataTranse {

	public static void main(String[] args) {


		// 전달되는 args에 값을 출력
		// 이클립스에서 args 값을 셋팅할 때 - RUN -> RUN Configurations
		// > arguments >> program arguments
		System.out.println(Arrays.toString(args));

		// 0번째 것은 숫자로 인식을 시켜서 +20 -> 30을 출력해보자
		int num = Integer.parseInt(args[0]);
		System.out.println(num + 20);

	}
}
