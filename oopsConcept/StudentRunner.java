package oopsConcept;

import java.util.Scanner;

class kids {
	
	int rollNo;
	String name;
	String city;
	
	public kids() {
		rollNo = 15;
	    name="Shreya Jadhav";
		city="panvel";
		
	}
	public kids(String name,int rollNo, String city) {
		this.name=name;
		this.rollNo=rollNo;
		this.city=city;
	}
	public void printDetails() {
		System.out.println("Name,RollNo and City of Student is:");
		System.out.println(name  +"\n"+rollNo+"\n"+ city);
	}
}

public class StudentRunner {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		kids s= new kids();
		s.printDetails();
		System.out.println("Enter the RollNo , Name and City:");
		int rollno = sc.nextInt();
		String name =sc.next();
		String city=sc.next();
//	      kids s1 = new kids();
		kids s1 = new kids(name,rollno,city ); 
         s1.printDetails();
		
		
		
	}

}
