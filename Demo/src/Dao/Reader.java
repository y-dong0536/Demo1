package Dao;
/**
 * �ӱ���text�ļ��ж�ȡ����
 * @author ��΢Ԩ
 */
public interface Reader {
	
	void rea();//�ӱ����ļ���ȡ����
	void zhuan(int i);//���ݴ���
	String getStudentId();
	String getName();
	String getChineseScore(); 
	String getMathScore(); 
	String getEnglishScore();
}
