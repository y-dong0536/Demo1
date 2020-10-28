package action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import pojo.*;

/**
 * 按照总成绩进行排序
 * 
 * @author 王微渊
 */
public class SortClassImpl implements SortClass{
	ArrayList<String> totalScore = new ArrayList<String>();// 存放总成绩
	Map<String, String> map = new HashMap<>();// 学号:总成绩
	int Score = 0;// 每个人的总成绩

	public Map SortResult(List<People> peopleList) // 对象类型的列表
	{
		for (People people : peopleList) {
			Score = Integer.parseInt(people.getChineseScore()) + Integer.parseInt(people.getMathScore())
					+ Integer.parseInt(people.getEnglishScore());
			map.put(people.getName(), Score + "");
		}
		return sortAscend(map);
	}

	// Map的value值升序排序
	public static <K, V extends Comparable<? super V>> Map<K, V> sortAscend(Map<K, V> map) {
		List<Map.Entry<K, V>> list = new ArrayList<Map.Entry<K, V>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			@Override
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				int compare = (o1.getValue()).compareTo(o2.getValue());
				return compare;
			}
		});

		
		Map<K, V> returnMap = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			returnMap.put(entry.getKey(), entry.getValue());
		}
		return returnMap;
	}
}
