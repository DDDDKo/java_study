package ch02_sub;

class InterfaceSub implements G_Message {
	
	int method3(int number) {
		System.out.println(GREETING_MESAAGE);
		
		System.out.println(GOODBYE_MESAAGE);
		return 3 + number;
	}
	
}

public class G_InterFaceSub implements G_Message, G_Method{
	
	public void method1 () {
		System.out.println(GREETING_MESAAGE);
		
		System.out.println(GOODBYE_MESAAGE);
	}
	
	public void method2 () {
		System.out.println(G_Message.GREETING_MESAAGE);
		
		System.out.println(G_Message.GOODBYE_MESAAGE);
	}
	
	
}
