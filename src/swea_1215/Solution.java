package swea_1215;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for(int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			int count = 0;
			boolean result = true;
			char[][] map = new char[8][8];
			//���ڿ� �Է�
			for(int i=0;i<8;i++) {
				String str = sc.next();
				for(int j=0;j<8;j++) {
					map[i][j] = str.charAt(j);
				}
			}
			
			for(int i = 0; i < map.length; i++) {
				for(int j = 0; j < map.length - N + 1; j++) {//������ �� �ʿ���� �� ���� ��ŭ ���ڿ��� Ȯ���ϸ�Ǳ⶧��
					
					result = true;
					//����Ȯ�� - �߽��� �������� ��Ī�Ǵ� ���ڿ��� ���� ���ٸ� ȸ��
					for(int k = 0; k < N / 2; k++) 
						if(map[i][j+k] != map[i][j-k+N-1])
							result = false;					
					if(result) count++;
					
					result = true;
					//����Ȯ�� - �߽��� �������� ��Ī�Ǵ� ���ڿ��� ���� ���ٸ� ȸ��
					for(int k = 0; k < N / 2; k++) 
						if(map[j+k][i] != map[j-k+N-1][i])
							result = false;
					if(result) count++;
					
				}
			}
			System.out.println("#"+tc+" "+count);
		}

	}

}
