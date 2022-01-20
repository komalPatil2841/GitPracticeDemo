package com.example.JunitTestProject;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxMin {
	Scanner sc = new Scanner(System.in);

			public int maxDiff() {
				int size;
				System.out.println("Enter the size of the array:");
		
				size = sc.nextInt();
				int arr[] = new int[size];
		
				System.out.println("Enter the Element of the array:");
				for (int i = 0; i < size; i++) {
					arr[i] = sc.nextInt();
				}
				int m2 = arr[1] - arr[0];
				for (int i = 0; i < size - 1; i++) {
					for (int j = i + 1; j < size; j++) {
						if (arr[j] > arr[i]) {
		
							m2 = Math.max(m2, arr[j] - arr[i]);
						}
					}
		
				}
				System.out.println("Maximum difference between two Element is " + m2);
				return m2;
		
			}

			public int minDiff() {
				int size;
				System.out.println("Enter the size of the array:");
		
				size = sc.nextInt();
				int arr[] = new int[size];
		
				System.out.println("Enter the Element of the array:");
				for (int i = 0; i < size; i++) {
					arr[i] = sc.nextInt();
				}
		
//				int m1 = Integer.MAX_VALUE;
//				for (int i = 0; i < size - 1; i++) {
//					for (int j = i + 1; j < size; j++) {
//						if (Math.abs(arr[j] - arr[i]) < m1) {
//							m1 = Math.abs(arr[j] - arr[i]);
//						}
//					}
//				}
//				System.out.println("Minimum difference between two Element is " + m1);
		
				Arrays.sort(arr);
				System.out.println(Arrays.toString(arr));
		
				int m1 = arr[1] - arr[0];
				for (int i = 2; i != size - 1; i++) {
					m1 = Math.min(m1, arr[i] - arr[i - 1]);
				}
				System.out.println("Minimum difference between two Element is " + m1);
				return m1;
			}

}
