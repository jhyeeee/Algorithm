package swea_14692;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			String ans = "";
			if((N-1) % 2 ==0) {
				ans = "Bob";
			}else {
				ans = "Alice";
			}
			System.out.println("#" + tc + " " + ans);
		}
	}
}
