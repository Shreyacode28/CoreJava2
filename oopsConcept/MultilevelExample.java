package oopsConcept;
class LuxuriesCar{
	int speed =50;
	void model1() {
		System.out.println("Luxuries types of  Cars:");
	}

	public void model() {
		// TODO Auto-generated method stub
		
	}

	
}
class Audi extends LuxuriesCar{
	void model1() {
		System.out.println("Audi");
	}
}
class BMW extends LuxuriesCar{
	void model1() {
		System.out.println("BMW");
	}
}
class Tesla extends LuxuriesCar{
	void model1() {
		System.out.println(" Tesla");
	}
	
}

public class MultilevelExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LuxuriesCar c=new LuxuriesCar();
		
       Audi a= new  Audi();
       BMW b= new   BMW();
       Tesla t= new Tesla();
       c.model1();
       a.model1();
       b.model1();
       t.model1();
       a.speed();
	}

}
