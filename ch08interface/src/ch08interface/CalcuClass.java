package ch08interface;

public class CalcuClass implements CalcuInterface {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}

	// @Override
	// public int mul(int x, int y) {
	// // TODO Auto-generated method stub
	// return 0;
	// }

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
