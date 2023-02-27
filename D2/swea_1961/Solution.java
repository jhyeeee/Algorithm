package swea_1961;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int map[][] = new int[N][N];
			// 배열 입력
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("#" + tc);
			
			for(int i = 0; i < N; i++) {
				//90도 일때
				for(int j = 0; j < N; j++) {
					System.out.print(map[N-j-1][i]);
				}
				// 180도 일때
				System.out.print(" ");
				for(int j = 0; j < N; j++) {
					System.out.print(map[N-i-1][N-j-1]);
				}
				// 270도 일때
				System.out.print(" ");
				for(int j = 0; j < N; j++) {
					System.out.print(map[j][N-i-1]);
				}
				System.out.println();
			}
		}
	}
}
