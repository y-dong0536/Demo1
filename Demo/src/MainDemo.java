import java.util.ArrayList;
import java.util.Random;

import pojo.People;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr =new ArrayList();
		Random r = new Random(1);
		
		for (int i=0;i<10;i++) {
			People p=new People();
			p.setScore(r.nextInt(100));
			arr.add(p.getScore());
		}
		
	}

}
