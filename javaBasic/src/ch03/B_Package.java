package ch03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class B_Package {

	public static void main(String[] args) {
		
		// Wrapper 클래스: 기본형 데이터 타입을 참조형 데이터 타입으로 다를 수 있도록 하는 클래스
		// 일반적으로 기본형 데이터타입의 풀네임에 첫글자를 대문자로 지정하면 Wrapper 클래스가 됨
		Integer WrapeperInt = 10;
		Double WrapperDouble = 10.0;
		Boolean WrapperBoolean = false;
		String WrapperString = "String";
		
		// 자주 사용하는 기본 기능
		// parse 메서드: 문자열을 특정 타입으로 변환
		int number = Integer.parseInt("123"); // 문자열 "123"을 정수형 123으로 변환해서 할당
		
		// toString 메서드: 특정 타입의 값을 문자열로 변환
		String string = Integer.toString(123); // 정수형 123을 문자열"123"으로 변환해서 할당
		
		// toString 수요일 시험에 출제
		// 1234567890이 주어졌을때 각 자리수의 값을 출력하는법 출제
		
		
		// Collection FrameWork: java 에서 데이터 구조에 대한 표준화된 기법을 제공
		
		// List: 데이터를 저장할 때 중복을 허용하고 순서가 존재함 (인덱스로 접근 가능) (인터페이스이므로 구현체를사용해 기능을 사용)
		List<Integer> arrayList; // 비슷한 느낌 int[] arrayList; 리스트 사용방법 List<참조변수타입> 변수명;
		// *ArrayList: List 중에서 내부 배열을 사용하여 인덱스를 사용한 검색이 빠름   ->가장 많이 사용하는 구현체
		arrayList = new ArrayList<>();
		System.out.println(arrayList);
		
		// LinkedList: 이중 연결 기법을 사용하여 추가, 삭제가 빠름
		// arrayList = new LinkedList<>();
		
		// add(): List 에 요소를 추가
		// 주의!: 추가할 요소의 데이터 타입은 반드시 제너릭으로 지정한 타입으로만 추가 가능
		//		(Object 를 사용하면 모든 타입 사용 가능 하지만 잘 사용 x(안전성이 떨어지기 때문에), <>(제너릭)을 적지 않아도 가능)  
		// 		 <> --->이부분이 제너릭
		arrayList.add(10);
		// arrayList.add("aaaa");
		System.out.println(arrayList);

		// get(): List 의 특정 인덱스 요소에 접근
		// 주의!: List 인덱스 범위를 초과하는 인덱스를 지정할 수 없음
		// 		 기본형 데이터 타입의 뱐수로 반환값을 받을 경우 null 값을 받을 수 있음을 주의
		int arrrayElement = arrayList.get(0);
		System.out.println(arrrayElement);
		
		arrayList.add(20);
		arrayList.add(30);
		
		System.out.println(arrayList);
		
		// set(): List 의 특정 인덱스 요소를 변경
		// 주의!: List 인덱스 범위를 초과하는 인덱스를 지정할 수없음
		arrayList.set(1, -99);	 
		System.out.println(arrayList);
		
		// remove(): List 의 특정 요소를 삭제
		arrayList.remove(0);
		System.out.println(arrayList);
		
		// size(): List 의 길이를 반환
		System.out.println(arrayList.size());
		//-----------------------------------------------------------------List
		// Set: 데이터를 저장할 때 중복을 허용하지 않고 순서가 존재하지 않음 (집합) =>인덱스로 접근 불가능
		Set<String> set;
		
		// HashSet: 해싱 기법을 사용해서 검색 속도가 빠름
		// set = new HashSet<>();
		
		// TreeSet: 요소를 정렬해서 추가
		set = new TreeSet<>();
		
		// add(): Set 에 요소를 추가. 단, 동일한 요소가 이미 추가되어 있다면 추가하지 않음
		set.add("Banana");
		System.out.println(set);
		set.add("Apple");
		System.out.println(set);
		set.add("Banana1");
		System.out.println(set);
		
		// remove(): Set 에서 특정 요소를 제거
		// 			 제거하고자 하는 요소가 없더라도 예외가 발생하지 않음
		set.remove("Apple");
		System.out.println(set);
		
		// contains(): Set 에서 특정 요소가 존재하는지 확인 true/false 값을 반환
		System.out.println(set.contains("Banana"));
		//-----------------------------------------------------------------Set
		
		// Map: 키와 값이 한쌍으로 이루어진 요소들의 집합, 키는 중복이 불가능, 값은 중복이 가능  => 인덱스로 접근 불가능
		Map<String, String> map;
		
		// HashMap: 해싱기법으로 키의 검색 속도가 빠름
		// map = new HashMap<>();
		
		// TreeMap: 키를 정렬하여 저장
		map = new TreeMap<>();
		
		// put(): Map 에 키와 값을 추가
		// 		  만약 동일한 키가 존재한다면 해당키의 값을 변경
		map.put("Apple", "사과");
		System.out.println(map);
		
		map.put("Banana", "바나나");
		System.out.println(map);
		
		map.put("Apple", "링고");
		System.out.println(map);
		
		map.put("Banana1", "바나나");
		System.out.println(map);
		
		// get(): Map 에서 특정 키를 가지는 요소를 반환
		// 		  존재하지 않는 키로 검색할 경우 null 을 반환
		System.out.println(map.get("Apple"));
		
		// remove(): Map 에서 특정 키를 가지는 요소를 제거
		// 			 없는 키를 입력시 제거 x, 예외처리 x
		// remove 작업에 성공하면 해당 키의 값을 반환(pop 개념) => 변수에 값을 받을 수 있음
		System.out.println(map.remove("Apple"));
		
		class Human {
			String name;
			String address;
			int age;
		}
		
		Human human1 = new Human();
		human1.name = "홍길동";
		human1.address = "address";
		human1.age = 10;
		// name="홍길동"
		// address="부산광역시 진구"
		Map<String, Object> human2 = new HashMap<>();
		human2.put("name", "홍길동");
		human2.put("address", "address");
		human2.put("age", "열살");
		
		// Map 으로 인스턴스용도로 사용했을때 문제점
		// 1. 사용 혹은 추가할때 오타(실수)에 대한 가능성
		human2.get("name");
		// 2. 타입의 안전성의 문제 (age가 문자열이기 때문에 예외 발생)
		Integer age = (Integer) human2.get("age");
		
		
	}
}