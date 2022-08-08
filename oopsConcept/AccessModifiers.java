package oopsConcept;
class Info {
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
	class creature {
	    // protected method
	    protected void display() {
	        System.out.println("I am an animal");
	    }
	
	}

public class AccessModifiers {

	class Dog extends creature{
	public static void main(String[] args) {
			// TODO Auto-generated method stub
    Info d =new Info();
    d.setName("Its private");
     System.out.println(d.getName());
	}   
//     Dog.new Dog ();
//     dog.display();
//	
	}
}
	
	
	
	

	

