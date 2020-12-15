
public class IncreaseOp {

	public static void main(String[] args) {

		int i = 10;
		System.out.println(i); // 10
		i = i + 1;
		System.out.println(i); // 11
		i += 2;
		System.out.println(i); // 13
		i++;
		System.out.println(i); // 14
		++i;
		System.out.println(i); // 15
		// 다음 문장을 실행하면 결과는 어떻게 나올까요?
		// 앞에서 뒤로 처리가 된다. ++ 연산자가 앞에 있으면 먼저 증가
		System.out.println(++i + "/" + i++ + "/" + i++); // 16 / 16 / 17
		System.out.println(i);

		// 반복문에서의 단항 연산자 활용
		// - 데이터의 갯수가 정해져 있는 반복문 for (초기값; 반복할 조건; 증감값)
		for (int a = 0; a <= 4; ++a) {
			System.out.println("a=" + a); // 0 1 2 3 4
		}

		// i = 18
		// 먼저 1 증가 시킨다.
		i++;
		// 출력
		System.out.println(i); // 19
		// 위에 2줄을 합쳐서 먼저 1증가시키고 그래고 출력한다.
		System.out.println(++i); // 20
	}

}
