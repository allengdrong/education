package ch07inheritance;

public class BoardDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 추상 클래스로 생성 가능 한가? -> 구현 가능하나 list와 write 추상메서드들에 대한 구현을 직접 해야만 한다.
		BoardDAO dao1 = new BoardDAO() {

			@Override
			public void write() {
				// TODO Auto-generated method stub
				System.out.println("추상클래스의 추상메서드 write() 직접구현");

			}

			@Override
			public void list() {
				// TODO Auto-generated method stub
				System.out.println("추상클래스의 추상메서드 list() 직접구현");

			}
		};
		dao1.write();
		dao1.view();

		OracleBoardDAO odao = new OracleBoardDAO();
		odao.list();
		MySQLBoardDAO mdao = new MySQLBoardDAO();
		mdao.list();
		// 오라클에서 처리되는 리스트
		execute(odao, 1);
		// MySQL에서 처리되는 리스트
		execute(mdao, 1);

	}

	public static void execute(BoardDAO dao, int menu) {
		switch (menu) {
			case 1: // 1. list
				dao.list();
				break;
			case 2: // 2. view
				dao.increase();
				dao.view();
				break;
			case 3: // 3. write
				dao.write();
				break;
			case 4: // 4. update
				dao.update();
				break;
			case 5: // 5. delete
				dao.delete();
				break;
			default:
				System.out.println("BoardDAOTest.excute() - 처리 선택번호가 아닙니다.");
		}
	}

}
