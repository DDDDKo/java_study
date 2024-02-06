package ch02.review;

public class A_Instance {

	public static void main(String args) {
		
		// 객체(인스턴스): 클래스에 정의된 대로 만들어진 독립적인 실체
		// 클래스로 '생성'하는 작업이 이루어짐
		// 인스턴스 생성하는법: new 연산자를 사용하여 생성 - new 클래스명();
		ExampleClass instance = new ExampleClass();
		// instance라는 이름의 참조변수를 선언 = ExampleClass 인스턴스를 생성
		
		// 아래 코드는 변수를 선언
		int number;
		ExampleClass example;
		
		// 아래 코드가 인스턴스 생성
		new ExampleClass();

		// 인스턴스의 변수와 메서드 접근: 인스턴스.변수 / 인스턴스.메서드() // 변수는 접근 메서드는 호출이라고함
		instance.instanceVariable = 0;
		instance.instanceMethod();
		// new ExampleClass() 코드 자체도 인스턴스이기에 이런 코드도 가능 하지만 instanceVariable = 0; 행위가 이루어지고 사라짐
		new ExampleClass().instanceVariable = 0;
		
		// 아래 코드는 인스턴스가 복사 된것이 아닌 instance의 주소가 할당 된것 
		ExampleClass anotherInstance = instance;
		
	}
}
