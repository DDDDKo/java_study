package ch01;

import java.util.Scanner;

public class BACK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	    if(100>=a){
	        System.out.print("A");
	    }
	    else if(90>a) {
	 	   System.out.print("B");
	    }
	    else if(79>=a) {
	       System.out.print("C");
	    }
        else if(69>=a){
           System.out.print("D");
        }
        else {
           System.out.print("F");
        }
	}
}