package oopsConcept;
class vehicle{
	int speed = 150;
	vehicle(String s){
		System.out.println("Name is:"+s);
	}
}
class Bike extends vehicle {
	Bike(){
		super("Honda");
	}
	int speed =80;
	void displayspeed() {
		System.out.println("Speed of Bike is :"+speed);
		System.out.println("Speed of Vehicle should be max:"+super.speed);
	}
}
public class SuperBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bike b=new Bike();
       b.displayspeed();
	}

}
