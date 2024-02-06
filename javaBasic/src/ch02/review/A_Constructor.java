package ch02.review;

class constructorClass{
	
	int instanceVariable1;
	double instanceVariable2;

	// 생성자: 클래스의 인스턴스를 생성할때 호출되는 메서드
	// 생성시에 실행할 코드를 구현한 메서드, 일반적으로 인스턴스 변수 초기화 작업에 사용됨
	// 생성자를 개발자가 직접 작성하지 않으면 자바가 기본 생성자를 자동으로 생성
	
	// 규칙: 1. 클래스명과 메서드명이 동일해야함
	//		2. 반환타입을 지정하지 않음
	//		3. 인스턴스 생성 후에 사용할 수 없
	constructorClass () {
		// 아래와 같은 상황을 '의존성을 내부에서 주입한다'라고 함
		// 의존성을 내부에서 주입하는 상황은 지양해야 함
		this.instanceVariable1 = 10;
		this.instanceVariable2 = 9.9;
	}
	
	// 생성자도 메서드이기 때문에 오버로딩이 가능하다
	constructorClass (int instanceVariable1){
		// this: 현재(지금 이 지역, 공간, 클래스 내부) 인스턴스 혹은 클래스를 가리키는 클래스
		// 글로벌 위치에 있는 변수 혹은 메서드를 지칭할 때 사용
		this.instanceVariable1 = instanceVariable1;
	}
	
	constructorClass (int instanceVariable1, double instanceVariable2){
		// this(): 현재 클래스의 다른 생성자를 호출하는 키워드
		this(instanceVariable1);
		this.instanceVariable2 = instanceVariable2;
	}
}

public class A_Constructor {

	public static void main(String[] args) {
		
		// 생성자 사용
		constructorClass instance1 = new constructorClass();
		constructorClass instance2 = new constructorClass(1);
		constructorClass instance3 = new constructorClass(2, 1.1);
		
		System.out.println(instance1.instanceVariable1);
		System.out.println(instance1.instanceVariable2);
		System.out.println(instance2.instanceVariable1);
		System.out.println(instance2.instanceVariable2);
		System.out.println(instance3.instanceVariable1);
		System.out.println(instance3.instanceVariable2);
		
		
		
	}
}
