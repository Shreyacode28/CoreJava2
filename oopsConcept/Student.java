package oopsConcept;
//constructor overloading
class Store{
            String name;
            String age;
//parameterized constructor
		 Store(String n,int i)
		 {

			}
		     
            public void Printinfo() {
		    System.out.println(this.name);
		    System.out.println(this.age);
         		}
		}   
//     	    public class ConstOverloading {
		    	
  			public class Student
  			{
		      public Student(String string, int i, String string2) {
					// TODO Auto-generated constructor stub
				}

			public Student() {
				// TODO Auto-generated constructor stub
			}

			public static void main(String args[]){

	     	      Store s1 = new  Store(null, 0);
	     			s1.name= "Karan";

			        s1.age= "34 ";

			s1.Printinfo();

			

			}
  			}
	    	
		
		



