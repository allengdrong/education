
public class ForOneAndTenPrint {

	public static void main(String[] args) {
		// 반복문 for문 - 1 ~ 10까지 출력. 변수 i가 11이 되면 조건을 만족하지 않아서 빠져나간다.
		// for(초기값; 반복 실행할 조건; 증감값) 실행 한개
		// for문의 반복시키는 변수를 사용할 때 i, j, k, l, m, n ...
		for(int i = 1; i<=10; ++i)
			System.out.println(i);
		// System.out.println(i); i가 오류 - for문 안에서 지역 변수로 선언해서 사용하고 있으므로 밖에서는 볼수 없다.
		
		// for문의 여러가지 형태
		// 1. 초기 값이 밖에 있는 경우.
		int a = 1;
		for( ; a <= 10; ++a)
			System.out.println(a);
		// 2. 증감을 반복문 안에 사용하는 경우
		a = 1;
		for( ; a <= 10 ; ) {	// while(조건)
			System.out.println("for:" + a);
			a++;
		}
		System.out.println(a);
		
		//while문 : 조건을 만족하면 반복 실행한다. while : ~ 하는 동안 => 반복
		a = 1;
		while(a<=10) {
			System.out.println("while:" + a);
			a++;
		}
		
		// for 무한 반복
		
		a = 1;
		for( ;;) {
			System.out.println("무한반복:" + a);
			a++ ;
			if(a>15) break;
			
		}
		
		// while 무한 반복
		a = 1;
		while(true) {
			System.out.println("while 무한반복 " + a);
			a++;
			if(a>9) break;
		}

	}

}
