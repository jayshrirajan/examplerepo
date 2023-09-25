package example.com;

import java.util.Scanner;

public class StringinBuilder {
	public static void main(String args[]) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ur String:");
		str=s.nextLine();
		String[] token=str.split("");
		for(int i=token.length-1;i>0;i--) {
			System.out.println(token[i] +"");
		}
		

		}

}
