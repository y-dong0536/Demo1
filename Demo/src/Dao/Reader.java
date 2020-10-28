package Dao;
/**
 * 从本地text文件中读取数据
 * @author 王微渊
 */
public interface Reader {
	
	void rea();//从本地文件读取数据
	void zhuan(int i);//数据处理
	String getStudentId();
	String getName();
	String getChineseScore(); 
	String getMathScore(); 
	String getEnglishScore();
}
