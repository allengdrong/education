/*
 * 여러개의 메서드가 들어 있는 인터페이스를 상속 받아서 기본 구현을 해놓을 프로그램 - Adaptor Adaptor를 상속 받으면 필요한 메서드만 골라서 구현해도 오류가 없다.
 */

package ch08interface;

public class CalcuAdaptor implements CalcuInterface {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sum(int[] scores) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int avg(int sum, int cnt) {
		// TODO Auto-generated method stub
		return 0;
	}

}
