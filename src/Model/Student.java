package Model;

public class Student {
	private int age;
	private String name, sex;
	private int id;
	private float score;
	
	public Student(int id, String name,String sex, int age, float score){
		this.id=id;
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.score=score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public String getSex(){
		return this.sex;
	}
	public void setSex(String sex){
		this.sex=sex;
		
	}
	public void setScore(float score){
		this.score=score;
	}
	public float getScore(){
		return this.score;
	}

	public static int scoreCompare(Student s1,Student s2){
		return s1.getScore()>s2.getScore()?1:-1;
	}
	
	public static int nameCompare(Student s1,Student s2){
		return s1.getName().compareTo(s2.getName());
	}
	
	public static String[] getFields(){
		String[] s={"ID", "NAME", "SEX", "AGE", "SCORE"};
		return s;
	}
	public Object[] getData(){
		Object[] data= {this.id, this.name, this.sex, this.age, this.score};
		return data;
	}
	@Override
	public String toString(){
		return this.id+"/"+this.name+"/"+this.sex+"/"+this.age+"/"+this.score;
	}
	
}
