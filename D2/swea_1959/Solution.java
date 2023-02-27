package swea_1959;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int A[] = new int[N];
			int B[] = new int[M];
			for(int i = 0; i < N; i++) A[i] = sc.nextInt();
			for(int i = 0; i < M; i++) B[i] = sc.nextInt();
			int Max = 0;
			if(N < M) {//N개의 개수가 더 작을경우
				for(int i = 0; i < M - N + 1; i++) {//총 M개중 N개씩 갈수있는 반복수
					int result = 0;
					for(int j = 0; j < N; j++) {//N의 개수만큼만 반복
						result += A[j] * B[i + j];
					}
					Max = Math.max(Max, result);
				}
			}
			if(N > M) {//M개의 개수가 더 작을경우
				for(int i = 0; i < N - M + 1; i++) {//총 N개중 M개씩 갈수있는 반복수
					int result = 0;
					for(int j = 0; j < M; j++) {//N의 개수만큼만 반복
						result += A[i + j] * B[j];
					}
					Max = Math.max(Max, result);
				}
			}else {//N과 M의 개수가 같을 경우
				int result = 0;
				for(int k = 0; k < N; k++) {
					result += A[k] * B[k];
				}
				Max = Math.max(Max, result);
			}
			System.out.println("#" + tc + " " + Max);
		}
	}
}
