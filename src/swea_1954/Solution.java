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
			//우:0,하:1,좌:2,상:3
			
			//N이1일경우
			if(N == 1) {
				System.out.println("#"+tc);
				System.out.println(1);
				continue;
			}
			
			//값넣어주기
			for(int i=0;i<N*N;i++) { 
				arr[x][y] = i+1;
				x += dx[dir];
				y += dy[dir];
			
			
			//범위를 벗어나서 방향전환을 해야하는 경우 
			//(dir+1)%4는 우하좌상을 반복해야하기때문
			//이미 위치가 벗어난 후 방향전환을 해야되는걸 알기때문에 다시 원위치를 위해 처음에 -를 해준다
				if(x>=N || x<0 || y>=N || y<0) {
					x -= dx[dir];
					y -= dy[dir];
					dir = (dir+1)%4;
					x += dx[dir];
					y += dy[dir];
				}
			//이동할 곳에 이미 값이 있는경우 즉, 우하자후 상으로 올라갈때 
			//(0,0)은 이미 값이 있기 때문에 값이 들어가면 안됨 그러기때문에 방향전환 필요
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
