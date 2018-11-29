package lambada;


public class Person {
 
	private String name;
	private float height;
	private int age;
	private int id;
	private int weight;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", age=" + age + ", id=" + id + ", weight=" + weight
				+ "]";
	}
	public Person(String name, float height, int age, int id,
			int weight) {
		super();
		this.name = name;
		this.height = height;
		this.age = age;
		this.id = id;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
}