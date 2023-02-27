package swea_2007;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int ans = 0;
			String str = sc.next();
			for(int i = 1; i < str.length(); i++) {
				String a = str.substring(0, i);
				String b = str.substring(i, i+i);
				if(a.equals(b)) {
					ans = a.length();
					System.out.println("#" + tc + " " + ans);
					break;
				}
			}
		}
	}
}
