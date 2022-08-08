package oopsConcept;

import java.util.Scanner;

class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {        //created the method
        this.name= name;
    }
}
public class PrivateClassModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub     //created objects
        Scanner sc= new Scanner(System.in) ;
        	String n=sc.nextLine();
        
        
		Data d=new Data();
        // access the private variable using the getter and setter
        d.setName(n);              //calling the method
        System.out.println(d.getName());
    }
	
}

