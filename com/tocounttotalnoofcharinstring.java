package example.com;

public class tocounttotalnoofcharinstring {
	public static void main(String args[])
	{
		String s="the earth is best";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ')
				count++;
		}
		System.out.println(count);
	}
}

//to count the punctuate in string

//String s ="He said, 'The mailman loves you.' I heard it with my own ears.";
//int count=0;
//for(int i=0;i<s.length();i++) {
//	if(s.charAt(i)=='!'|| s.charAt(i)==','||s.charAt(i)=='.'||s.charAt(i)=='/'||s.charAt(i)=='/'||
//			s.charAt(i)==';'||s.charAt(i)=='?'||s.charAt(i)==':') {
//		count ++;
//	}}
//System.out.println("The total of punctation exists in the string is:" +count);
//	}
//}

// to find subset of a string

// String str = "FUN";  
//int len = str.length();  
//int temp = 0;  

//String arr[] = new String[len*(len+1)/2];  
//
 
//for(int i = 0; i < len; i++) {  
      
//    for(int j = i; j < len; j++) {  
//        arr[temp] = str.substring(i, j+1);  
//        temp++;  
//    }  
//}  
//

//System.out.println("All subsets for given string are: ");  
//for(int i = 0; i < arr.length; i++) {  
//    System.out.println(arr[i]);  
//}  

//to calculate divide n parts of string

//public class DivideString {  
//    public static void main(String[] args) {  
//          String str = "aaaabbbbcccc";  
//  
//        //Stores the length of the string  
//        int len = str.length();  
//        //n determines the variable that divide the string in 'n' equal parts  
//        int n = 3;  
//        int temp = 0, chars = len/n;  
//        //Stores the array of string  
//        String[] equalStr = new String [n];  
//        //Check whether a string can be divided into n equal parts  
//        if(len % n != 0) {  
//            System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
//        }  
//        else {  
//            for(int i = 0; i < len; i = i+chars) {  
//                //Dividing string in n equal part using substring()  
//                String part = str.substring(i, i+chars);  
//                equalStr[temp] = part;  
//                temp++;  
//            }  
//    System.out.println(n + " equal parts of given string are ");  
//            for(int i = 0; i < equalStr.length; i++) {  
//                System.out.println(equalStr[i]);  
//                }  
//            }  
//        }  
//}  
// to find all the permutations of a String

//public class PermuteString {    
//   
//    public static String swapString(String a, int i, int j) {    
//        char[] b =a.toCharArray();    
//        char ch;    
//        ch = b[i];    
//        b[i] = b[j];    
//        b[j] = ch;    
//        return String.valueOf(b);    
//    }    
//        
//    public static void main(String[] args)    
//    {    
//        String str = "ABC";    
//        int len = str.length();    
//        System.out.println("All the permutations of the string are: ");    
//        generatePermutation(str, 0, len);    
//    }    
//        
//        
//    public static void generatePermutation(String str, int start, int end)    
//    {    
//        
//        if (start == end-1)    
//            System.out.println(str);    
//        else    
//        {    
//            for (int i = start; i < end; i++)    
//            {    
//                  
//                str = swapString(str,start,i);    
//                
//                generatePermutation(str,start+1,end);    
//                
//                str = swapString(str,start,i);    
//            }    
//        }    
//    }    
//}    
//Output: "abc,cba,bca"