package main;

import java.util.List;

import pojo.People;
/**
 * 根据ID或者姓名查找学生信息
 * 
 * @author 徐辉
 */
public class QueryScore {

	public void QueryId(List<People> peopleList, String id) // 对象类型的列表,id
	{
		for (People people : peopleList) {
			if (people.getStudentId().equals(id)) {
				System.out.println("学生ID:" + people.getStudentId() + " , 姓名:" + people.getName() + " , 语文成绩:"
						+ people.getChineseScore() + " , 数学成绩:" + people.getMathScore() + " , 英语成绩:"
						+ people.getEnglishScore());
				return;
			}
			else {
				System.out.println("未查到相关信息！");
				return;
			}
		}
	}

	public void QueryName(List<People> peopleList, String name) // 对象类型的列表,姓名
	{
		for (People people : peopleList) {
			if (people.getName().equals(name)) {
				System.out.println("学生ID:" + people.getStudentId() + " , 姓名:" + people.getName() + " , 语文成绩:"
						+ people.getChineseScore() + " , 数学成绩:" + people.getMathScore() + " , 英语成绩:"
						+ people.getEnglishScore());
				return;
			}
			else {
				System.out.println("未查到相关信息！");
				return;
			}
		}
	}

}
