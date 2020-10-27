package pojo;
/**
 * 学生实体类
 * 包含：学号 ，姓名 ，语文成绩 ，数学成绩， 英语成绩 
 * 
 * @author 杨栋
 */
public class People {
	private String studentId; // 学号
	private String name;
	private String chineseScore;
	private String mathScore;
	private String englishScore;

	// getters和setters
	public void setChineseScore(String chineseScore) {
		this.chineseScore = chineseScore;
	}

	public void setMathScore(String mathScore) {
		this.mathScore = mathScore;
	}

	public void setEnglishScore(String englishScore) {
		this.englishScore = englishScore;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChineseScore() {
		return chineseScore;
	}

	public String getMathScore() {
		return mathScore;
	}

	public String getEnglishScore() {
		return englishScore;
	}

	// 构造方法
	public People() {
	}

	// 含参构造方法
	public People(String studentId, String name, String chineseScore, String mathScore, String englishScore) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.chineseScore = chineseScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
	}

	@Override
	public String toString() {
		return "学生ID=" + studentId + ", 姓名=" + name + ", 语文成绩=" + chineseScore + ", 数学成绩=" + mathScore + ", 英语成绩="
				+ englishScore + "\n";
	}

}