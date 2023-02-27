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
			//문자열 입력
			for(int i=0;i<8;i++) {
				String str = sc.next();
				for(int j=0;j<8;j++) {
					map[i][j] = str.charAt(j);
				}
			}
			
			for(int i = 0; i < map.length; i++) {
				for(int j = 0; j < map.length - N + 1; j++) {//끝까지 볼 필요없고 그 길이 만큼 문자열을 확인하면되기때문
					
					result = true;
					//가로확인 - 중심을 기준으로 대칭되는 문자열의 값이 같다면 회문
					for(int k = 0; k < N / 2; k++) 
						if(map[i][j+k] != map[i][j-k+N-1])
							result = false;					
					if(result) count++;
					
					result = true;
					//세로확인 - 중심을 기준으로 대칭되는 문자열의 값이 같다면 회문
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
