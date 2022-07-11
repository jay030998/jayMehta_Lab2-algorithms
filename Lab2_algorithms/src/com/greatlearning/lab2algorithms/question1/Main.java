package com.greatlearning.lab2algorithms.question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		int array[];
		int nooftargets;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		size=sc.nextInt();
		array = new int[size];
		System.out.println("Enter the values of array");
		for(int i=0;i<size;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		nooftargets=sc.nextInt();
		
		while(nooftargets-- != 0) {
			int flag=0;
			int target;
			int sum=0;
		System.out.println("Enter the value of target");
		target=sc.nextInt();
		for(int i=0; i<size; i++) {
			sum = sum+array[i];
			
			if(sum >= target) {
				System.out.println("Target achieved after " + (i+1) + " transactions");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Given target is not achieved ");
		}
	}
}
