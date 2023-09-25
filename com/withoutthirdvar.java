package example.com;

import java.util.Scanner;

public class withoutthirdvar {
	public static void main(String args[]) {
		int x,y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the x and y values:");
		x=s.nextInt();
		y=s.nextInt();
		System.out.println("before Swapping\nx:" +x+"\ny:"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping\nx:" +x+"\ny :" +y);
	}

}

//to swap two integrs using class without third variable
//import java.util.Scanner;
//
//public class Swap{
//	private int num1;
//	private int num2;
//	public void setNum1(int num){
//		this.num1=num;
//	}
//	public int getNum1(){
//		return this.num1;
//	}
//	public void setNum2(int num){
//		this.num2=num;
//	}
//	public int getNum2(){
//		return this.num2;
//	}
//	public void swapNumber(){
//		setNum1(getNum1()+getNum2());
//		setNum2(getNum1()-getNum2());
//		setNum1(getNum1()-getNum2());
//	}
//	public void inputNumber(){
//		//temp variable to store num
//		int num;
//        Scanner sc  =   new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        num =   sc.nextInt();
//        setNum1(num);
//        
//        System.out.print("Enter second number: ");
//        num =   sc.nextInt();
//        setNum2(num);        
//
//	}
//	public void printNumber(){
//		System.out.println("First Number is --> "+getNum1());
//		System.out.println("Second Number is --> "+getNum2());
//	}
//	public static void main(String[] ar){
//		Swap ob = new Swap();
//		ob.inputNumber();
//		ob.swapNumber();
//		ob.printNumber();
//		
//	}
//}

