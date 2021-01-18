/*
 * 출력에 관련된 객체 position(), menu(), greeting()
 */

package com.webjjang.util;

public class Output {

	// str 문자열을 받아서 cnt만큼 반복해서 출력한다.
	public static void line(String str, int cnt) {
		for (int i = 1; i <= cnt; i++)
			System.out.print(str);
		// 줄바꿈
		System.out.println();
	}

	// 환영인사, 작별인사
	public static void greeting(String str) {
		line("*", 30);
		System.out.println("* " + str);
		line("*", 30);
	}

	// 위치 정보 출력하기
	public static void position(String p) {
		line("-", 30);
		System.out.println("- position : " + p);
		line("-", 30);
	}

	// 메뉴 출력
	public static void menu(String... strs) {
		line("-", 40);
		for (String str : strs)
			System.out.println("- " + str);
		line("-", 40);
	}

	// 실행 위치 확인을 위한 출력
	public static void exePos(String str) {
		System.out.println("***+++ " + str + " +++***");

	}

}
