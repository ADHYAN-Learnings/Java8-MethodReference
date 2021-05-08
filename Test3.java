package methodReference;

interface C {
	public int multiply(int a, int b);
}

public class Test3 {

	 public int multiply_1(int a, int b) {
		 return a*b;
	 }
	
	public static void main(String[] args) {
		C c = new Test3()::multiply_1;
		
		System.out.println(" Multiplication : "+c.multiply(10, 10));

	}

}
