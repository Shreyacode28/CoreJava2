package oopsConcept;

abstract class Bank{    
	
abstract int getRateOfInterest();    
}    


   class SBI extends Bank{    
	
   int getRateOfInterest()
   {return 7;}    
   }    
   
   class PNB extends Bank{  
	   
   int getRateOfInterest()
   {return 8;}    
   }    
    


public class Abstractexamlple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;  
		b=new SBI();  
		System.out.println("Rate of Interest of SBI is: "+b.getRateOfInterest()+" %");    
		b=new PNB();  
		System.out.println("Rate of Interest of PNB is: "+b.getRateOfInterest()+" %");    
		}    
	}


