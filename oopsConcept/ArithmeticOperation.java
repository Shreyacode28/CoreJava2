package oopsConcept;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


//Write a program to perform a specific arithmetic operation.
//Include a function named perform ArithmeticOperation that accepts 3 integer arguments and returns an integer that coresponds to the result. The first and second argument correspond to the  input numbers and the third argument coresponds to the choice  of arithemetic operation.

//If argument 3=1 calculate the sums of input 1 & inp 2
//If argument 3=2 calculate the difference of input1 and 2
//If argument 3=3 calculate the product of input1 and 2
//If argument 3=4 calculate the quotient of input 1 divided by input 2
//If the first two argumnent's values is negative greator than 32767, the function returns-1
//If the third argument value as not in the range 1 to 4, the function returns-1
//If the function returns-1, print Invalid Input.
//
//Input and Output Format:
//Input consists of 3 integers 
//output consist  of an int
//Refer sample o/p



class MathOperation{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	public int mod(int a,int b) {
	return  a%b;
	}
}
public class ArithmeticOperation {
	
	public static void main(String[]args) throws IOException {           //while taking buffered reader you should first throw IOException
		MathOperation m1=new MathOperation();
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));         //instead of scanner you can also use this to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		int a =sc.nextInt();
		int b= sc.nextInt();
//		System.out.println("Enter a value of a and b: ");
//		int a = Integer.parseInt(br.readLine());
//		int b=  Integer.parseInt(br.readLine());
		System.out.println("Addition:"+m1.add(a,b));
		System.out.println("Substraction:"+m1.sub(a,b));
	    System.out.println("Multiplication:"+m1.mul(a,b));
	    System.out.println("Division:"+m1.div(a,b));
	    System.out.println("Modulo:"+m1.mod(a,b));
	}
}

//Sample Input