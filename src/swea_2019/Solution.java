package swea_2019;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 1;
		System.out.print("1 ");
		for(int i = 0; i < N; i++) {
			System.out.print(2 * sum + " ");
			sum = 2 * sum;		
		}
	}
}
