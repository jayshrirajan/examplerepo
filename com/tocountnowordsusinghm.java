package example.com;

import java.util.HashMap;
import java.util.Scanner;


public class tocountnowordsusinghm {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
	    String str;
	 
	    System.out.println("Enter a string: ");
	    str= in.nextLine();
	   
	    String[] splitFn = str.split(" ");
	 
	    HashMap<String,Integer> Hmap = new HashMap<String,Integer>();
	 
	    for (int i=0; i < splitFn.length-1; i++)
	    {
	      if (Hmap.containsKey(splitFn[i])) 
	      {
	 int count = Hmap.get(splitFn[i]);
	 Hmap.put(splitFn[i], count+1);
	      }
	      else 
	      {
	        Hmap.put(splitFn[i], 1);
	      }
	    }
	   System.out.println(Hmap);
	}

}
//count the no of digits in a number

//class Main {
//
//    public static int countDigits(int n) {
//		if(n == 0) return 1;
//
//		//if a negative number is entered
//		if(n < 0) n = -n;
//
//        int res = 0;
//		while(n != 0) {
//			n = n/10;
//			res++;
//		}
//		return res;
//	}
//
//	public static void main(String args[]) {
//		// Your code goes here
//		Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt(); //input the number
//		System.out.println("The number of digits in " + n + " are: " + countDigits(n));
//	}
//}

//to sorts hashmap by value

//public class SortHashMapByValue {
//
//	public static void main(String[] args) {
//		Map<String, Integer> scores = new HashMap<>();
//
//		scores.put("David", 95);
//		scores.put("Jane", 80);
//		scores.put("Mary", 97);
//		scores.put("Lisa", 78);
//		scores.put("Dino", 65);
//
//		System.out.println(scores);
//
//		scores = sortByValue(scores);
//
//		System.out.println(scores);
//	}
//
//	private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
//		Map<String, Integer> sortedByValue = new LinkedHashMap<>();
//
//		// get the entry set
//		Set<Entry<String, Integer>> entrySet = scores.entrySet();
//		System.out.println(entrySet);
//
//		// create a list since the set is unordered
//		List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
//		System.out.println(entryList);
//
//		// sort the list by value
//		entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
//		System.out.println(entryList);
//
//		// populate the new hash map
//		for (Entry<String, Integer> e : entryList)
//			sortedByValue.put(e.getKey(), e.getValue());
//
//		return sortedByValue;
//	}
//
//}

