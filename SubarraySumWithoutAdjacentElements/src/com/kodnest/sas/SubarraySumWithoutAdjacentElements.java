package com.kodnest.sas;

import java.util.Scanner;

public class SubarraySumWithoutAdjacentElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int maxSubarraySum = findMaxSubarraySum(arr);
		System.out.println("Maximum Subarray Sum: " + maxSubarraySum);
	}

	public static int findMaxSubarraySum(int[] arr) {
		int maxSum = 0;
		for (int i = 1; i <= arr.length-1; i++) {
			int ele = arr[i-1];
			if (arr[i] > 0) {
				if (ele < 0) {
					maxSum = maxSum + arr[i];
				}
				else {
					if(arr[i+1] > 0) {
						maxSum = maxSum + arr[i+1];
					}
				}
			}
		}
		return maxSum;
	}
}