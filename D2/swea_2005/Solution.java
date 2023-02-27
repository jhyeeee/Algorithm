package swea_2005;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int map[][] = new int[N][N];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <= i; j++) {
					if(j == 0) {
						map[i][j] = 1;
					}else if(i == j) {
						map[i][j] = 1;
					}else {
						map[i][j] = map[i - 1][j - 1] + map[i - 1][j];
					}
				}
			}
			System.out.println("#" + tc);
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <= i; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
