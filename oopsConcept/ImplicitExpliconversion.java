package oopsConcept;

public class ImplicitExpliconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//double d=23.45;
//int i= (int)d;
//System.out.println(i);
	//Widening  casting -smallerto larger type
	
	//IMPICIT TYPE	
//    byte i=40;      //byte is source and j is target
//	short j=i;
//	int k=j;
//	long l=k;
//	float m=l;
//	double n=m;
//	System.out.println("byte value"+ "\n" + j +"\n" + i+ "\n"+ k +"\n"+ l+"\n"+ m + "\n" + n);
	
	//EXPLICIT TYPE
	double d=40d;
	float j= (float)d;
	long l=(long)j;
	int i=(int)l;
	short s=(short)i;
	byte b=(byte)s;
	System.out.println("Byte b:"+ b+ "\n" +"Short value:"+ s +"\n" + i+ "\n"+ l +"\n"+ j+"\n"+ d );
	
	}
	
	
	
	

}
