package oopsConcept;
class  PolyGonImpl implements PolyGon{
	
	public void getName() {
		System.out.println("Polygon is rectangle");
	}

	@Override
	public void getArea() {
		
		System.out.println("Area of rectangle is:" +length * breadth);
		}
	public void getname() {
		System.out.println("Polygon is square");
	}
	
	
}

public class Rect {
   public static void main(String[]args) {
	   PolyGonImpl p=new PolyGonImpl();
	   p.getName();
	   p.getArea();
   }
}
