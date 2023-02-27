package swea_1230;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc <= 10; tc++) {
			LinkedList<Integer> PW = new LinkedList <>();
			int N = sc.nextInt(); //���� ��ȣ���� ���� �Է�
			
			for(int i = 0; i < N; i++) {
				PW.add(sc.nextInt()); //���� ��ȣ�� �Է�
			}
			
			int K = sc.nextInt();
			for(int i = 0; i < K; i++) { //��ɾ��� ����
				String str = sc.next(); // I,D,A �� �ϳ� �Է�
				
				if(str.equals("I")) { //I�� ���
					int x = sc.nextInt();
					int y = sc.nextInt();
					for(int j = 0; j < y; j++) {
						PW.add(x, sc.nextInt()); // x��ġ���� �Է¹��� �� ����
						x++;
					}
				}else if(str.equals("D")){ //D�� ���
					int x = sc.nextInt();
					int y = sc.nextInt();
					for(int j = 0; j < y; j++) { //x���� ����
						PW.remove(x);
					}
				}else { //A�� ���
					int y = sc.nextInt();
					for(int j = 0; j < y; j++) {
						PW.add(sc.nextInt()); //���� �Է¹��� �� ����
					}
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
