package backjoon;

//import java.util.Scanner;

public class AAA {

	public static void main(String[] args) {
//		int[] array = {0,1,2,3,4};
//		int[][] queries = {{0,1},{1,2},{2,3}};
//			for(int i = 0 ; i < queries.length ; i++) {
//				for(int j = 0 ;  j < array.length ; j++) {
//					if(queries[i][0]<= array[j] && array[j]<=queries[i][1]) {
//						if(j>=i) array[j] += 1;
//					}
//				}
//			}
//		for(int i = 0 ; i < array.length ; i++) {
//			System.out.print(array[i] + " ");
//		}
		int number = 12345678;
		int answer = 0;
		char A = ' ';
		String B, str = String.valueOf(number);
		if (number > 0){
			for(int i = 0 ; i < str.length() ; i++) {
				A = str.charAt(i);
				B = String.valueOf(A);
				answer += Integer.parseInt(B);
			}
		}
		System.out.println(answer);
		
		
	}
}
