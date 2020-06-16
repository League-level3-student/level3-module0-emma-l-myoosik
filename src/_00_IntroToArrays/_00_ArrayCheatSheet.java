package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String arr[] = {"Spider-man", "Iron Man", "Black Widow", "Captain America", "Scarlet Witch"};
		//2. print the third element in the array
		System.out.println(arr[2]);
		//3. set the third element to a different value
		arr[2] = "Alexander Hamilton";
		//4. print the third element again
		System.out.println(arr[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "Potato farmer";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//7. make an array of 50 integers
		int[] arr2 = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = rand.nextInt(100);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallestNum = arr2[0];
		for (int i = 1; i < arr2.length; i++) {
			if (arr2[i] < smallestNum) smallestNum = arr2[i];
		}
		System.out.println(smallestNum);
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		//11. print the largest number in the array.
		int largestNum = arr2[0];
		for (int i = 1; i < arr2.length; i++) {
			if (arr2[i] > largestNum) largestNum = arr2[i];
		}
		System.out.println();
		//12. print only the last element in the array
		System.out.println(arr2[arr2.length - 1]);
		
	}
}
