/*
 * 공지 게시판 데이터를 저장하는 객체 - 글번호, 제목, 내용, 시작일, 종료일, 수정일 작성일 : 2021.01.20 작성자 : 고선호
 */

package com.webjjang.notice.vo;

public class NoticeVO {

	private long no;
	private String title;
	private String content;
	private String startDate;
	private String endDate;
	private String updateDate;

	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "NoticeVO [no=" + no + ", title=" + title + ", content=" + content + ", startDate="
				+ startDate + ", endDate=" + endDate + ", updateDate=" + updateDate + "]";
	}


}
