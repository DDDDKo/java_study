package ch02;

// 기타 제어자(비접근 제어자): 접근 제어와 무관하게 동작을 제어하는 것

// final 제어자:
// - 클래스: final 제어자가 붙은 클래스는 확장(상속)할 수 없음
// - 메서드: final 제어자가 붙은 클래스는 오버라이드(재정의)할 수 없음
// - 변수: final 제어자가 붙은 변수는 재할당할 수 없음
final class FinalModifier1 {
	int variable;
}

// 상속(확장) 예제
// class SubModifier1 extends FinalModifier1{
//	
// }

class FinalModifier2 {
	
	final void method () {}
	
}

// 오버라이드(재정의) 예제
class SubFinalModifier2 extends FinalModifier2{
	
	//void method () {}
	
}

// 변수 재할당 예제
class FinalModifier3 {
	
	final int variable = 10;
	
	void method( ) {
//		variable = 0;
	}
	
}

// static 제어자:
// - 메서드: static 제어자가 붙은 메서드는 인스턴스 생성없이 클래스로 바로 호출 가능
// - 변수: static 제어자가 붙은 변수는 인스턴스 생성없이 클래스로 바로 호출하고 접근 가능
class StaticModifier {
	static int variable;
	
	static void method() {}
}

// 제어자의 조합
class Combination {
	
	// public + static + final    => 가장 많이 사용하는 유형
	public static final int NUMBER = 10;
	
	// 메서드에서 private + final => 사용되지 않는 유형 
	private final void method () {}
	
	// 메서드에서 private + abstract  => 서로 상충되어 말이 안 됨  // private는 외부에서 접근 불가능 abstract는 무조건 overried가 되어야함
	// 메서드에서 final + abstract => 서로 상충되어 말이 안 됨 // final은 oberried가 될 수 없음(재정의 할 수없음) abstract는 무조건 overried가 되어야함
	
}




public class D_Modifier {

	public static void main(String[] args) {
		
		StaticModifier.variable = 0;
		StaticModifier.method();
		
		
	}
}
