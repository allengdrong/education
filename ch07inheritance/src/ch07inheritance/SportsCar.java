package ch07inheritance;

public class SportsCar extends Car {

	// 기본 생성자 생ㄱ략된 거 작성
	public SportsCar() {
		// Car(); -> 메서드로 인식. 부모 클래스의 생성자 호출 super() <- this()
		super();
	}

	// 모델과 제조사를 초기값으로 받는 생성자 작성
	public SportsCar(String model, String company) {
		super(model, company);
		// this.model = model; // super 상속받은 model은 private으로 선해서 상속할 수 없다.
		// this.setModel(model);
	}


	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// toString() 재정의 : 오버라이드
	public String toString() {
		System.out.println("SportsCar.toString()");
		return "SprotsCar[" + super.toString() + " , type = " + type + "]";
	}

}
