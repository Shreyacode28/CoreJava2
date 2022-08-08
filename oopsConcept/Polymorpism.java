package oopsConcept;
class shape{
	void getArea() {
		
	}
	
}

class Triangle extends shape {
    void getarea() {
    	int h=5,b=8;
    	double area1 = (0.5* h*b);
    System.out.println("Area of triangle:"+area1);
}  
}
     class Circle extends  shape{
      void getarea() {
    	  double r=5;
    	  double area2=(3.14 * r * r);
    System.out.println("Area of cirlce:"+area2);
  }  
}



    public class Polymorpism {
    	 public static void main(String[]args) {
    		 Triangle a1=new Triangle();
    		 a1.getarea();
    		 Circle a2=new Circle();
    		 a2.getarea();
    	 }

}
