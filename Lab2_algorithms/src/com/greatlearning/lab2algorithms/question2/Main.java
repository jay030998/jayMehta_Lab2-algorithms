package com.greatlearning.lab2algorithms.question2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortImplementation ms = new MergeSortImplementation();
		NotesCount nc = new NotesCount();
		
		int size,amount;
		int arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		amount = sc.nextInt();
		
		ms.sortArray(arr, 0, arr.length-1);
		nc.notesCountImplementation(arr, amount);
	}

}
