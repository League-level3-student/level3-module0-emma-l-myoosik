package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] arr = {"Zeus", "Poseidon", "Hera", "Demeter", "Athena", "Apollo", "Artemis", "Ares", "Hephaestus", "Aphrodite", "Hermes", "Hestia"};
		MoreArrayFun trial = new MoreArrayFun();
		
		trial.printStrings(arr);
		System.out.println();
		trial.printReverseStrings(arr);
		System.out.println();
		trial.printEveryOtherString(arr);
		System.out.println();
		trial.printRandomStrings(arr);
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public void printStrings(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public void printReverseStrings(String[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public void printEveryOtherString(String[] arr) {
		for (int i = 0; i < arr.length; i += 2) {
			System.out.print(arr[i] + " ");
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public void printRandomStrings(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			Random rand = new Random();
			int index = rand.nextInt(arr.length);
			System.out.print(arr[index] + " ");
		}
	}
	
}
