package Lotto;

import java.util.Arrays;

public class lotto {

	public static void main(String[] args) {
		
		int lottonum[] = new int[6];
		
		System.out.print("당신의 로또 번호는 ");
		for(int i=0; i<lottonum.length; i++) {
			lottonum[i] = (int)(Math.random() * 45) + 1;			
			
			for(int j=0; j<i; j++) {
				if(lottonum[i] == lottonum[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lottonum);
		for(int i : lottonum) {
			System.out.print(i+" ");
		}
		
	}

}
