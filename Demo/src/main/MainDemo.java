package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Dao.Reader;
import Dao.ReaderImpl;
import action.QueryScore;
import action.QueryScoreImpl;
import action.ScoreDeal;
import action.ScoreDealImpl;
import action.SortClass;
import action.SortClassImpl;
import pojo.People;
/**
 * ʵ��:
 * �����ܳɼ���������(��΢Ԩ)
 * ͳ��ÿһ����߷�(�Ź���)
 * ͳ��ÿ��ƽ����(�Ź���)
 * ��ѧ�Ż��������ҳɼ�(���)
 * @author �
 */
public class MainDemo {

	public static void main(String[] args) {	
		int sum = 0;// �ܷ�
		double aveScore = 0.0;// ƽ����
		ArrayList<People> people = new ArrayList<People>();
		
		//�ӱ���text�ļ���ȡ����(��΢Ԩ)
		Reader reader = new ReaderImpl();
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
		
		// �����ܳɼ���������(��΢Ԩ)
		Map map = new HashMap();
		// System.out.println("����ǰ------------->" + map);
		SortClass cn = new SortClassImpl();// ����SortClass��
		map = cn.SortResult(people);// ��������
		System.out.println("���ܳɼ���������:" + map);

		// ͳ��ÿһ����߷�(�Ź���)
		ScoreDeal scoredeal = new ScoreDealImpl();
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

		// ��ѧ�Ż��������ҳɼ�(���)
		QueryScore queryscore = new QueryScoreImpl();
		// ����Scanner���󣬽��ܴӿ���̨����
		boolean query = true;
		//String [] sco=new String[100];
		while (query) {
			System.out.println("\n" + "���ա�ѧ�š����ǡ���������ѯ�ɼ���   ���롰�˳��� ������ѯ");
			Scanner input = new Scanner(System.in);
			String aa=input.next();
			if (aa.equals("ѧ��")) {
				System.out.println("������ѧ��:");
				String n = input.next();// �����������Ϣ
				//queryscore.QueryId(people,n,sco);
				queryscore.QueryId(people,n);
				//System.out.println("ѧ��ID:" + people.getStudentId()  + " , ����:" + sco[1] + " , ���ĳɼ�:"+ sco[2] + " , ��ѧ�ɼ�:" + sco[3] + " , Ӣ��ɼ�:"+ sco[4]);
				continue;
			} else if (aa.equals("����")) {
				
				System.out.println("����������:");
				String n = input.next();// �����������Ϣ
				//queryscore.QueryName(people, n,sco);
				queryscore.QueryName(people, n);
				continue;
				//System.out.println("ѧ��ID:" + sco[0] + " , ����:" + sco[1] + " , ���ĳɼ�:"+ sco[2] + " , ��ѧ�ɼ�:" + sco[3] + " , Ӣ��ɼ�:"+ sco[4]);
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
