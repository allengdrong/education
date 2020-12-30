package ch15collection;

import java.util.ArrayList;
import java.util.List;

// Collection -> List -> ArrayList : 데이터의 나열 - 배열로 운영 - 검색이 빠르다. 데이터가 자주 수정이 되면 느려진다.
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 13장 제네릭 -> 저장 장소(변수)의 타입을 밖에서 선언해서 그 타입에 맞는 것만 저장할 수 있도록 변수 타입에 대한 코드를 만들어 주는 것
		List<Object> list = new ArrayList<Object>();

		// list에 개인 정보를 저장해 보자..
		list.add("고선호"); // String 타입 -> Object : Object를 상속 받았으므로 자동캐스팅
		// int의 랩퍼클래스 : Integer - int를 안에 가지고 있으면서 처리를 가능하게 하는 클래스
		// int <==> Integer : 캐스팅 없이 사용 가능하다. 박싱, 언박싱이 자동으로 이루어진다. 오토박싱, 오토 언박싱
		int x = 50;
		Integer xi = x; // 오토박싱 int -> Integer
		x = xi; // int : 오토 언박싱
		list.add(50); // int -> Integer -> Object
		list.add(xi); // Integer -> Object


		boolean gender = true;
		Boolean genderB = gender; // 오토박싱
		list.add(genderB);
		list.add(gender); // boolean -> Boolean -> Object


		System.out.println(list);

		// 문자열만 저장할 수 있는 list객체
		// list 안에 저장하는 데이터의 타입이 STring으로 만들어 진다.
		List<String> stringList = new ArrayList<>();
		stringList.add("이젠");
		// stringList.add(10); // stringList는 String만 저장할 수 있도록 제네릭했다.(만들어 놓았다.) -> 오류가 난다.
		List<Integer> intList = new ArrayList<>(); // list 객체는 Object만 상대한다. 선언할때 Object가 아닌 int로 할수
													// 없다. 오류
		intList.add(10); // 10 : int -> Integer :

		// BoardVO만 저장할 수 있는 list
		// list 안에 아무거나 넣어 놓으면 데이터를 꺼내서 사용을 하려고 하면
		List<BoardVO> boardList = new ArrayList();
		BoardVO vo1 = new BoardVO();
		vo1.setNo(100);
		boardList.add(vo1);
		// boardList.add("고선호"); BoardVO 데이터가 아니면 오류가 난다.
		boardList.add(new BoardVO()); // no는 기본 초기값인 0이 들어간다.
		System.out.println(boardList);
		System.out.println(boardList.size());
		// 데이터를 하나씩 꺼내서 출력하는 프로그램 작성
		for (int i = 0; i < boardList.size(); i++) {
			// 객체가 출력된다.
			System.out.println(boardList.get(i));
			// 객체안에 있는 no 출력
			System.out.println(boardList.get(i).getNo());
		}

		// 데이터를 하나씩 꺼내서 출력하는 프로그램 작성
		for (int i = 0; i < boardList.size(); i++) {
			// 객체가 출력된다.
			System.out.println(boardList.get(i));
			// 객체안에 있는 no 출력
			System.out.println(boardList.get(i).getNo());
		}
		// 주소를 꺼내와서 내용을 변경하려면 원래의 것인 주소를 찾아가면 같은 주소이므로 변경된 내용으로 사용이 된다.
		boardList.get(1).setNo(500);

		// 실제적으로는 가져온 모든 데이터를 대상으로 데이터 출력 -? foreach == 향상된 for
		for (BoardVO vo : boardList)
			System.out.println(vo.getNo());

	} // end of main

	// 내부 클래스 : Inner Class - 안에서 서로 연관되어 있는 것을 꺼내서 독자적으로 동작을 하도록 모아 놓은 것 - 안에서만 사용하는 경우가 많다.
	// class BoardVO {

	// }

} // end of class
	// 클래스 - 안에서 서로 연관되어 있는 것을 꺼내서 독자적으로 동작을 하도록 모아 놓은 것 - 위의 public 클래스에서 주로 사용하는 경우가 많다.
	// 컴파일을 하면 클래스 파일이 따로 만들어 진다.


class BoardVO {
	private int no;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

}
