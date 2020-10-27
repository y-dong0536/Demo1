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
 * @author �
 *
 */
public class MainDemo {

	public static void main(String[] args) {
		
		int sum = 0;// �ܷ�
		double aveScore = 0.0;// ƽ����

		ArrayList<People> people = new ArrayList<People>();
		Reader reader = new Reader();
		reader.rea();
		for(int i=0;i<51;)
		{
		reader.zhuan(i);
		people.add( new People(reader.getStudentId(), reader.getName(), reader.getChineseScore(), reader.getMathScore(), reader.getEnglishScore()));
		i+=10;
		}

		// ѧ���ɼ�
		System.out.println("ѧ���ɼ�:" + "\n" + people.toString());
		System.out.println("\n");
		// �����ܳɼ���������
		Map map = new HashMap();
		// System.out.println("����ǰ------------->" + map);
		SortClass cn = new SortClass();// ����SortClass��
		map = cn.SortResult(people);// ��������
		System.out.println("���ܳɼ���������:" + map);

		// ͳ��ÿһ����߷�
		ScoreDeal scoredeal = new ScoreDeal();
		sum = scoredeal.MaxScore(people, "ChineseScore");
		System.out.println("���ĳɼ�����߷�:" + sum);
		sum = scoredeal.MaxScore(people, "MathScore");
		System.out.println("��ѧ�ɼ�����߷�:" + sum);
		sum = scoredeal.MaxScore(people, "EnglishScore");
		System.out.println("Ӣ��ɼ�����߷�:" + sum);

		// ͳ��ÿ��ƽ����

		aveScore = scoredeal.AverageScore(people, "ChineseScore");
		System.out.println("���ĳɼ���ƽ����:" + (int) (aveScore * 100) / 100.0);
		aveScore = scoredeal.AverageScore(people, "MathScore");
		System.out.println("��ѧ�ɼ���ƽ����:" + (int) (aveScore * 100) / 100.0);
		aveScore = scoredeal.AverageScore(people, "EnglishScore");
		System.out.println("Ӣ��ɼ���ƽ����:" + (int) (aveScore * 100) / 100.0);

		// ��ѧ�Ż��������ҳɼ�
		QueryScore queryscore = new QueryScore();
		// ����Scanner���󣬽��ܴӿ���̨����
		
		boolean query = true;
		while (query) {
			System.out.println("\n" + "���ա�ѧ�š����ǡ���������ѯ�ɼ���   ���롰�˳��� ������ѯ");
			Scanner input = new Scanner(System.in);
			String aa=input.next();
			if (aa.equals("ѧ��")) {
				System.out.println("������ѧ��:");
				String n = input.next();// �����������Ϣ
				queryscore.QueryId(people, n);
				continue;
			} else if (aa.equals("����")) {
				
				System.out.println("����������:");
				String n = input.next();// �����������Ϣ
				queryscore.QueryName(people, n);
			} else if (aa.equals("�˳�")) {
				System.out.println("�ɹ��˳���");
				query = false;
				continue;
			} else {
				System.out.println("���벻�Ϸ������������룡");
				continue;
			}

		}

	}
}
