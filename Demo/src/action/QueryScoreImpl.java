package action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pojo.People;

/**
 * 根据ID或者姓名查找学生信息
 * 
 * @author 徐辉
 */
public class QueryScoreImpl implements QueryScore {

	String[] str = { "学生ID:", "姓名:", "语文成绩:", "数学成绩:", "英语成绩:" };
	Map<String, String> map = new HashMap<>();

	// public void QueryId(List<People> peopleList, String id ,String [] map01)
	public void QueryId(List<People> peopleList, String id) // 对象类型的列表,id
	{ // Set<String> keys = map.keySet();
		for (People people : peopleList) {
			// int x=0;
			if (people.getStudentId().equals(id)) {

				System.out.println("学生ID:" + people.getStudentId() + " , 姓名:" + people.getName() + " , 语文成绩:"
						+ people.getChineseScore() + " , 数学成绩:" + people.getMathScore() + " , 英语成绩:"
						+ people.getEnglishScore());
				// for(People people1 : peopleList) {
				// map01[x++]=people.getStudentId();
				// map01[x++]=people.getName();
				// map01[x++]=people.getChineseScore();
				// map01[x++]=people.getMathScore();
				// map01[x++]=people.getEnglishScore();
				return;
				// }

			}
		}

		System.out.println("未查到相关信息！");
		return;

	}

	public void QueryName(List<People> peopleList, String name) // 对象类型的列表,姓名
	{
		for (People people : peopleList) {
			int x = 0;
			if (people.getName().equals(name)) {

				System.out.println("学生ID:" + people.getStudentId() + " , 姓名:" + people.getName() + " , 语文成绩:"
						+ people.getChineseScore() + " , 数学成绩:" + people.getMathScore() + " , 英语成绩:"
						+ people.getEnglishScore());

				// map01[x++]=people.getStudentId();
				// map01[x++]=people.getName();
				// map01[x++]=people.getChineseScore();
				// map01[x++]=people.getMathScore();
				// map01[x++]=people.getEnglishScore();
				return;
			}
		}

		System.out.println("未查到相关信息！");
		return;

	}

}
