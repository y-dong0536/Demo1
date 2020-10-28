package Dao;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 从本地text文件中读取数据
 * @author 王微渊
 *
 */
public class ReaderImpl implements Reader{
	String content = "";
	char[] chars = new char[1024];
	String studentId; // 学号

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

	public void setChineseScore(String chineseScore) {
		this.chineseScore = chineseScore;
	}

	public String getMathScore() {
		return mathScore;
	}

	public void setMathScore(String mathScore) {
		this.mathScore = mathScore;
	}

	public String getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(String englishScore) {
		this.englishScore = englishScore;
	}

	String name;
	String chineseScore;
	String mathScore;
	String englishScore;

	public void rea() {
		try {

			String path = "C://Users//Administrator//Desktop//101.txt";
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader inputStreamReader = new InputStreamReader(fis, "UTF-8");
			inputStreamReader.read(chars);
			// while (inputStreamReader.read(chars) > 0) {
			// content += new String(chars);
			// }
			inputStreamReader.close();
			fis.close();

		} catch (Exception e) {

		}
	}

	public void zhuan(int i) {

		studentId = String.valueOf(chars[i]);
		name = String.valueOf(chars[i + 1]) + String.valueOf(chars[i + 2]);
		chineseScore = String.valueOf(chars[i + 3]) + String.valueOf(chars[i + 4]);
		mathScore = String.valueOf(chars[i + 5]) + String.valueOf(chars[i + 6]);
		englishScore = String.valueOf(chars[i + 7]) + String.valueOf(chars[i + 8]);

	}

	public String toString() {
		return content;

	}

}
