package swea_1945;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int num[] = {2, 3, 5, 7, 11};
			int ans[] =  new int[5];
			int N = sc.nextInt();
			while(true) {
				for(int i = 0; i < num.length; i++) {
					if(N % num[i] == 0) {
						ans[i] ++;
						N = N/num[i];
					}
				}
				if(N == 0 || N == 1) break;
			}
			System.out.print("#" + tc + " ");
			for(int i = 0; i < 5; i++) {
				System.out.print(ans[i] + " ");
			}
			System.out.println();
		}
	}
}
