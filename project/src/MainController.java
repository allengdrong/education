// [MainController ----------------------]
public class MainController {

	public static void main(String[] args) {

		// main 시작 출력
		System.out.println("MainController.main() - 시작");

		// BoardController로 이동 실행 : 생성(생성자-new)하고 메서드 execute()를 호출한다.
		BoardController boardcontroll = new BoardController();
		boardcontroll.execute();


		// 다시 돌아와서 출력한다.
		System.out.println("MainController.main() 돌아옴 - 끝");

	}

}
