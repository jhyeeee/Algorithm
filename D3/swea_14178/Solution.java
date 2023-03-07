package swea_14178;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int res = 0;
		int ans = 0;
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int D = sc.nextInt();
			res = N % (D * 2 + 1);
			if(res == 0) {
				ans = N / (D * 2 + 1);
			}else {
				ans = N / (D * 2 + 1) + 1;
			}
			System.out.println("#" + tc + " " + ans);
		}
	}
}
