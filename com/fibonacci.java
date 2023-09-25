package example.com;

import java.util.Scanner;

public class fibonacci {
	public static void main(String args[]) {
		int num,a=0,b=0,c=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of times:");
		num=s.nextInt();
		System.out.println("fiboancci series of the no is :");
		for(int i=0;i<num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+"");
			
		}
		
	}

}
//uisng nth fibonacci
//public class Fibonacci {
	//public static void main(String[] args) {
	////initializing the constants
	//int n = 100, t1 = 0, t2 = 1;
	//System.out.print("Upto " + n + ": ");
	////while loop to calculate fibonacci series upto n numbers
	//while (t1<= n)
	//{
	//System.out.print(t1 + " + ");
	//int sum = t1 + t2;
	//t1 = t2;
	//t2 = sum;
	//}
	//}
	//}

//fibonacci series using recursive func
//public class FibonacciCalc{
//	public static int fibonacciRecursion(int n){
//	if(n == 0){
//		return 0;
//	}
//	if(n == 1 || n == 2){
//			return 1;
//		}
//	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
//	}
//  public static void main(String args[]) {
//	int maxNumber = 10;
//	System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
//	for(int i = 0; i < maxNumber; i++){
//			System.out.print(fibonacciRecursion(i) +" ");
//		}
//	}
//}

//n terms where n is input by user :
//0 1 1 2 3 5 8 13 24 ..... 
//public class FibonacciSeries
//{
//    public static void main(String[] args)
//    {
//        Scanner console = new Scanner(System.in);
//        
//        int number;  // To hold number of terms
//
//        int firstTerm = 0,
//            secondTerm = 1,
//            thirdTerm;
// 
//        System.out.print("Enter number of terms of series : ");
//        number = console.nextInt();
// 
//        System.out.print(firstTerm + " " + secondTerm + " ");
// 
//        for(int i = 3; i <= number; i++)
//	{
//            thirdTerm = firstTerm + secondTerm;
//            System.out.print(thirdTerm + " ");
//            firstTerm = secondTerm;
//            secondTerm = thirdTerm;
//	}
//    }  
//}
//fibonacci series using iteration
//import java.util.*;  
//class Main{
//    public static void main(String ...a){
//    int first = 0, second = 1, result, i;
//    Scanner sc= new Scanner(System.in);
//    System.out.print("Enter number- ");  
//    int n= sc.nextInt();  
//    System.out.println("fibonacci series is: ");
//    for (i = 0; i < n; i++)
//    {
//        if (i <= 1)
//            result = i;
//        else
//        {
//            result = first + second;
//            first = second;
//            second = result;
//        }
//    System.out.println(result);
//    } 
//  }
//} 
