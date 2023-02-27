package swea_1228;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc <= 10; tc++) {
			LinkedList<Integer> PW = new LinkedList<>();
			
			int N = sc.nextInt(); //원본 암호문의 길이 입력
			
			for(int i = 0; i < N; i++) {
				PW.add(sc.nextInt()); //원본 암호문 입력
			}
			
			int K = sc.nextInt(); //명령어의 개수
			
			for(int i = 0; i < K; i++) {
				String s = sc.next(); // | 입력받기
				int x = sc.nextInt(); // 시작하는 위치 입력
				int y = sc.nextInt(); // 몇개의 수를 삽입할건지 입력
				for(int j = 0; j < y; j++) {
					PW.add(x,sc.nextInt()); //x부터 y번 입력받은 수 삽입
					x++; // x가 증가하지않으면 x자리에서만 수가 삽입되기 때문에 증가해준다
				}
			}
			System.out.print("#" + tc + " ");
			for(int i = 0; i < 10; i++) { //수정된 결과의 처음부터 10개 숫자를 출력
				System.out.print(PW.get(i) + " ");
			}
			System.out.println();
		}
	}
}
