package example.com;

public class armstrong {
	public static void main(String args[]) {
		int c=0,a,temp;  
		   int n=600;
		   temp=n;  
		   while(n>0)  
		   {  
		   a=n%10;  
		   n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else 
		        System.out.println("Not armstrong number");  
	}

}
//Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number
//is equal to the number itself, then the number is called an Armstrong number.
//For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )

//public static void main(String[] args)
//{
//    int digit1,  // To hold first digit (Ones) of number 
//        digit2,  // To hold second digit (Tens) of number
//        digit3;  // To hold third digit (Hundreds) of number
//
//for(int number = 1; number <= 500; number++)
//{
//        int temp = number;
//    digit1 = temp % 10;
//
//        temp = temp / 10;
//        digit2 = temp % 10;
//        
//        temp = temp / 10;
//        digit3 = temp % 10;
//
//    if(digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3 == number)
//        {
//        System.out.println(number);
//        }
//}
//}  
//armstrong in integer
//import java.util.*;  
//import java.lang.Math;
//class Main{
//    public static void main(String ...a){
//    int i=0,n,result=0,number1,temp;
//    Scanner sc= new Scanner(System.in);
//    System.out.print("Enter number- ");  
//    int number= sc.nextInt();  
//    number1=number;
//    temp=number;
//    while(number!=0){
//        number=number/10;
//        i++;
//        }
//    while(number1!=0){
//        n=number1%10;
//        result=result+(int)Math.pow(n,i);
//        number1=number1/10;
//        }
//    if(temp==result)
//        System.out.println("number is armstrong");
//    else
//        System.out.println("not a armstrong");
//    }
//} 
