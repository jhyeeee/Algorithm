package swea_1228;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc <= 10; tc++) {
			LinkedList<Integer> PW = new LinkedList<>();
			
			int N = sc.nextInt(); //���� ��ȣ���� ���� �Է�
			
			for(int i = 0; i < N; i++) {
				PW.add(sc.nextInt()); //���� ��ȣ�� �Է�
			}
			
			int K = sc.nextInt(); //��ɾ��� ����
			
			for(int i = 0; i < K; i++) {
				String s = sc.next(); // | �Է¹ޱ�
				int x = sc.nextInt(); // �����ϴ� ��ġ �Է�
				int y = sc.nextInt(); // ��� ���� �����Ұ��� �Է�
				for(int j = 0; j < y; j++) {
					PW.add(x,sc.nextInt()); //x���� y�� �Է¹��� �� ����
					x++; // x�� �������������� x�ڸ������� ���� ���ԵǱ� ������ �������ش�
				}
			}
			System.out.print("#" + tc + " ");
			for(int i = 0; i < 10; i++) { //������ ����� ó������ 10�� ���ڸ� ���
				System.out.print(PW.get(i) + " ");
			}
			System.out.println();
		}
	}
}
