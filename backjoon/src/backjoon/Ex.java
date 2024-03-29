package backjoon;
//
//문제 설명
//정수 리스트 numList가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 메서드를 완성해주세요. 음수가 없다면 -1을 return한다.
//메서드의 반환 타입은 정수 타입이고 메서드명은 solution,
//매개변수의 타입은 정수의 배열로 받으면서 접근 제어는 모든 패키지에서 사용할 수 있도록 하며 오버라이딩이 가능하고 구현부가 존재하는 인스턴스 메서드로 작성하시오.
//제한사항
//
//5 ≤ numList의 길이 ≤ 100
//-10 ≤ numList의 원소 ≤ 100
//
//입출력 예
//
//[12, 4, 15, 46, 38, -2, 15] → 5
//[13, 22, 53, 24, 15, 6] → -1



//메서드의 반환 타입은 정수의 배열이고 메서드명은 solution, 
//매개변수의 타입은 1차원 정수 배열 타입 array, 2차원 정수 배열 타입 queries 로 받으면서 
//접근 제어는 모든 패키지에서 사용할 수 있도록 하며 오버라이딩이 가능하고 구현부가 존재하는 인스턴스 메서드로 작성하시오.
//정수 배열 array와 2차원 정수 배열 queries이 주어진다. queries의 원소는 각각 하나의 query를 나타내며, [s, e] 형태다.
//
//각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 array[index]에 1을 더한다.
//
//위 규칙에 따라 queries를 처리한 이후의 array를 return 한다.
//

//
//public class Ex {
//	
//	public int solution (int[] arr) {
//		int answer = -1;
//		for(int i = 0 ; i < arr.length ; i++) {
//			if(arr[i] < 0 ) {
//				answer = arr[i];
//				break;
//			}
//		}
//		return answer;
//	}
//public int[] solution (int[] array, int[][] queries) {
//		for(int i = 0 ; i < queries.length ; i++) {
//			for(int j = 0 ;  j < array.length ; j++) {
//				if(queries[i][0]<= array[j] && array[j]<=queries[i][1]) {
//					if(j>=i) array[j] += 1;
//				}
//			}
//		}
//		return array;
//	}
	
	//정수 number가 주어질 때, 주어진 number의 자리 수의 합을 return한다. 단, 
	//입력 값이 0이하의 정수이면 0을 반환한다.
	//메서드의 반환 타입은 정수 타입이고 메서드명은 solution, 매개변수의 타입은 정수로 받으면서 
	//접근 제어는 모든 패키지에서 사용할 수 있도록 하며 
	//오버라이딩이 가능하고 구현부가 존재하는 인스턴스 메서드로 작성하시오.
//	public int solution (long number) {
//		int answer = 0;
//		char A = ' ';
//		String B, str = String.valueOf(number);
//		if (number > 0){
//			for(int i = 0 ; i < str.length() ; i++) {
//				A = str.charAt(i);
//				B = String.valueOf(A);
//				answer += Integer.parseInt(B);
//			}
//		}
//		return answer;
//	}
//}



