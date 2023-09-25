package example.com;

import java.util.Scanner;

public class palindrome {
	public static void main(String args[]) {
		String Original,reverse="";
		int length;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String or number:");
		Original = s.nextLine();
		length= Original.length();    
		for(int i=length-1;i>=0;i--) {
			reverse = reverse + Original.charAt(i);
		}
		System.out.println("reverse is:" +reverse);
		if(Original.equals(reverse)) {
			System.out.println("its a palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
		
		
	}

}
// to check if a given no is palindrome or not
//int number=12321;
//int temp=number;
//int reverse=0;
//while(temp!=0) {
//	reverse = reverse * 10 + temp % 10;
//	temp /=10;
//}
//boolean isPalindrome = number==reverse;
//System.out.println("is the given no is palindrome or not:" +ispalindrome);
//}
//}
//to check given string is palindrome
//public class Main {  
//    public static void main(String[] args) {  
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Please give First String : ");  
//        String str= sc.nextLine();  
//        StringBuilder strRev = new StringBuilder();
//        strRev.append(str);
//        strRev = strRev.reverse(); 
//        if(str.equals(strRev.toString())){
//            System.out.print("String is palindrom"); 
//        }else{
//            System.out.print("String is not palindrom"); 
//        }
//    }  
//}  
//palindrome using iteration
//import java.util.*;  
//class Main{
//    public static void main(String ...args){
//        int tempvar,remainder,reverseNum=0;
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter number- ");  
//        int originalNum= sc.nextInt();  
//        tempvar = originalNum;
//        while (tempvar != 0) {
//            remainder = tempvar % 10;
//            reverseNum = reverseNum * 10 + remainder;
//            tempvar /= 10;
//        }
//        if (originalNum == reverseNum)
//            System.out.print("Number is palindrom");  
//        else
//            System.out.print("Number is not palindrom");
//    }
//}
//palindrome using recursion
//import java.util.*;  
//class Main{
//    static int sum=0,rem;
//    static int isPalindrome(int num)
//    {
//        if(num == Main.reverse(num))
//        {
//            return 1;
//        }
//    return 0;
//    }
//    static int reverse(int num){
//       if(num!=0){
//            rem=num%10;
//            sum=sum*10+rem;
//            reverse(num/10);
//        }
//        else
//            return sum;
//        return sum;
//    }
//    public static void main(String ...args){
//        int result;
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter number- ");  
//        int originalNum= sc.nextInt();  
//        result = Main.isPalindrome(originalNum);
//        if(result == 1){
//            System.out.println("number is a palindrome");
//        }else{
//            System.out.println("number is not a palindrome");
//        }
//    }
//} 
