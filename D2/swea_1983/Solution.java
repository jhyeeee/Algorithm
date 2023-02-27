package swea_1983;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String grade[] = {"D0","C-","C0","C+","B-","B0","B+","A-","A0","A+"};
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt() - 1;
			int result[] = new int[N];
			
			for(int i = 0; i < N; i++) {
				int mid = sc.nextInt();
				int fin = sc.nextInt();
				int work = sc.nextInt();
				result[i] = mid*35 + fin*45 + work*20;
				 
			}
			int score = result[K];
			Arrays.sort(result);
			int index = -1;
			for(int i = 0; i < N; i++) {
				if(result[i] == score) {
					index = i;
					break;
				}
			}
			int ans = index/(N/10);
			System.out.println("#" + tc + " " + grade[ans]);
		}
				
	}
}
