package main;

import java.util.List;

import pojo.People;
/**
 * ����ID������������ѧ����Ϣ
 * 
 * @author ���
 */
public class QueryScore {

	public void QueryId(List<People> peopleList, String id) // �������͵��б�,id
	{
		for (People people : peopleList) {
			if (people.getStudentId().equals(id)) {
				System.out.println("ѧ��ID:" + people.getStudentId() + " , ����:" + people.getName() + " , ���ĳɼ�:"
						+ people.getChineseScore() + " , ��ѧ�ɼ�:" + people.getMathScore() + " , Ӣ��ɼ�:"
						+ people.getEnglishScore());
				return;
			}
			else {
				System.out.println("δ�鵽�����Ϣ��");
				return;
			}
		}
	}

	public void QueryName(List<People> peopleList, String name) // �������͵��б�,����
	{
		for (People people : peopleList) {
			if (people.getName().equals(name)) {
				System.out.println("ѧ��ID:" + people.getStudentId() + " , ����:" + people.getName() + " , ���ĳɼ�:"
						+ people.getChineseScore() + " , ��ѧ�ɼ�:" + people.getMathScore() + " , Ӣ��ɼ�:"
						+ people.getEnglishScore());
				return;
			}
			else {
				System.out.println("δ�鵽�����Ϣ��");
				return;
			}
		}
	}

}
