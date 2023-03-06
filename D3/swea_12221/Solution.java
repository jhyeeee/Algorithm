package swea_12221;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int ans = 0;
		for(int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a < 10 && b < 10) {
				ans = a * b;
			}else {
				ans = -1;
			}
			System.out.println("#" + tc + " " + ans);
		}
	}
}
