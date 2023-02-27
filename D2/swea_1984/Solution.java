package swea_1984;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int arr[] = new int[10];
			int sum = 0;
			int answer = 0;
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			for(int j = 1; j < arr.length - 1; j++) {
				sum += arr[j];
			}
			answer = (int)Math.round(sum/8.0);
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}
