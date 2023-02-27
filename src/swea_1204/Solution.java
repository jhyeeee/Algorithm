package swea_1204;

import java.util.*;

public class Solution { //�ֺ� ���ϴ� ��� �����ʿ� - count

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int testNum = sc.nextInt();//���° test���� �Է�
			int max = 0;
			int result = 0;
			int[] count = new int[101]; // 0~100������ �Է� ����
			
			for(int i=0;i<1000;i++) {
				int score = sc.nextInt(); //�����Է�
				count[score]++;		
			}
			for(int i=0;i<101;i++) { //�ֺ󰪱��ϱ�
				if(max <= count[i]) {
					max = count[i];
					result = i;
				}
			}
			System.out.print("#"+testNum+" "+result);
			System.out.println();
		}

	}

}
