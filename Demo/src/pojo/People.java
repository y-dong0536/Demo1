package pojo;


public class People {
	private String name;
	private String birthday;
	private String idCard;
	private char sex;
	private int age;
	private int score;
	
	//getters和setters
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//构造函数
	public People(){}
	public People(String name,String birthday,String idCard,char sex,int age,int score){
		this.name = name;
		this.birthday = birthday;
		this.idCard = idCard;
		this.sex = sex;
		this.age = age;
		this.score=score;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", birthday=" + birthday + ", idCard=" + idCard + ", sex=" + sex + ", age="
				+ age + ", score=" + score + "]";
	}
}