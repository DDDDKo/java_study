package ch02;

// 다형성: 하나의 표현이 여러가지 형태로 나타낼 수 있는 것

// 오버로드: 같은 클래스 내에서 동일한 메서드의 이름으로 여러개의 메서드를 정의할 수 있도록 하는 것
// 오버라이드: 자손 클래스에서 조상 클래스에 정의된 메서드를 재정의 하는 것

class Human1{
	String name;
	int age;
}

class Developer1 extends Human1 {
	String position;
}

class FootballPlayer1 extends Human1 implements FootballPlay {
	int goal;

	@Override
	public void kick() {}	
}

interface FootballPlay{
	public abstract void kick ();
}

public class H_Polymorphism {

	public static void main(String[] args) {
		
		Human1 human1 = new Human1();
		
		Developer1 developer1 = new Developer1();
		FootballPlayer1 footballPlayer1 = new FootballPlayer1();
		
		// 업캐스팅: 하위 클래스의 객체를 상위 클래스에 참조변수에 담을 수 있도록 변환
		//		   또는 인터페이스 구현 클래스를 구현한 인터페이스의 타입 참조변수로 담을 수 있도록 하는것
		Human1 human2 = new Developer1();
		Human1 human3 = new FootballPlayer1();
	
		FootballPlay fotball = new FootballPlayer1();
		
		// human2.position = "";
		
		// 다운 캐스팅: 업캐스팅된 객체를 다시 원래의 타입의 참조 변수에 담을수 있도록 변환하는 것
		Developer1 developer2 = (Developer1) human2;
		developer2.position = "";
		
		FootballPlayer1 fp = new FootballPlayer1();
		fp.name = "홀길동";
		fp.age = 30;
		fp.goal = 55;
		
		System.out.println(fp);
		System.out.println(fp.name);
		System.out.println(fp.goal);
		
		Human1 hm = fp;
		System.out.println(hm);
		System.out.println(hm.name);
		// System.out.println(hm.goal);
		// hm.kick();
		
		FootballPlayer1 fpp = (FootballPlayer1)hm;
		System.out.println(fpp);
		System.out.println(fpp.name);
		System.out.println(fpp.goal);
		
		// 부모 클래스에서 자식 클래스로는 업캐스팅이 불가능하다
//		Human1 hmm = new Human1();
//		Developer1 dev = (Developer1) hmm;
//		
//		dev.position = "포지션"; 
//		System.out.println(dev.position);
		
		
		// 일반적인 형변환 과는 다른점 일반적인 형변환에서는 값을 소실하지만 캐스팅에서는 데이터 소실이 일어나지 않는다
		double p = 3.14;
		int a = (int) p;
		System.out.println(a);
		p = a;
		System.out.println(p);
		
		int intVariable = 128;
		
		// Object 클래스의 참조변수는 어떠한 클래스의 인스턴스도 받을 수 있음
		Object object1 = new Human();
		Object object2 = new Developer();
		Object object3 = new FootballPlayer1();
		
	}
}







