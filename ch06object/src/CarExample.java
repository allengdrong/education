
public class CarExample {

	public static void main(String[] args) {

		// class Car를 사용해야한다. -> 생성 -> 호출
		// new : 객체 생성하는 키워드
		// new 뒤에 있는 Car() 이것을 생성자 : 생성할때 사용하는 것
		Car myCar = new Car();
		System.out.println(myCar);
		// 차종 출력
		System.out.println(myCar.model);
		myCar.model = "산타페";
		System.out.println(myCar.model);
		// print()를 호출한다. -> 그 메서드로 가서 실행하고 끝나면 다시 돌아온다.
		myCar.print();
		System.out.println("다시 여기는 main()입니다.");

	}

}
