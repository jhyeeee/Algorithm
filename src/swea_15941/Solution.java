package swea_15941;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int answer = 0;
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			answer = N*N;
			System.out.println("#" + tc + " " + answer);
		}
	}
}
