package pojo;
/**
 * ѧ��ʵ����
 * ������ѧ�� ������ �����ĳɼ� ����ѧ�ɼ��� Ӣ��ɼ� 
 * 
 * @author �
 */
public class People {
	private String studentId; // ѧ��
	private String name;
	private String chineseScore;
	private String mathScore;
	private String englishScore;

	// getters��setters
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

	// ���췽��
	public People() {
	}

	// ���ι��췽��
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
		return "ѧ��ID=" + studentId + ", ����=" + name + ", ���ĳɼ�=" + chineseScore + ", ��ѧ�ɼ�=" + mathScore + ", Ӣ��ɼ�="
				+ englishScore + "\n";
	}

}