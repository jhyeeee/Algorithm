package swea_1984;

import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int max = 0;
			int min = 10000;
			int sum = 0;
			for(int i=0;i<10;i++) {
				int n = sc.nextInt();
				min = Math.min(min, n);
				max = Math.max(max, n);
				sum += n;
			}
			System.out.println("#"+tc+" "+Math.round(((sum-min-max)*1.0)/8));
		}

	}

}
