package example.com;

import java.util.Scanner;

public class Swaptwonumberusingthirdvar {
	public static void main(String args[]) {
		int x,y,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the x and y values:");
		x=s.nextInt();
		y=s.nextInt();
		System.out.println("before Swapping:" +x  +y);
		temp =x;
		x=y;
		y=temp;
		System.out.println("After Swapping:" +x +y);
		
		
	}

}

