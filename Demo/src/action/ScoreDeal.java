package action;

import java.util.List;

import pojo.People;
/**
 * 查找班级最高分
 * 查找班级平均分
 * @author 张国庆
 */
public interface ScoreDeal {
	int MaxScore(List<People> peopleList, String scoreclass);
	double AverageScore(List<People> peopleList, String scoreclass);
}
