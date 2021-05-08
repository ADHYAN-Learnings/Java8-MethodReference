package methodReference;

interface B{
	public int add(int a , int b);
}

public class Test2 {
	
	public static int add_1(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		B b =  Test2::add_1;
		
		System.out.println("Addition : "+b.add(10, 20));

	}

}
