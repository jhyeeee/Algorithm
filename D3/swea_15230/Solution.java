package swea_15230;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			String spell[] = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l",
											"m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
			String str[] = sc.next().split("");
			int count = 0;
			for(int i = 0; i < str.length; i++) {				
				if(str[i].equals(spell[i])) {
					count += 1;
				}else {
					break;
				}
			}
			System.out.println("#" + tc + " " + count);
		}
	}
}
