import java.util.ArrayList;
import java.util.List;

public class ScoreDeal {
	List<String> slist=new  ArrayList<String>();
	List<String> listPass = new ArrayList<String>();
	List<String> listFine = new ArrayList<String>();
	String max="0" ,mix="0";
	double mid=0.0,sum=0.0;
	int passsum=0;double pass=0.0;
	int finesum=0; double fpass=0.0;
	public ScoreDeal(List<String> lists) {
		slist=lists;
	}
	
	public String Max() {
	//求最大值
			for(int i=0;i<slist.size();i++) {
				if(slist.get(i).compareTo(max) >0)//string类型比较，若第一个大,返回大于0的值
				{
					max=slist.get(i);
				}
			}
			return max;
	}
		public String Mix() {	
			//最小值
			for(int i=0;i<slist.size();i++) {
				mix=slist.get(0);
				if(slist.get(i).compareTo(mix) <0)//string类型比较，若第一个大,返回大于0的值
				{
					mix=slist.get(i);
				}
			}
			return mix;
		}
		
		public double Mid() {

			//中值
			if(slist.size()%2==0)//数据总数为偶数
			{
				
				mid = (Integer.parseInt(slist.get(slist.size()/2-1))+Integer.parseInt(slist.get(slist.size()/2)))/2;
				  
			}else 
			{
				
				mid = Integer.parseInt(slist.get(slist.size()/2));
			}
			return mid;
		}
		
		
		public List<String> Pass() {
			//及格统计
			for(int i=0;i<slist.size();i++) {
				if(slist.get(i).compareTo("60") >0)//string类型比较，若第一个大,返回大于0的值
				{
					listPass.add(slist.get(i));
					passsum++;
				}
			}
			 pass=Double.valueOf(passsum) /slist.size()*100;//及格率
			return listPass;
			}
		
		public List<String> Fine(){
			//优秀统计
			
			for(int i=0;i<slist.size();i++) {
				if(slist.get(i).compareTo("80") >0)//string类型比较，若第一个大,返回大于0的值
				{
					listFine.add(slist.get(i));
					finesum++;
				}			
			}
			fpass=Double.valueOf(finesum) /slist.size()*100;//优秀率
			return listFine;
		}
			
			public double Average() {
			//平均值
			int i;
			for( i=0;i<slist.size();i++) {
				sum+=Integer.parseInt(slist.get(i));
			}
			return (sum/i);
			}
			
}
