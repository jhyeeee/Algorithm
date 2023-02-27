package swea_1974;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int map[][] = new int[9][9];
			int answer = 1;
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			//가로 검증
			for(int i = 0; i < 9; i++) {
				int sum = 0;
				for(int j = 0; j < 9; j++) {
					sum += map[i][j];
				}
				if(sum != 45) {
					answer = 0;
				}
			}
			
			// 세로검증
			for(int i = 0; i < 9; i++) {
				int sum = 0;
				for(int j = 0; j < 9; j++) {
					sum += map[j][i];
				}
				if(sum != 45) {
					answer = 0;
				}
			}
			
			// 격자검증
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					int sum = 0;
					for(int a = 0; a < 3; a++) {
						for(int b = 0; b < 3; b++) {
							sum += map[3*i + a][3*j + b];
						}
					}
					if(sum != 45) {
						answer = 0;
					}
				}
			}
			System.out.println("#" + tc + " " + answer);
		}
	}
}
