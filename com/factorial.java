package example.com;

import java.util.Scanner;

public class factorial {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no:");
		
		int num=s.nextInt();
		int i=0,fact=1;
		while(i<=num) {
			fact=fact*i;
			i++;
			System.out.println("factorial is:" +fact);
			
			
		}
	
		
	}
	
	
	}
			
//calculate factorial
//public class Factorial {
	//public static void main(String args[]){
	
	//Scanner scanner = new Scanner(System.in);
	//System.out.println("Enter the number:");
	////Stored the entered value in variable
	//int num = scanner.nextInt();
	////Called the user defined function fact
	//int factorial = fact(num);
	//System.out.println("Factorial of entered number is: "+factorial);
	//}
	//static int fact(int n)
	//{
	//int output;
	//if(n==1){
	//return 1;
	//}
	////Recursion: Function calling itself!!
	//output = fact(n-1)* n;
	//return output;
	//}
	//}


//to find the factorial value of any number entered through the keyboard. 

//public class FactorialDemo1
//{
//    public static void main(String[] args)
//    {
//        Scanner console = new Scanner(System.in);
//        int num; // To hold number
//        int fact = 1; // To hold factorial
//        
//        System.out.print("Enter any positive integer: ");
//        num = console.nextInt();
//       
//        for(int i=1; i<=num; i++)
//        {
//            fact *= i;
//        }
//        
//        System.out.println("Factorial: "+ fact);
//    }
//} 
//
//factorial using recursion

//public class Main
//{
//    static long fact(long num){
//        if (num == 0){
//            return 1;
//        }
//        else{
//            return(num * fact(num-1));
//        }
//    }
//    public static void main(String[] args) {
//        long num;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a whole number to find Factorial ");
//        num= sc.nextInt();
//        System.out.println("Factorial = "+fact(num));
//    }
//}
//factorial using itertion
//import java.util.*;
//public class Main
//{
//    public static void main(String[] args) {
//    long i,num,factorial=1;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter a number to calculate factorial: ");
//    num = sc.nextInt();
//    if(num<0){
//        System.out.println("Factorial can't be calculated for negative number");
//    }
//    else if(num==0){
//       System.out.println("Factorial of 0 is 1");
//    }
//    else{
//        for(i=1;i<=num;i++)
//          factorial=factorial*i;
//        System.out.println("Factorial = "+factorial);
//    }
//    }
