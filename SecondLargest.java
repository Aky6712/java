package Demo;

import java.util.*;

public class SecondLargest {

	public static void main(String[] args) {
		int size, temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of an array : ");
		size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.print("Enter the elements of the array : ");
			arr[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\nAfter soting : ");
		for(int i = 0; i < size; i++) {
			System.out.println(arr[i] + "\t");
		}
		
		System.out.println("\nSecond largest element in the array is : "+arr[1]);
		
		sc.close();

	}}

