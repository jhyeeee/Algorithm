package swea_15758;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			String str1 = sc.next();
			int dist1 = str1.length();
			String str2 = sc.next();
			int dist2 = str2.length();
			
			String newstr1 = "";
	        String newstr2 = "";
	        
			for(int i = 0; i < dist2; i++) {
				newstr1 += str1;
			}
			for(int i = 0; i < dist1; i++) {
				newstr2 += str2;
			}
			
			String ans = "";
			if(newstr1.equals(newstr2)) {
				ans = "yes";
            } else {
            	ans = "no";
            }
			System.out.println("#" + tc + " " + ans);
		}
	}
}
