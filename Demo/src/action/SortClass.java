package action;

import java.util.List;
import java.util.Map;
import pojo.People;
/**
 * 按照总成绩进行排序
 * @author 王微渊
 */
public interface SortClass {
	Map SortResult(List<People> peopleList);
}
