package game.yongmin.want.java.study;

public class DTO {

	private String name;
	private int exp;
	private int age;

	
	public DTO(String name, int exp, int age) {
		super();
		this.name = name;
		this.exp = exp;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getExp() {
		return exp;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public DTO() {}
	public String getInformation() {
		return "DTO [ name= " + name +
				", exp =" + exp +
				", age =" + age +
				"]";
		
	}



}
