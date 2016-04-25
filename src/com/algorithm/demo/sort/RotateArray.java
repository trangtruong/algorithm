package com.algorithm.demo.sort;

public class RotateArray {
	public static void main(String[] args) {
		int[] a = {9,2,4,1,3};
		int n = 5, k =3;
		rotate(a, n, k);
	}

	private static void rotate(int[] a, int n, int k) {
		if (k > a.length) {
			k = k%a.length;
		}
		if (a.length <=1) return;
		if (k == 0) return;
		
		int[] result = new int[a.length];
		for (int i = 0; i < k; i++) {
			result[i] = a[a.length-k+i]; // 7-4+1
		}
		
		int j = 0;
		for (int i = k; i < a.length; i++) {
			result[i] = a[j];
			j++;
		}
		
		System.arraycopy(result, 0, a, 0, n);
	}
}
