package action;

import java.util.List;

import pojo.People;
/**
 * ����ID����ѧ����Ϣ
 * ������������ѧ����Ϣ
 * @author ���
 *
 */
public interface QueryScore {

//	void QueryId(List<People> peopleList, String id,String [] map01);
	void QueryId(List<People> peopleList, String id);
	void QueryName(List<People> peopleList, String name);
//	void QueryName(List<People> peopleList, String name,String [] map01);
}
