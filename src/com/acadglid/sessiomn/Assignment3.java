/*
 * Write a program to search an element in a one-dimensional array using Binary Search Algorithm.
 * 
   Expected Output :
   Display a message stating whether element found in an array or not. Also, display the index position of the 
   element if found.
 */


package com.acadglid.sessiomn;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {


	//Create function for the Binary Search

	static  int binarySearch(int [] arrBinarySearch , int elementToSearch) {


		int start = 0;		//Declare start as array[0]
		int end= arrBinarySearch.length - 1;		//declare end of array and len -1
		int mid; 	

		//loop untill start is less then end 

		while(start<=end) {			
			mid = start + (end-start)/2;  // mid of array will be calculate alaways if element is not found.

			/*System.out.println("Value of start is loop-->" +start);
			System.out.println("Value of end is loop-->" +end);
			System.out.println("Value of mid is loop-->" +mid);*/

			if(arrBinarySearch[mid]==elementToSearch) {


				return mid ;		// return  mid index if element is found 
			}

			if(arrBinarySearch[mid] > elementToSearch) {

				end = mid-1;		// change the end to mid -1 


			}

			if(arrBinarySearch[mid] < elementToSearch) {

				start = mid+1;		//change the start mid +1 ;


			}





		}
		return -1;  // if ele not foudn return -1 


	}



	public static void main (String[] args) {


		//1. Create object of Scanner class 
		Scanner sc = new Scanner(System.in);


		//2. Enter the size of the array 

		System.out.println("Enter the size of the array");
		int arraySize = sc.nextInt();


		//3. Initialize the array 

		int arr[] = new int[arraySize]; // 

		//4. Enter the element of the array 

		System.out.println("Enter "+arraySize+"  elements for the array");

		for(int i =0 ; i<arraySize;i++) {   //loop till array-1 to add elements to array

			arr[i]=sc.nextInt();  

		}

		//5. Sort the array to acceding order

		Arrays.sort(arr);

		//5.5. Sorted arrayand formating of array 


		System.out.print(" {"); //use for formating array 

		for (int item : arr) {

			System.out.print(item);
			System.out.print("\t");

		}

		System.out.print(" }\n");
		//6. Enter the element to search in Array 

		System.out.println("Enter the element to search in Array ");

		int searchElement = sc.nextInt();


		//7. Call the Search function 
		int value =binarySearch(arr,searchElement);

		//8. check the return value if its -1 then element is not found

		if(value==-1) {

			System.out.println(" The element is not found in array ");
		}
		else {
			System.out.println(" The element is found and is located in location " +value+ " of the given array");
		}













	}

}
