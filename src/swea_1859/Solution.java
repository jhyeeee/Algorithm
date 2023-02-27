package swea_1859;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int a[] = new int[N];
			
			for(int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
			}
			long sum = 0;
			int max = a[N-1];
			for(int i = N-2; i >= 0; i--) {
				if(a[i] > max) {
					a[i] = max;
				}else {
					sum += max - a[i];
				}
			}
			System.out.println("#" + tc + " " + sum);
		}
	}
}
