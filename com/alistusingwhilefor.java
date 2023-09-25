package example.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class alistusingwhilefor {
	public static void main(String args[]) {
		ArrayList list = new ArrayList();
		list.add("23");
		list.add("56");
		list.add("66");
		System.out.println(list.size());
		System.out.println("while loop:");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("advanced for loop:");
		for(Object o:list) {
			System.out.println(list);
		}
		System.out.println("for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
			
		
		
		
		
	}

}
