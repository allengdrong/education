package com.webjjang.member.vo;

public class MemberVO {

	int no;
	String name;
	{
		no = 1;
		name = "고선호";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[회원번호 : " + no + " , " + "이름 : " + name + "]";
	}


}
