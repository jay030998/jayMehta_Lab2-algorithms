package com.greatlearning.lab2algorithms.question2;

public class NotesCount {
	public void notesCountImplementation(int arr[], int amount) {
		int notescounter[]= new int[arr.length];
		
		for(int i=0; i<arr.length;i++) {
			if(amount >= arr[i]) {
				notescounter[i]=amount/arr[i];
				amount= amount - notescounter[i] * arr[i];
			}
		}
		if(amount>0) {
			System.out.println("exact amount cannot be given with the highest denomination");
		}else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i=0; i<arr.length; i++) {
				if(notescounter[i]!=0) {
					System.out.println(arr[i] + ":" + notescounter[i]);
				}
			}
		}
	}
}
