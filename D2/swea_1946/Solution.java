package swea_1946;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			ArrayList<String> list = new ArrayList<String>();
			for(int i = 0; i < N; i++) {
				String s = sc.next();
				int k = sc.nextInt();
				for(int j = 0; j < k; j++) {
					list.add(s);
				}
			}
			System.out.println("#"+ tc);
			for(int i = 1; i <= list.size(); i++) {
				System.out.print(list.get(i - 1));
				if(i % 10 == 0) {
					System.out.println();
				}
			}
			System.out.println();
		}
	}
}
