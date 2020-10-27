package Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.Test;
import Dao.Reader;
import main.ScoreDeal;
import pojo.People;
/**
 * 单元测试类
 * 测试平均分与最高分
 * @author 张国庆
 *
 */
public class ZhangTest {
	
//	public static void main(String[] args) {
//		TestData();
//		Text();
//	}
	ArrayList<People> people = new ArrayList<People>();
	@Test
	public void TestData() {
		// TODO Auto-generated method stub
		
		Reader reader = new Reader();
		reader.rea();
		for(int i=0;i<51;) {
		reader.zhuan(i);
		people.add( new People(reader.getStudentId(), reader.getName(), reader.getChineseScore(), reader.getMathScore(), reader.getEnglishScore()));
		i+=10;
		}
	}
	
	@Test
	public void Text() {
		// TODO Auto-generated method stub

		//语数英最高分测试
		ScoreDeal scoredeal = new ScoreDeal();
		int chineseSc= scoredeal.MaxScore(people, "ChineseScore");
		int MathSc = scoredeal.MaxScore(people, "MathScore");
		int EnglishS = scoredeal.MaxScore(people, "EnglishScore");
		assertEquals(99,chineseSc);
		assertEquals(92,MathSc);
		assertEquals(98,EnglishS);

	//语数英的平均分测试	
		double ChineseScore = scoredeal.AverageScore(people, "ChineseScore");
		
		double MathScore = scoredeal.AverageScore(people, "MathScore");
		
		double	EnglishScore = scoredeal.AverageScore(people, "EnglishScore");
		
		assertEquals(90.5,ChineseScore);
		assertEquals(88.16,MathScore);
		assertEquals(87.33,EnglishScore);
	}
}
