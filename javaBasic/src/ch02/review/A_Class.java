package ch02.review;

// Class : 공통 성질을 가진 대상들의 집합(정의)
class ExampleClass{
	
	// 속성(필드): 해당 클래스의 객체(인스턴스)가 가질수 있는 정보나 상태 
	
	// 유형
	// 인스턴스 변수: **각 인스턴스가 독립적**으로 가질수 있는 속성
	// 특징: 반드시 인스턴스가 생성된 후에 인스턴스로 사용할 수 있음
	int instanceVariable;
	
	// 클래스 변수(static 변수): **같은 클래스로 생성된 인스턴스가 공유**하는 속성
	// static 키워드를 사용하여 선언
	// 특징: 클래스로 직접 사용할 수 있고, 인스턴스에서도 사용할 수 있음
	static int staitcVariable;
	
	// 기능(메서드):  해당 클래스가 수행할 수 있는 작업이나 행동
	// 반환타입 메서드이름 (매개변수) {메서드가 수행할작업}
	
	// 유형
	// 인스턴스 메서드: **각 인스턴스가 독립적**으로 수행하는 기능
	// 특징: 1. 인스턴스가 생성된 후에 사용할 수 있음
	// 		2. 일반적으로 인스턴스 변수를 사용하는 기능을 구현할때 사용
	void instanceMethod() {
		
	}
	
	// 클래스 메서드: **같은 클래스로 생성된 인스턴스가 공유**하는 기능
	// static 키워드를 사용하여 선언
	// 특징: 1. 인스턴스 변수를 사용할 수 없음 / 일반적으로 인스턴스 변수를 사용하지 않는 기능을 구현할 때 사용
	//		2. 클래스로 직접 사용할 수 있고, 인스턴스로도 사용할 수 있음
	static void staticMethod() {
		
	}
	
}



public class A_Class {

	public static void main(String[] args) {
		
		
		
		
		
		
		
	}
}
