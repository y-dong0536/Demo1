import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		String max="";//求最大值
		int sum=0;
		String mix="";
		double mid=0.0,average=0.0;
		double pass=0.0,fine=0.0;
		int s20=0,s40=0,s60=0,s80=0,s100=0;//统计区间
		List<String> listPass = new ArrayList<String>();
		List<String> listFine = new ArrayList<String>();
		List<String> lists = new ArrayList<String>();
		
		
		lists.add("50");
		lists.add("70");
		lists.add("90");
		lists.add("60");
		lists.add("85");
		
		ScoreDeal scoreDeal=new ScoreDeal(lists);
		System.out.println("成绩统计："+lists);
		
		List<Integer> mylist= new ArrayList<Integer>();
		
		mylist.add(70);
		mylist.add(90);
		mylist.add(60);
		mylist.add(85);
		mylist.add(80);
		
		////////////////////SortClass sc=new SortClass();
		///                 sc.sort(att);
		
		
		// lists中的对象String 本身含有compareTo方法，所以可以直接调用sort方法，按自然顺序排序，即升序排序
		//Collections.sort(lists);
		
		SortA sorta=new SortA();
		sorta.SortResult(lists);
		
		
		////////////////////////
		
		//求最大值
//		for(int i=0;i<lists.size();i++) {
//			if(lists.get(i).compareTo(max) >0)//string类型比较，若第一个大,返回大于0的值
//			{
//				max=lists.get(i);
//			}
//		}
		max=scoreDeal.Max();
		
		//最小值
//		for(int i=0;i<lists.size();i++) {
//			mix=lists.get(0);
//			if(lists.get(i).compareTo(mix) <0)//string类型比较，若第一个大,返回大于0的值
//			{
//				mix=lists.get(i);
//			}
//		}
		mix=scoreDeal.Mix();
		
		//中值
//		if(lists.size()%2==0)//数据总数为偶数
//		{
//			
//			mid1 = (Integer.parseInt(lists.get(lists.size()/2-1))+Integer.parseInt(lists.get(lists.size()/2)))/2;
//			  
//		}else 
//		{
//			
//			mid1 = Integer.parseInt(lists.get(lists.size()/2));
//		}
//		
//		if(lists.size()%2==0)//数据总数为偶数
//		{
//			int mid11,a,b,c,d,e,f=0;
//			a=(mylist.size()/2)-1;
//			b=mylist.get(a);
//			c=mylist.size()/2;
//			d=mylist.get(c);
//			e=(b+d)/2;
//			  mid11= (mylist.get(mylist.size()/2-1)+mylist.get(mylist.size()/2))/2;
//			  
//		}
		mid=scoreDeal.Mid();
		
		//及格率
//		int passsum=0;double pass=0.0;
//		for(int i=0;i<lists.size();i++) {
//			if(lists.get(i).compareTo("60") >0)//string类型比较，若第一个大,返回大于0的值
//			{
//				listPass.add(lists.get(i));
//				passsum++;
//			}
//			
//			pass=Double.valueOf(passsum) /lists.size()*100;
//			
//		}
		listPass=scoreDeal.Pass();
		pass=scoreDeal.pass;
		//优秀率
//		int finesum=0; double fpass=0.0;
//		for(int i=0;i<lists.size();i++) {
//			if(lists.get(i).compareTo("80") >0)//string类型比较，若第一个大,返回大于0的值
//			{
//				listFine.add(lists.get(i));
//				finesum++;
//			}			
//		}
//		fpass=Double.valueOf(finesum) /lists.size()*100;
		
		
		listFine=scoreDeal.Fine();
		fine=scoreDeal.fpass;
		
		//平均值
//		int i;
//		for( i=0;i<lists.size();i++) {
//			sum+=Integer.parseInt(lists.get(i));
//		}
//		double average=sum/i;
		average=scoreDeal.Average();
		/////////////////
		
		//统计区间， 0-20  *个  21-40  *个
		
//		int s20=0,s40=0,s60=0,s80=0,s100=0;
//		for (String aa1 : lists) {
//			if(aa1.compareTo("21") <0)//string类型比较，若第一个大,返回大于0的值
//				{s20++;}else if(aa1.compareTo("41") <0)
//				{s40++;}else if(aa1.compareTo("61") <0) 
//				{s60++;}else if(aa1.compareTo("81") <0)
//				{s80++;}else 
//				{
//					s100++;
//				}
//			
//		}
	ScoreSection scoreSection=new ScoreSection(lists);
	s20=scoreSection.s20;
	s40=scoreSection.s40;
	s60=scoreSection.s60;
	s80=scoreSection.s80;
	s100=scoreSection.s100;
		
		
		
//		List<SortA> listA = new ArrayList<SortA>();
//		SortA a1 = new SortA();
//		a1.setName("a");
//		a1.setOrder(2);
//		SortA a2 = new SortA();
//		a2.setName("b");
//		a2.setOrder(1);
//		SortA a3 = new SortA();
//		a3.setName("c");
//		a3.setOrder(5);
//		listA.add(a1);
//		listA.add(a2);
//		listA.add(a3);
//		// list中的对象A实现Comparable接口
//		Collections.sort(listA);

		
		
		System.out.println("成绩排名："+lists);
		System.out.println("最高分"+max);
		System.out.println("最低分"+mix);
		System.out.println("中值"+mid);
		System.out.println("平均值"+average);
		
		
		System.out.print("及格分统计");
		for (String aa1 : listPass) {
			System.out.print(aa1+"  ");
		}
		System.out.println("\t");
		System.out.println("及格率"+pass+"%");
		System.out.println("\t");
		
		System.out.print("优秀分统计");
		for (String aa1 : listFine) {
			System.out.print(aa1+"  ");
		}
		System.out.println("\t");
		System.out.println("优秀率"+fine+"%");
		System.out.println("\t");
		
		System.out.println("区间分布");
		System.out.println("0-20分:"+s20+"  "+"21-40分:"+s40+"  "+"41-60分:"+s60+"  "+"61-80分:"+s80+"  "+"81-100分:"+s100+" ");

	}

}
