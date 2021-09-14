package prob04;

public class Person {
	private static int numberOfPerson = 0; // 전체 인구수
	private int age;
	private String name;
	
	/* 코드 작성 */
	public static int getNumberOfPerson() {
		return numberOfPerson;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//------------------------------------------------------------------------------
	
	public Person(String name) {
		this.setAge(12);
		this.setName(name);
		numberOfPerson++;
	}
	
	public Person(int age, String name) {
		this.setAge(age);
		this.setName(name);
		numberOfPerson++;
	}
	
	public void selfIntroduce(){
		System.out.println("내 이름은 " + this.getName() + "이며, 나이는" + this.getAge() +"살 입니다.");
	}
	
	public static int getPopulation(){
		return getNumberOfPerson();
	}

}
