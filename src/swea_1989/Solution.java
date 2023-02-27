package swea_1989;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			char[] arr1 = new char[str.length()];
			char[] arr2 = new char[str.length()];
			
			boolean result = true;
			
			for(int i = 0; i < str.length(); i++) {				
				arr1[i] = (str.charAt(i));
			}
			String str1 = String.valueOf(arr1);
			
			for(int j = str.length()-1; j >= 0; j--) {
				arr2[j] = (str.charAt(str.length()-1-j));;
			}
			String str2 = String.valueOf(arr2);
			
			result = str1.equals(str2);
			if(result) {
				System.out.printf("#%d %d\n",tc,1);
			}else {
				System.out.printf("#%d %d\n",tc,0);
			}
			
		}

	}

}
