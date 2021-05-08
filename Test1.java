package methodReference;

interface A {
	public void display();
}

public class Test1 {
	
	private int display_1() {
		System.out.println("Method Reference in Java 8");
		return 0;
	}

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		A check = test1::display_1;  
		
		check.display();

	}

}
