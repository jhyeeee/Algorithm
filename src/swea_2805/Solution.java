package swea_2805;

import java.util.Scanner;

//농작물 수확하기
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t=1; t<=T; t++) {
			int n = sc.nextInt();
			int[][] map = new int[n][n];
			int sum = 0;
			
			//문자타일이니까 숫자로 변경
			for(int i=0; i<n;i++) {
				String str =sc.next();
				for(int j=0;j<n;j++) {
					map[i][j] = str.charAt(j)-'0';
				}
			}
			
			for(int i = 0; i <= n/2; i++) {
	        	for(int j = n/2 - i; j <= n/2 + i; j++) {
	        		sum += map[i][j];
	        		
	        	}
	        	
	        }//상단 삼각형(중간부까지)
	        int a = 1;
	        for(int i = n/2 +1 ; i < n; i++) {
	        	for(int j = a; j <= n-1-a; j++) {
	        		sum += map[i][j];
	        	}
	        	a++;
	        }//하단 삼각형
        System.out.println("#" + t +" "+ sum);
		}
	}
}
