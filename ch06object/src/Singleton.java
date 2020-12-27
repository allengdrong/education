
public class Singleton {

	// 2. 생성해서 저장해 둔다.
	private static Singleton singleton = new Singleton();

	// 1. 같은 클래스에서만 생성이 가능하다.
	private Singleton() {

	}

	// 3. 다른 곳에서 값(주소)을 가져갈수 있는 메서드를 만든다.
	public static Singleton getInstance() {
		return singleton;
	}
}
