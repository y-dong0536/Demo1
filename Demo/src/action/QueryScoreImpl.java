package action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pojo.People;

/**
 * ����ID������������ѧ����Ϣ
 * 
 * @author ���
 */
public class QueryScoreImpl implements QueryScore {

	String[] str = { "ѧ��ID:", "����:", "���ĳɼ�:", "��ѧ�ɼ�:", "Ӣ��ɼ�:" };
	Map<String, String> map = new HashMap<>();

	// public void QueryId(List<People> peopleList, String id ,String [] map01)
	public void QueryId(List<People> peopleList, String id) // �������͵��б�,id
	{ // Set<String> keys = map.keySet();
		for (People people : peopleList) {
			// int x=0;
			if (people.getStudentId().equals(id)) {

				System.out.println("ѧ��ID:" + people.getStudentId() + " , ����:" + people.getName() + " , ���ĳɼ�:"
						+ people.getChineseScore() + " , ��ѧ�ɼ�:" + people.getMathScore() + " , Ӣ��ɼ�:"
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

		System.out.println("δ�鵽�����Ϣ��");
		return;

	}

	public void QueryName(List<People> peopleList, String name) // �������͵��б�,����
	{
		for (People people : peopleList) {
			int x = 0;
			if (people.getName().equals(name)) {

				System.out.println("ѧ��ID:" + people.getStudentId() + " , ����:" + people.getName() + " , ���ĳɼ�:"
						+ people.getChineseScore() + " , ��ѧ�ɼ�:" + people.getMathScore() + " , Ӣ��ɼ�:"
						+ people.getEnglishScore());

				// map01[x++]=people.getStudentId();
				// map01[x++]=people.getName();
				// map01[x++]=people.getChineseScore();
				// map01[x++]=people.getMathScore();
				// map01[x++]=people.getEnglishScore();
				return;
			}
		}

		System.out.println("δ�鵽�����Ϣ��");
		return;

	}

}
