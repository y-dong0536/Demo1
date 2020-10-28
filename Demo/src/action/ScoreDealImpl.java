package action;

import java.util.List;
import java.util.Map;

import pojo.People;

/**
 * ͳ�ư༶ÿһ�Ƴɼ���ƽ���֣���߷�
 * 
 * @author �Ź���
 */
public class ScoreDealImpl implements ScoreDeal{

	// ��߷�
	public int MaxScore(List<People> peopleList, String scoreclass) // ��������б����Ҫ���ҵĿ�Ŀ�����ض�Ӧ��Ŀ��߷�
	{

		if (scoreclass.equals("ChineseScore")) {
			int max = 0;
			for (People people : peopleList) {
				if (Integer.parseInt(people.getChineseScore()) > max) {
					max = Integer.parseInt(people.getChineseScore());
				}
			}
			return max;
		} else if (scoreclass.equals("MathScore")) {
			int max = 0;
			for (People people : peopleList) {
				if (Integer.parseInt(people.getMathScore()) > max) {
					max = Integer.parseInt(people.getMathScore());
				}
			}
			return max;
		} else {
			int max = 0;
			for (People people : peopleList) {
				if (Integer.parseInt(people.getEnglishScore()) > 0) {
					max = Integer.parseInt(people.getEnglishScore());
				}
			}
			return max;
		}
	}

	// ƽ����
	public double AverageScore(List<People> peopleList, String scoreclass) // ��������б����Ҫ���ҵĿ�Ŀ�����ض�Ӧ��ƽ����
	{
		if (scoreclass.equals("ChineseScore")) {
			double sum = 0.0;
			for (People people : peopleList) {
				sum += Double.parseDouble(people.getChineseScore());
			}

			return sum / peopleList.size();
		} else if (scoreclass.equals("MathScore")) {
			double sum = 0.0;
			for (People people : peopleList) {
				sum += Double.parseDouble(people.getMathScore());
			}

			return sum / peopleList.size();
		} else {
			double sum = 0.0;
			for (People people : peopleList) {
				sum += Double.parseDouble(people.getEnglishScore());
			}

			return sum / peopleList.size();
		}

	}

}
