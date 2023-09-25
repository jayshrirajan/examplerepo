package example.com;

public class secondhighestno {
	public static void main(String args[]) {
		int arr[]= {76,45,90,88,56,100,764};
		int largest=0;
		int secondLargest=0;
		System.out.println("the given array is:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] );
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > largest) {
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("the largest no is:" +largest);
		System.out.println("the smallest no is:" +secondLargest);
	}

}
