package example.com;

import java.util.Scanner;

public class revarraywithoutusingextraspace {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("The reversed array is");
        int i = 0;
        int j = arr.length - 1;

        while(i < j) {
            //swapping ith and jth index elements
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        //displaying the array
        for(int it=0;it<arr.length;it++) {
            System.out.print(arr[it] + " ");
        }
	}

}
