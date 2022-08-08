package oopsConcept;

import java.util.Scanner;

//write a program to convert a given binary num to decimal.
public class DecimalConversion {

	public static void main(String[] args) {
		System.out.println("*********Conversion of Binary number to decimal number********");
		DecimalConversion d=new DecimalConversion();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Binary number:");
		int input=sc.nextInt();
		int result =d.convertToDecimal(input);
		if (result<=0) {
			System.out.println("Invalid input");
		}else {
			System.out.println("Result of desired operation is:" + result);
		}
	}

	private int convertToDecimal(int input) {
		int decimalnumber=0;
		int n=0;
		if(input%10>1||input<0||input>11111) {
			return -1;
		
		}else {
			while(input>0) {
				int remainder =input % 10;
				input /=10;
				decimalnumber += remainder*Math.pow(2,n);
				++n;
			}
		}
		
		return decimalnumber;
	}

}
