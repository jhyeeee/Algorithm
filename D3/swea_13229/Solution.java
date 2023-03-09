package swea_13229;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int ans = 0;
		for(int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			if(str.equals("MON")) {
				ans = 6;
			}else if(str.equals("TUE")) {
				ans = 5;
			}else if(str.equals("WED")) {
				ans = 4;
			}else if(str.equals("THU")) {
				ans = 3;
			}else if(str.equals("FRI")) {
				ans = 2;
			}else if(str.equals("SAT")) {
				ans = 1;
			}else {
				ans = 7;
			}
			System.out.println("#" + tc + " " + ans);
		}
	}
}
