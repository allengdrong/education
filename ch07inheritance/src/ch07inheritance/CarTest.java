package ch07inheritance;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 상속받은 것을 사용할 수 있다.
		// - 자식 클래스 생성
		SportsCar sc = new SportsCar();
		String model = "산타페";
		sc.setModel(model);
		System.out.println(sc.getModel());

		// - 자식 클래스 생성 - 초기값을 셋팅
		String company = "현대";
		SportsCar sc1 = new SportsCar(model, company);
		// sc1이 가지고 있는 toString()를 호출해서 문자열로 받아서 처리한다.
		System.out.println(sc1);

		Car c1 = new Car();
		System.out.println(c1.getCompany());

		Car c2 = new SportsCar(); // 자동 캐스팅 - 부모클래스가 더 큰 범위를 가지고 있어서
		// System.out.println(c2.getType()); - Car 타입에는 type이라는 프로퍼티 자체가 없다.
		System.out.println(((SportsCar) c2).getType()); // Car 타입에 SportsCar생성해서 넣어 놨어야 한다.
		// 강제 캐스팅을 이용해서 type 프로퍼티를 사용하겠다고 선언해야 SportsCar에 있는 type 프로퍼티를 사용할 수 있다.


	}

}
