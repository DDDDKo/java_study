package backjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0, max = 0;
		
		if(a==b || b==c || a==c) {
			sum = 10000 + (a * 1000);
			System.out.println(sum);
		}else if(a==b && b==c && a==c) {
			if(a==b) {
				max = a;
				sum = 1000 + (max * 100);
				System.out.println(sum);
			}else if(b==c) {
				max = b;
				sum = 1000 + (max * 100);
				System.out.println(sum);
			}else if (a==c) {
				max = c;
				sum = 1000 + (max * 100);
				System.out.println(sum);
			}
		}else {
			if(a>b)
			System.out.println(a*100);
			else if(b>c)
			System.out.println(b*100);
			else if(c>a)
			System.out.println(c*100);
		}
	}
}