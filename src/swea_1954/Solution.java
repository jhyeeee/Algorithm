package swea_1954;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int dx[] = {0,1,0,-1};
		int dy[] = {1,0,-1,0};
		
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int arr[][] = new int[N][N];
			int x = 0;
			int y = 0; 			
			int dir = 0; 
			//��:0,��:1,��:2,��:3
			
			//N��1�ϰ��
			if(N == 1) {
				System.out.println("#"+tc);
				System.out.println(1);
				continue;
			}
			
			//���־��ֱ�
			for(int i=0;i<N*N;i++) { 
				arr[x][y] = i+1;
				x += dx[dir];
				y += dy[dir];
			
			
			//������ ����� ������ȯ�� �ؾ��ϴ� ��� 
			//(dir+1)%4�� �����»��� �ݺ��ؾ��ϱ⶧��
			//�̹� ��ġ�� ��� �� ������ȯ�� �ؾߵǴ°� �˱⶧���� �ٽ� ����ġ�� ���� ó���� -�� ���ش�
				if(x>=N || x<0 || y>=N || y<0) {
					x -= dx[dir];
					y -= dy[dir];
					dir = (dir+1)%4;
					x += dx[dir];
					y += dy[dir];
				}
			//�̵��� ���� �̹� ���� �ִ°�� ��, �������� ������ �ö󰥶� 
			//(0,0)�� �̹� ���� �ֱ� ������ ���� ���� �ȵ� �׷��⶧���� ������ȯ �ʿ�
				if(arr[x][y] != 0) {
					x -= dx[dir];
					y -= dy[dir];
					dir = (dir+1)%4;
					x += dx[dir];
					y += dy[dir];
				}
			}
			
			System.out.println("#"+tc);
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}

	}

}
