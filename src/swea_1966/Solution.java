package swea_1966;
import java.util.*;






public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lotto[] = new int[6];	// �ζ� ��ȣ�� �Է¹��� �迭�� �������ش�.
		
		System.out.print("�ζ� ��ȣ : ");
		for(int i = 0; i < lotto.length; i++) {
			int num = (int)(Math.random() * 45) + 1;	// 1~46������ ������ ���� �޴´�.
			lotto[i] = num;
			for(int j = 0; j < i; j++) {	// �ߺ��� ��ȣ�� ������ ���� �������� ���ư� �ٽ� �����Ѵ�.
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			System.out.print(lotto[i] + " ");	// �ζǹ�ȣ�� ����Ѵ�.
		}

	}
}
