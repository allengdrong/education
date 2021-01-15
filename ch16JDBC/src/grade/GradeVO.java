package grade;

public class GradeVO {

	private Long gradeNo;
	private String gradeName;

	public Long getGradeNo() {
		return gradeNo;
	}

	public void setGradeNo(long gradeNo) {
		this.gradeNo = gradeNo;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	@Override
	public String toString() {
		return "GradeVO [gradeNo=" + gradeNo + ", gradeName=" + gradeName + "]";
	}


}
