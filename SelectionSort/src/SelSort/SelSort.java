package SelSort;
import java.util.Scanner;
public class SelSort {

	public static void main(String[] args) 
	{	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements: " );
		int n = s.nextInt();
		int arr[]= new int[n];
		
		System.out.println("enter elements");

	    for(int i=0;i<n;i++){				//for reading array
	        arr[i]=s.nextInt();
	    }

	    for(int i: arr){ 					//for printing array
	        System.out.println(i);
	    }
	    sort(arr); 
	    printArray(arr);
	}

	public static int[] sort(int[] A)
{
	for(int i = 0; i< A.length-1 ; i++){
		int min = i;
		
		for(int j = i+1; j< A.length ; j++){
		if(A[j] < A[min])	{
			min = j;
					}
		}
		int temp = A[min];
		A[min] = A[i];
		A[i] = temp;
	}
	return A;	}

private static void printArray(int[] A) {
	for (int i =0; i< A.length ; i++){
	System.out.println(A[i]);		
	}}}
