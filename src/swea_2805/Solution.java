package swea_2805;

import java.util.Scanner;

//���۹� ��Ȯ�ϱ�
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t=1; t<=T; t++) {
			int n = sc.nextInt();
			int[][] map = new int[n][n];
			int sum = 0;
			
			//����Ÿ���̴ϱ� ���ڷ� ����
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
	        	
	        }//��� �ﰢ��(�߰��α���)
	        int a = 1;
	        for(int i = n/2 +1 ; i < n; i++) {
	        	for(int j = a; j <= n-1-a; j++) {
	        		sum += map[i][j];
	        	}
	        	a++;
	        }//�ϴ� �ﰢ��
        System.out.println("#" + t +" "+ sum);
		}
	}
}
