package codeup;

import java.util.Scanner;

//1010
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		System.out.println(n);
//
//	}
//
//}

// 1011
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		char x = sc.next().charAt(0);
//		System.out.println(x);
//
//	}
//
//}

// 1012
//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		float x = sc.nextFloat();
//		System.out.printf("%.6f", x);
//
//	}
//}

//1013
//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		System.out.println(x+" "+y);
//
//	}
//}

//1014
//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		char x = sc.next().charAt(0);
//		char y = sc.next().charAt(0);
//		System.out.println(y+" "+x);
//
//	}
//}

//1015
//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		float x = sc.nextFloat();
//		System.out.printf("%.2f", x);
//
//	}
//}

////1017
//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		System.out.println(a+" "+a+" "+a);
//
//	}
//}

////1018
//import java.util.Scanner;
//public class Main {
//
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	String a = sc.next();
//	System.out.println(a);
//
//	}
//}

//1018
//	import java.util.Scanner;
//	public class Main {
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String x = sc.next();
//		String[] y = x.split("\\.");
//		int y0 = Integer.parseInt(y[0]);
//		int y1 = Integer.parseInt(y[1]);
//		int y2 = Integer.parseInt(y[2]);
//		
//		System.out.printf("%04d.%02d.%02d", y0, y1, y2);
//
//	}
//}

//1020
//import java.util.Scanner;
//public class Main {
//
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	String x = sc.next();
//	String[] y = x.split("-");
//	
//	System.out.printf(y[0] + y[1]);
//	}
//}

//1021
//	import java.util.Scanner;
//	public class Main {
//	
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			String word = sc.next();
//			System.out.println(word);
//		}
//	}

//1022
//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String x = sc.nextLine();
//		System.out.println(x);
//	}
//}

//1023
//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String x = sc.nextLine();
//		String[] y = x.split("\\.");
//		System.out.printf(y[0]+"\n");
//		System.out.printf(y[1]);
//	}
//}

//1024
//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String x = sc.next();
//		for(int i=0; i<x.length(); i++) {
//			System.out.println("'" + x.charAt(i) + "'");
//		}
//	}
//}

//1025
//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		String x = String.valueOf(num);
//		System.out.println("["+ x.charAt(0) + "0000]");
//		System.out.println("["+ x.charAt(1) + "000]");
//		System.out.println("["+ x.charAt(2) + "00]");
//		System.out.println("["+ x.charAt(3) + "0]");
//		System.out.println("["+ x.charAt(4) + "]");
//	}
//}

//1026
//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String x = sc.next();
//		String[] y = x.split(":");
//		int a = Integer.parseInt(y[1]);
//		System.out.println(a);
//	}
//}

//1027
//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String date = sc.next();
//		String[] y = date.split("\\.");
//		int a0 = Integer.parseInt(y[0]);
//		int a1 = Integer.parseInt(y[1]);
//		int a2 = Integer.parseInt(y[2]);
//		System.out.printf("%02d-%02d-%04d",a2,a1,a0);
//	}
//}

//1028
//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		long x = sc.nextLong();
//		System.out.println(x);
//	}
//}

//1029
//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double x = sc.nextDouble();
//		System.out.println(x);
//	}
//}

//1051
//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[][] map = new int[n][n];
//		int a = 1;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				map[i][j] = a++;
//				System.out.print(map[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}
//}

//1052
//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[][] map = new int[n][n];
//		int a = 1;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				map[j][i] = a++;
//			}			
//		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(map[i][j]+" ");	
//			}
//			System.out.println();
//		}
//	}
//}

//1096
//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[][] map = new int[19][19];
//		
//		int n = sc.nextInt();
//		for(int a=0;a<n;a++) {
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			
//			map[x-1][y-1] = 1;
//		}
//		
//		for(int i=0;i<19;i++) {
//			for(int j=0;j<19;j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
//	}
//}

//1097
//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[][] map = new int[19][19];
//		
//		for(int i=0;i<19;i++) {
//			for(int j=0;j<19;j++) {
//				map[i][j] = sc.nextInt();
//			}
//		}
//		
//		int n = sc.nextInt();
//		for(int N=0;N<n;N++) {
//			int x = sc.nextInt()-1;
//			int y = sc.nextInt()-1;
//			
//			for(int i=0;i<19;i++) {
//				if(map[x][i] == 0) map[x][i] = 1;
//				else map[x][i] = 0;
//			}
//			for(int j=0;j<19;j++) {
//				if(map[j][y] == 0) map[j][y] = 1;
//				else map[j][y] = 0;
//			}	
//		}
//		for(int i=0;i<19;i++) {
//			for(int j=0;j<19;j++) {
//				System.out.print(map[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
//}

//1098
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] map = new int[h][w];
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int l = sc.nextInt();
			int d = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int j = 0; j < l; j++) {
				if(d == 0) {
					map[x-1][y-1+j] = 1;
				}
				else map[x-1+j][y-1] = 1;
			}
		}
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}

