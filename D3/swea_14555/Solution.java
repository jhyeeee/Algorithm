package swea_14555;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			String str1[] = sc.next().split("");
			int ans = 0;
			String temp = str1[0];
			for(int i = 1; i < str1.length; i++) {
				String str2 = temp + str1[i];
				if(str2.equals("(|") || str2.equals("|)")) {
					ans++;
				}else if(str2.equals("()")){
					ans++;
				}
				temp = str1[i];
			}
			System.out.println("#" + tc + " " + ans);
		}
	}
}
