import java.util.ArrayList;
import java.util.List;

public class ScoreSection {

	int s20=0,s40=0,s60=0,s80=0,s100=0;
	
	public ScoreSection(List<String> lists) {
		
		for (String aa1 : lists) {
			if(aa1.compareTo("21") <0)//string类型比较，若第一个大,返回大于0的值
				{s20++;}else if(aa1.compareTo("41") <0)
				{s40++;}else if(aa1.compareTo("61") <0) 
				{s60++;}else if(aa1.compareTo("81") <0)
				{s80++;}else 
				{
					s100++;
				}
			
		}
	}
	
	
}
