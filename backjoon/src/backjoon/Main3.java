package backjoon;


public class Main3 {

	public static void main(String[] args) {
	
		int n = 5;
		String my_string = "He110W0r1d";
		//String answer = "";
        int a = my_string.length() - n;
        for( int i = 0 ; i < n ; i++){
  //          answer += my_string.charAt(a+i);
        }
		
		//System.out.println(answer);
        
        String code = "abc1abc1abc";
        String answer = "";
        String ret = "";
        int mode = 0;
        for(int i = 0 ; i < code.length() ; i++){
            if(mode == 0) {
            	if(code.charAt(i)=='1') {
            		mode = 1;
            	}
            	else {
            		if(i%2==0) ret += code.charAt(i);
            	}
            }else {
            	if(code.charAt(i)=='1') {
        			mode = 0;
            	}
            	else {
            		if(i%2==1) ret += code.charAt(i);
            	}
            }
        }
        answer = ret;
        if (ret == "") answer = "EMPTY";
        System.out.println(answer);
        
	}
}
 
//
//class Solution {
//    public int solution(int a, int d, boolean[] included) {
//        int answer = 0;
//        for(int i = 0 ; i < included.length ; i++) {
//        	if(included[i]) answer += a+(d*i);
//        }
//        return answer;
//    }
//}


//주사위 게임 2
//class Solution {
//    public int solution(int a, int b, int c) {
//    	int answer = 0;
//        if(a != b && b != c && a != c)answer = a + b + c;
//        else if (a == b && a == c) answer = (a+b+c) * (a*a+b*b+c*c) * (a*a*a+b*b*b+c*c*c);
//        else answer = (a+b+c) * (a*a+b*b+c*c);
//		System.out.println(answer);
//    }
//}

// 원소들의 곱과 합
//class Solution {
//    public int solution(int[] num_list) {
//        int answer = 0;
//        int sum = 0, multiply = 1;
//        for(int i = 0 ; i < num_list.length ; i++) sum += num_list[i];
//        for(int i = 0 ; i < num_list.length ; i++) multiply *= num_list[i];
//        return answer = (sum*sum)>multiply ? 1 : 0;
//    }
//}
