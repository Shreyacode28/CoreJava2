package oopsConcept;
class PersonsDetail{
	int age;
	String name,city;
	
	public PersonsDetail(int age,String name,String city) {
		this.age=age;
		this.name=name;
		this.city=city;
	}
	
}
class Learner extends PersonsDetail{
	String Course= "Java Full Stack Development";

	public Learner() {
		super(22, "Zoya", "Mumbai");
		
		// TODO Auto-generated constructor stub
	}
	public void getDetails() {
		System.out.println("Learner Details:");
		System.out.println("Learner's Name:"+ name + "\n   Learner's Age:"+age + "\nCity:" +city + "\n Learner's selected course:"+ Course);
	}
	
}


public class DetailOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learner Learner = new Learner();
		Learner.getDetails();

	}

}
