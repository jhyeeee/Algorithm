package swea_11315;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		char[][] map;
		int[] dx = { 0, 1, 1, 1 };
        int[] dy = { 1, 1, 0, -1};
		
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			map = new char[N][N];
			int check = 0;
			
			//�����Է�
			for (int i = 0; i < N; i++) { // �迭 �� ����
                String str = sc.next();
                for (int j = 0; j < N; j++) {
                    map[i][j] = str.charAt(j);
                }
            }
			
			//�� Ȯ���ϱ�
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(map[i][j] == 'o') {
						for(int dir = 0;dir < 4;dir++) {
							for(int count = 1;count < 5;count++) {
								int dr = i + dx[dir] * count;
								int dc = j + dy[dir] * count;
								
								if(dr < 0 || dc < 0 || dr >= N || dc >= N) 
									break;
								else if(map[dr][dc] != 'o') 
									break;
								if(count == 4)	
									check = 1;
	
							}
						}
					}
				}
			}
			if(check == 1) {
			System.out.println("#" + tc + " "+ "YES");
			}else {
			System.out.println("#" + tc + " "+ "NO");
			}

		}
	}
}
