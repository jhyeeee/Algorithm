package swea_1230;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc <= 10; tc++) {
			LinkedList<Integer> PW = new LinkedList <>();
			int N = sc.nextInt(); //원본 암호문의 길이 입력
			
			for(int i = 0; i < N; i++) {
				PW.add(sc.nextInt()); //원본 암호문 입력
			}
			
			int K = sc.nextInt();
			for(int i = 0; i < K; i++) { //명령어의 개수
				String str = sc.next(); // I,D,A 중 하나 입력
				
				if(str.equals("I")) { //I일 경우
					int x = sc.nextInt();
					int y = sc.nextInt();
					for(int j = 0; j < y; j++) {
						PW.add(x, sc.nextInt()); // x위치부터 입력받은 수 삽입
						x++;
					}
				}else if(str.equals("D")){ //D일 경우
					int x = sc.nextInt();
					int y = sc.nextInt();
					for(int j = 0; j < y; j++) { //x부터 삭제
						PW.remove(x);
					}
				}else { //A일 경우
					int y = sc.nextInt();
					for(int j = 0; j < y; j++) {
						PW.add(sc.nextInt()); //끝에 입력받은 수 삽입
					}
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
