package example.com;

import java.util.Scanner;

public class Primeno {
	public static void main(String args[]) {
		int temp, num;
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.close();
        for (int i = 2; i<= num/2; i++) {
            temp = num%i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) 
            System.out.println(num + "number is prime");
            else
                System.out.println(num + "number is not a prime");
		}
		
	}
//to find n prime no and find sum and average

//public class primenumberupton{
//public static void main(String args[]{
//int num=0;i=0;
//System.out.println("prime no from 1 to 100 are:");
//for(int i=0;i<=100;i++) {
//	int counter=0;
//	for(num=i;num>=1;num--) {
//		if(num%==0) {
//			counter = counter + 1;
//			
//		}
//}
//if(counter==2) {
//	System.out.println(i+"");
//}
//}
//}
//}

// to find the sum of all prime numbers within a given range 
//int start=1;
//int end =100;
//int sum=0;
//for(int i=start;i<=end;i++) {
//	boolean isPrime=true;
//	for(int j=2;j<i;j++) {
//		if(i%j==0) {
//			isPrime=false;
//			break;
//		}
//	}
//	if(isPrime) {
//		sum+=i;
//	}
//}
//System.out.println("sum of prime numbers between" +start+"and"+end+":"+sum);

//Write a program that prompts the user to input a positive integer. It should then output a message indicating 
//whether the number is a prime number. 


//public class TestPrime
//{
//    public static void main(String[] args)
//    {
//        Scanner console = new Scanner(System.in);
//     
//        int number;
//        
//        System.out.print("Enter the positive integer ");
//        number = console.nextInt();
//        
//        boolean flag = true;
//        
//        for(int i = 2; i < number; i++)
//	{
//	    if(number % i == 0)
//            {
//                flag = false;
//                break;
//            }
//        }
//
//	if(flag && number > 1)
//        {
//            System.out.println("Number is prime");
//        }
//	else
//        {
//            System.out.println("Number is not prime");
//        }
//        
//    }  
//}
//First n Prime Number
//public class Main
//{
//public static void main(String[] args) {
//    int i=0,n,temp,temp1=1;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Java Program to print first n prime numbers ");
//    n= sc.nextInt();
//    System.out.println("Prime numbers are before "+n);
//    while(temp1<=n){
//        temp=0;
//        for(i=2;i<=(temp1/2);i++){
//            if(temp1%i==0)
//            {
//                temp=1;
//                break;
//            }
//        }
//        if(temp==0){
//            System.out.println(temp1);
//        }
//        temp1++;
//        }
//    }
//}
