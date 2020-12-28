package ch07inheritance;

public class Car {

	private String model;
	private String company;

	// 생성자
	// 기본생성자
	public Car() {}

	// 데이터 초기화하는 생성자
	public Car(String model, String company) {
		this.model = model;
		this.company = company;
	}

	// getter()와 setter()
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void start() {
		System.out.println("출발한다.");
	}

	public void stop() {
		System.out.println("멈춘다.");
	}

	public String toString() {
		System.out.println("Car.toString()");
		return "model = " + model + ", company = " + company;
	}
}
