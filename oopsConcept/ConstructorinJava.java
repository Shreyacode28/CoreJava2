package oopsConcept;

 class Constructors {
    String name;
     private int id;
	

	public Constructors(String myname, int myid) {
		
		name = myname;
		id = myid;
	}
	public Constructors() {
		name="Your name";
		id=55;
	}
	public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
	public char[] name() {
		// TODO Auto-generated method stub
		return null;
	}
	public char[] getname() {
		// TODO Auto-generated method stub
		return null;
	}
	
 }
public class ConstructorinJava {
	public static  void main(String[]args) {
		Constructors Obj=new Constructors("Shreya",88) ;
		System.out.println(Obj.getName());
		System.out.println(Obj.getId());
	}
}
