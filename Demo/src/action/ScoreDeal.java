package action;

import java.util.List;

import pojo.People;
/**
 * ���Ұ༶��߷�
 * ���Ұ༶ƽ����
 * @author �Ź���
 */
public interface ScoreDeal {
	int MaxScore(List<People> peopleList, String scoreclass);
	double AverageScore(List<People> peopleList, String scoreclass);
}
