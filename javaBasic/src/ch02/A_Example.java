package ch02;

// GalaxyPhone
// 제조사: (maker - String)
// 모델명: (modelName - String)
// 소유자: (owner - String)
// 전화번호: (telNumber - String)
// 전원상태: (power - boolean)

// 전원버튼누름: onPower - power 상태를 부정
// 전화걸기: call - power가 true일 때 "(상대 전화번호)로 전화를 겁니다." 출력
// 긴급전화걸기: emergency - "112로 전화를 겁니다."출력 
// 휴대전화정보보기: getInfomation - power가 true일 때
// 
// ===== (전화번호) =====
// 제조사: (제조사)
// 모델명: (모델명)
// 소유자: (소유자)

class GalaxyPhone{
	static String maker;
	String modelName;
	String owner;
	String telNumber;
	boolean power;
	
	void onPower () {
		power = !power;
	}
	
	void call (String toTelNumber) {
		if(!power) return; 
		System.out.println(toTelNumber + "로 전화를 겁니다.");
	}
	
	static void emergency () {
		System.out.println("112로 전화를 겁니다.");
	}
	
	void getInfomation () {
		if(!power) return;
		System.out.println("===== " + telNumber + " =====");
		System.out.println("제조사: " + maker);
		System.out.println("모델명: " + modelName);
		System.out.println("소우자: " + owner);
	}
}

// Drama
// 방송사: (broadcastingCompany - String)
// 제목: (title - String)
// 배우: (actors - String[])
// 장르: (genre - String)
// 시청률: (viewerRating - double)
// 부작: (series - int)

// 정보보기: getInfomatin
// ===== (title) =====
// 방송사: (broadcastingCompany)
// 장르: (genre)
// 부작: (series)부작
// 싱청률: (viewerRating)%
// 배우: (actors), (actors), (actors), ...        전지현, 김수현, 박해진, 유인나


class Drama{
	String broadcastingCompany;
	String title;
	String[] actors;
	String genre;
	double viewerRating;
	int series;
	
	void getInfomatin () {
		System.out.println("==== " + title + " ====");
		System.out.println("방송사: " + broadcastingCompany);
		System.out.println("장르: " + genre);
		System.out.println("부작: " + series + "부작");
		System.out.println("시청률: " + viewerRating + "%");
		System.out.print("배우: " );
		for(int i = 0 ; i < actors.length ; i++) {
//			System.out.print(actors[i]);
//			if( i < actors.length - 1) System.out.println(", ");
//			System.out.println(i < actors.length - 1 ? actors[i]+ ", " : actors[i]);
			String actor = i < actors.length - 1 ? actors[i]+ ", " : actors[i];
			System.out.print(actor);
			
		}
		System.out.println("");
	}
}

// TriangleMath
// 빗변 구하기 - getHypotenuse
// 둘레 구하기 - getCircumference
// sin 구하기 - getSin
// cos 구하기 - getCos
// tan 구하기 - getTan


class TriangleMath{
	
	// static final double PI = 3.14;
	
	static double getHypotenuse(int bottom, int height) {
		if(bottom <= 0 || height <= 0) return 0;
		// if(!(bottom > 0 && height >0)) return 0;
		double result =  Math.sqrt(Math.pow(bottom, 2) + Math.pow(height, 2));
		return result;
		// return Math.sqrt(result);
		// return Math.sqrt(Math.pow(bottom, 2) + Math.pow(height, 2));
	}
	
	static double getCircumference(int height, int bottom, int hypotenuse) {
		if(bottom <= 0 || height <= 0 || hypotenuse <= 0) return 0;
		return height + bottom + hypotenuse;
	}
	static double getCircumference(double height, int bottom, int hypotenuse) {
		if(bottom <= 0 || height <= 0 || hypotenuse <= 0) return 0;
		return height + bottom + hypotenuse;
	}
	static double getCircumference(int height, double bottom, int hypotenuse) {
		if(bottom <= 0 || height <= 0 || hypotenuse <= 0) return 0;
		return height + bottom + hypotenuse;
	}
	static double getCircumference(int height, int bottom, double hypotenuse) {
		if(bottom <= 0 || height <= 0 || hypotenuse <= 0) return 0;
		return height + bottom + hypotenuse;
	}
	
	static double getSin(int height, int hypotenuse) {
		if(height <= 0 || hypotenuse <= 0) return 0;
		return height / hypotenuse;
	}
	
	static double getCos(int bottom, int hypotenuse) {
		if(bottom <= 0 || hypotenuse <= 0) return 0;
		return bottom / hypotenuse;
	}
	
	static double getTan(int height, int bottom) {
		if(bottom <= 0 || height <= 0) return 0;
		return height / bottom;
	}
}

public class A_Example {

	public static void main(String[] args) {
		
		// new GalaxyPhone();  -> 정확히 이 구문이 인스턴스 생성한것
		
		// 생성자 : 클래스의 이름과 똑같은 메서드 이름 뒤에 ()가 붙음 ex) GalaxyPhone()
		// 자동으로 생성되지만 사용자가 직접 만들어 사용도 가능, 반환타입이 없음
		
		GalaxyPhone s23 = new GalaxyPhone();
		GalaxyPhone s24 = new GalaxyPhone();
		
		GalaxyPhone.maker = "LG";
		
		// s23.maker = "SAMSUNG";
		s23.modelName = "s23";
		s23.owner = "홍길동";
		s23.telNumber = "010-1234-5678";
		s23.power = false;
		
		// s24.maker = "SAMSUNG";
		s24.modelName = "s24";
		s24.owner = "김철수";
		s24.telNumber = "010-5678-1234";
		s24.power = false;
		
		s23.onPower();
		s23.getInfomation();
		
		GalaxyPhone.emergency();
		s23.emergency();
		s24.emergency();
		
		// new Drama = 새로운 인스턴스를 생성
		// Drama star = 인스턴스를 담은 참조 변수
		Drama star = new Drama();
		star.broadcastingCompany = "SBS";
		star.title = "별에서 온 그대";
		star.actors = new String[] {"전지현", "김수현", "박해진", "유인나"};
		star.genre = "로맨스";
		star.viewerRating = 28.1;
		star.series = 21;
		
		star.getInfomatin();
		
		TriangleMath triangelMath = new TriangleMath();
		double bit = TriangleMath.getHypotenuse(3, 4);
		bit = TriangleMath.getHypotenuse(3, 4);
		System.out.println(bit);
		//System.out.println(TriangleMath.getHypotenuse(3, 4));
		
		// SOID중 S 단일책임원칙 위반 삼각함수에 PI가 존재할 이유가 없음
		// System.out.println(TriangleMath.PI);
		// TriangleMath.PI = 0.0;
		
		
	}
}



