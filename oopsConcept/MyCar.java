package oopsConcept;

class Car {
	String s;
	 Car(){
		s="Ford";
		System.out.println(s);
	}
	void getbrand() {
		System.out.println("Brands="+s);
	}
}
public class MyCar{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car c= new Car();
     c.getbrand();
	}

//	private void getbrand() {
//		// TODO Auto-generated method stub
//		
//	}
	
}


