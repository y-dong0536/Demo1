package Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.Test;
import Dao.Reader;
import Dao.ReaderImpl;
import action.ScoreDeal;
import action.ScoreDealImpl;
import pojo.People;

/**
 * ��Ԫ������ ����ƽ��������߷�
 * 
 * @author �Ź���
 */
public class ZhangTest implements MyTest {

	ArrayList<People> people = new ArrayList<People>();

	@Test
	@Override
	public void TextD() {
		// TODO Auto-generated method stub

		Reader reader = new ReaderImpl();
		reader.rea();
		for (int i = 0; i < 51;) {
			reader.zhuan(i);
			people.add(new People(reader.getStudentId(), reader.getName(), reader.getChineseScore(),
					reader.getMathScore(), reader.getEnglishScore()));
			i += 10;
		}

		// ����Ӣ��߷ֲ���
		ScoreDeal scoredeal = new ScoreDealImpl();
		int ChineseS = scoredeal.MaxScore(people, "ChineseScore");
		int MathSc = scoredeal.MaxScore(people, "MathScore");
		int EnglishS = scoredeal.MaxScore(people, "EnglishScore");
		System.out.println(ChineseS + "  " + MathSc + "  " + EnglishS);
		assertEquals(98, ChineseS);
		assertEquals(92, MathSc);
		assertEquals(98, EnglishS);

		// ����Ӣ��ƽ���ֲ���
		double ChineseScore = scoredeal.AverageScore(people, "ChineseScore");
		double MathScore = scoredeal.AverageScore(people, "MathScore");
		double EnglishScore = scoredeal.AverageScore(people, "EnglishScore");

		assertEquals(90.33, (double) Math.round(ChineseScore * 100) / 100);// ƽ���ֱ�����λС��
		assertEquals(88.17, (double) Math.round(MathScore * 100) / 100);
		assertEquals(87.33, (double) Math.round(EnglishScore * 100) / 100);

	}

}
