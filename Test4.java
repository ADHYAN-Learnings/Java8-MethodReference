package methodReference;

public class Test4 {

	 public static void diplay_check() {
		 System.out.println(" Method Reference with Thread implmentation");
	 }
	 
	public static void main(String[] args) {
		Runnable r = Test4::diplay_check;
		Thread t = new Thread(r);
		t.start();
		

	}

}
