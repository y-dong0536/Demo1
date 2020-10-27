package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Dao.Reader;
import pojo.People;
/**
 * 
 * @author 杨栋
 *
 */
public class MainDemo {

	public static void main(String[] args) {
		
		int sum = 0;// 总分
		double aveScore = 0.0;// 平均分

		ArrayList<People> people = new ArrayList<People>();
		Reader reader = new Reader();
		reader.rea();
		for(int i=0;i<51;)
		{
		reader.zhuan(i);
		people.add( new People(reader.getStudentId(), reader.getName(), reader.getChineseScore(), reader.getMathScore(), reader.getEnglishScore()));
		i+=10;
		}

		// 学生成绩
		System.out.println("学生成绩:" + "\n" + people.toString());
		System.out.println("\n");
		// 按照总成绩进行排序
		Map map = new HashMap();
		// System.out.println("排序前------------->" + map);
		SortClass cn = new SortClass();// 调用SortClass类
		map = cn.SortResult(people);// 升序排序
		System.out.println("按总成绩进行排序:" + map);

		// 统计每一科最高分
		ScoreDeal scoredeal = new ScoreDeal();
		sum = scoredeal.MaxScore(people, "ChineseScore");
		System.out.println("语文成绩的最高分:" + sum);
		sum = scoredeal.MaxScore(people, "MathScore");
		System.out.println("数学成绩的最高分:" + sum);
		sum = scoredeal.MaxScore(people, "EnglishScore");
		System.out.println("英语成绩的最高分:" + sum);

		// 统计每科平均分

		aveScore = scoredeal.AverageScore(people, "ChineseScore");
		System.out.println("语文成绩的平均分:" + (int) (aveScore * 100) / 100.0);
		aveScore = scoredeal.AverageScore(people, "MathScore");
		System.out.println("数学成绩的平均分:" + (int) (aveScore * 100) / 100.0);
		aveScore = scoredeal.AverageScore(people, "EnglishScore");
		System.out.println("英语成绩的平均分:" + (int) (aveScore * 100) / 100.0);

		// 按学号或姓名查找成绩
		QueryScore queryscore = new QueryScore();
		// 创建Scanner对象，接受从控制台输入
		
		boolean query = true;
		while (query) {
			System.out.println("\n" + "按照“学号”还是“姓名”查询成绩？   输入“退出” 结束查询");
			Scanner input = new Scanner(System.in);
			String aa=input.next();
			if (aa.equals("学号")) {
				System.out.println("请输入学号:");
				String n = input.next();// 接受输入的信息
				queryscore.QueryId(people, n);
				continue;
			} else if (aa.equals("姓名")) {
				
				System.out.println("请输入姓名:");
				String n = input.next();// 接受输入的信息
				queryscore.QueryName(people, n);
			} else if (aa.equals("退出")) {
				System.out.println("成功退出！");
				query = false;
				continue;
			} else {
				System.out.println("输入不合法，请重新输入！");
				continue;
			}

		}

	}
}
