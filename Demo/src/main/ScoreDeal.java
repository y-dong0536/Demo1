package main;

import java.util.List;
import java.util.Map;

import pojo.People;

/**
 * 统计班级每一科成绩的平均分，最高分
 * 
 * @author 张国庆
 */
public class ScoreDeal {

	// 最高分
	public int MaxScore(List<People> peopleList, String scoreclass) // 输入对象列表和想要查找的科目，返回对应科目最高分
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

	// 平均分
	public double AverageScore(List<People> peopleList, String scoreclass) // 输入对象列表和想要查找的科目，返回对应科平均分
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
