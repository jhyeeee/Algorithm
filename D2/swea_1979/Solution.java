package swea_1979;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int answer = 0;
			int map[][] = new int[N][N];
			// �� �Է�
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			//���� Ȯ��
			for(int i = 0; i < N; i++) {
				int check = 0;
				for(int j = 0; j < N; j++) {
					if(map[i][j] == 0) {
						if(check == K) {
							answer += 1;
						}
						check = 0;
					}else {
						check += 1;
					}
				}
				if(check == K) answer += 1;
				
			}
			
			//���� Ȯ��
			for(int i = 0; i < N; i++) {
				int check = 0;
				for(int j = 0; j < N; j++) {
					if(map[j][i] == 0) {
						if(check == K) {
							answer += 1;
						}
						check = 0;
					}else {
						check += 1;
					}
				}
				if(check == K) answer += 1;
				
			}
			System.out.println("#" + tc + " " + answer);
		}
	}
}
