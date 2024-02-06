package ch02;

class ExampleClass2{
	static int number = 3;
	double doubleNumber;
	// 클래스를 사용자 참조변수타입으로 사용 가능
//	int void method(Sample1 arg) {
//		arg.data++;
//		System.out.println("method in: "+arg.data);
//	}
	
//	클래스를 반환타입으로 만들면 인스턴스로 반환?
	Sample1 method() {
		Sample1 sample = new Sample1();
		sample.data = -456;
		return sample;
	}
	
	static void staticmethod() {
		
	}
}

class Sample1{
	int data;
	
	Sample1 (){}
	
	Sample1 (Sample1 sample){
		this.data = sample.data;
	}
}

public class A_JVM {

	public static void main(String[] args) {
		
		ExampleClass2 instance1 = new ExampleClass2();
		ExampleClass2 instance2 = new ExampleClass2();
		
		int number = 0;
		instance1.doubleNumber = 9.9;
		
		Sample1 sample = new Sample1();
		
		sample.data = 8;
		
		sample = instance1.method();
		
		System.out.println(sample.data);
		
		int number2 = number;
		number2++;
		System.out.println(number);
		System.out.println(number2);
		
		Sample1 sample2 = sample;
		sample2.data++;
		System.out.println(sample.data);
		System.out.println(sample2.data);
		
		Sample1 sample3 = new Sample1(sample);
		System.out.println(sample.data);
		System.out.println(sample2.data);
		sample3.data++;
		System.out.println(sample.data);
		System.out.println(sample3.data);
		
	}
}
