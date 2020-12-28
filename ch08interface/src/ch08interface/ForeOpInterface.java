package ch08interface;

public interface ForeOpInterface {

	// 단순 4칙연산 메서드
	public abstract int add(int x, int y); // interface는 abstract를 사용해도 되고 사용 안해도 된다. 모두 abstract
											// 이므로

	public int sub(int x, int y);

	// default 메서드 : 자바 8부터 구현이 가능하고 adaptor 프로그램에서 기본 메서드로 구현하던 것을 합쳐 놓은 것이다.
	// 상속받은 자식 클래스에서 재정의하여 사용하면 재정의한 것을 사용하고 아니면 기본 메서드를 사용하게 된다.
	public int mul(int x, int y);

	public int div(int x, int y);

}
