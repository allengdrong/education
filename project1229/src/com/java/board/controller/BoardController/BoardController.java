package com.java.board.controller.BoardController;

import java.util.Scanner;
import com.java.main.controller.MainController.Controller;

public class BoardController implements Controller {

	Scanner scanner = new Scanner(System.in);

	public void execute() {


		while (true) {

			try {

				System.out.println("+-------------------+");
				System.out.println("  위치 > main > 게시판   ");
				System.out.println("+-------------------+");

				System.out.println("---------------------");
				System.out.println("1.리스트 2.글보기 3.글쓰기");
				System.out.println("4.글수정 5.글삭제 0.이전메뉴");
				System.out.println("---------------------");

				System.out.print("메뉴선택(1~5, 0) --> ");

				String menu = scanner.nextLine();
				switch (menu) {
					case "1":
						System.out.println("게시판 리스트 처리");
						break;
					case "2":
						System.out.println("게시판 글보기 처리");
						break;
					case "3":
						System.out.println("게시판 글쓰기 처리");
						break;
					case "4":
						System.out.println("게시판 글수정 처리");
						break;
					case "5":
						System.out.println("게시판 글삭제 처리");
						break;
					case "0":
						return;
					default:
						System.out.println("잘못된 메뉴를 선택하셨습니다.");
						break;
				}
			} catch (Exception e) {

			}
		}

	}

}
