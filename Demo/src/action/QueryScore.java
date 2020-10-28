package action;

import java.util.List;

import pojo.People;
/**
 * 根据ID查找学生信息
 * 根据姓名查找学生信息
 * @author 徐辉
 *
 */
public interface QueryScore {

//	void QueryId(List<People> peopleList, String id,String [] map01);
	void QueryId(List<People> peopleList, String id);
	void QueryName(List<People> peopleList, String name);
//	void QueryName(List<People> peopleList, String name,String [] map01);
}
