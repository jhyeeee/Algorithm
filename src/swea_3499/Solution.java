package swea_3499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			String arr[] = br.readLine().split(" ");
			Queue<String> que1 = new LinkedList<String>();
			Queue<String> que2 = new LinkedList<String>();
			Queue<String> result = new LinkedList<String>();
			if(N%2 == 0) {
				//礎熱檣 唳辦
				for(int i = 0; i < N/2; i++) {
					que1.offer(arr[i]);
				}
				for(int i = N/2; i < N; i++) {
					que2.offer(arr[i]);
				}
			}else {
				//�汝鶺� 唳辦
				for(int i = 0; i <= N/2; i++) {
					que1.offer(arr[i]);
				}
				for(int i = N/2+1; i < N; i++) {
					que2.offer(arr[i]);
				}
			}
			
			while(result.size() < N) {
				result.offer(que1.poll());
				result.offer(que2.poll());
			}
			System.out.print("#" + tc + " ");
			for(int i = 0; i < N; i++) {
				System.out.print(result.poll() + " ");
			}
			System.out.println();
		}
		

	}

}
