package example.com;
// to find no of elements in a array num and string
//public class numelements {
//    
//    public static void main(String[] args) {
//        
//        int [] numbers= new int[] {10,9,7,30};
//        System.out.println("given number array"+numbers.length);
//        
//        
//        String [] names = new String[] {"steve","luna","hina"};        
//    System.out.println("given name array"+names.length);
//    }
//}


    

//
//to find smallestno in an array
//public class JavaExample {
//	  public static void main(String[] args) {
//
//	    int [] arr = new int [] {3, 8, 1, 12, 7, 99};
//	    
//	    int smallestElement = arr[0];
//	    
//	    for (int i = 0; i < arr.length; i++) {
//	      
//	      if(arr[i] < smallestElement)
//	        smallestElement = arr[i];
//	    }
//	    System.out.println("Smallest element of given array: " + smallestElement);
//	  }
//	}
// 
//to find largestelement or no in array
//public class JavaExample {
//	  public static void main(String[] args) {
//
//	    
//	    int [] arr = new int [] {11, 22, 33, 99, 88, 77};
//	    
//	    int largestElement = arr[0];
//	   
//	    for (int i = 0; i < arr.length; i++) {
//	      
//	      if(arr[i] > largestElement)
//	        largestElement = arr[i];
//	    }
//	    System.out.println("Largest element of given array: " + largestElement);
//	  }
//	}

//diamond pattern using *

//public class JavaExample {
//public static void main(String[] args)
//{
//  int numberOfRows = 6;
//
//  int i, j;
//
//  for (i = 1; i <= numberOfRows; i++) {
//    for (j = 1; j <= numberOfRows - i; j++) {
//      System.out.print(" ");
//    }
//    for (j = 1; j <= i * 2 - 1; j++) {
//      System.out.print("*");
//    }
//
//    System.out.println();
//  }

//  for (i = numberOfRows - 1; i > 0; i--) {
//
//    
//    for (j = 1; j <= numberOfRows - i; j++) {
//      System.out.print(" ");
//    }
//
//    
//    for (j = 1; j <= i * 2 - 1; j++) {
//      System.out.print("*");
//    }
//    System.out.println();
//  }
//}
//}
// diamond pattern using numbers

//class JavaExample {
//	  public static void main(String[] args) {
//	    int max = 5;
//	    int startNumber = 1;
//
//	   
//	    for (int i = 1; i <= max; i++) {
//	      
//	      for (int j = max; j > i; j--) {
//	        System.out.print(" ");
//	      }
//	      
//	      for (int k = 0; k < i * 2 - 1; k++) {
//	        System.out.print(startNumber++);
//	      }
//	     
//	      startNumber = 1;
//	      
//	      System.out.println();
//	    }
//
//	    
//	    for (int i = 1; i <= max - 1; i++) {
//	      
//	      for (int j = 0; j < i; j++) {
//	        System.out.print(" ");
//	      }
//	      
//	      for (int k = (max - i) * 2 - 1; k > 0; k--) {
//	        System.out.print(startNumber++);
//	      }
//	      
//	      startNumber = 1;
//	      
//	      System.out.println();
//	    }
//	  }
//	}
//diamond pattern in alphabet
//after the class
//void display(int n)
//   {
//   for (int i = 0; i<=n; i++) {
//   // Inner for loop for logic execution
//   for (int j = 0; j<= n / 2; j++) {
//   // prints two column lines
//   if ((j == 0 || j == n / 2) && i != 0 ||
//   // print first line of alphabet
//   i == 0  && j != n / 2 ||
//   // prints middle line
//   i == n / 2)
//   System.out.print("*");
//   else
//   System.out.print(" ");
//   }
//   System.out.println();
//   }
//   }
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       alphabetdiamondpattern a = new alphabetdiamondpattern();
//       a.display(7);



 