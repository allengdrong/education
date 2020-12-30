package com.java.main.controller.MainController;

import java.util.Scanner;
import com.java.board.controller.BoardController.BoardController;
import com.java.qna.controller.QnaController.QnaController;

public class MainController {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("=====================");
		System.out.println("    방문을 환영합니다.    ");
		System.out.println("=====================");

		while (true) {

			System.out.println("+-------------------+");
			System.out.println("      위치 > main      ");
			System.out.println("+-------------------+");

			System.out.println("---------------------");
			System.out.println("1.게시판  2.질문답변  0.종료");
			System.out.println("---------------------");

			System.out.print("메뉴선택 (1,2,0) --> ");

			String menu = scanner.nextLine();

			switch (menu) {
				case "1":
					System.out.println("게시판 이동");
					execute(new BoardController());
					break;
				case "2":
					System.out.println("질문답변 이동");
					execute(new QnaController());
					break;
				case "0":
					System.out.println("종료합니다.");
					System.exit(0);
					break;
				default:
					System.out.println("잘못된 메뉴를 선택하셨습니다.");
					break;
			}
		}
	}

	private static void execute(Controller controller) {
		controller.execute();

	}

}
