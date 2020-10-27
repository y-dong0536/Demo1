package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import Dao.Reader;
import main.QueryScore;
import pojo.People;
/**
 * 单元测试
 * 测试根据ID或者姓名查找学生信息
 * @author Administrator
 *
 */
public class XuTest implements Test {

	public XuTest() {
		
		TestData();
	}
	static ArrayList<People> people = new ArrayList<People>();  //123
	
	@Override
	public void TestData() //1231323
	{
		
		Reader reader = new Reader();
		reader.rea();
		for (int i = 0; i < 51;) {
			reader.zhuan(i);
			people.add(new People(reader.getStudentId(), reader.getName(), reader.getChineseScore(),
					reader.getMathScore(), reader.getEnglishScore()));
			i += 10;
		}
	}
	@Override
	public void Text() {
	QueryScore queryscore = new QueryScore();
	
	
	queryscore.QueryName(people, "1");
	
	
	}
}
