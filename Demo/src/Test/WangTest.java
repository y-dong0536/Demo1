package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import Dao.*;
import action.*;

import pojo.People;

public class WangTest implements MyTest {
 String[] name = { "刘七", "王五", "张三", "赵六", "吴八", "李四" };
 String[] score = { "249", "258", "260", "270", "278", "280" };
 Map<String, String> testMap = new HashMap<>();
 Map<String, String> map = new HashMap<>();
 ArrayList<People> people = new ArrayList<People>();


 @Test
@Override
public void TextD() {
	  for (int i = 0; i < name.length; i++) {
		   map.put(name[i], score[i]);
		  }

		  Reader reader = new ReaderImpl();// 调用 Reader
		  reader.rea();
		  for (int i = 0; i < 51;) {
		   reader.zhuan(i);
		   people.add(new People(reader.getStudentId(), reader.getName(), reader.getChineseScore(),
		     reader.getMathScore(), reader.getEnglishScore()));
		   i += 10;
		  }

		  SortClass cn = new SortClassImpl(); 
		  testMap = cn.SortResult(people);
		  System.out.println(testMap);
		  assertEquals(map, testMap);
	
}
}