package javafeatures.lambdaexpression;

public class RunnableTest {
	
	public static void main(String[] args) {
		System.out.println("==== Test the Runnable Test");
		
		Runnable r1 = new Runnable() {
			
			public void run() {
				System.out.println("Runnable Test 1");
			}
		};
		
		Runnable r2 = () -> System.out.println("Runnable Test 2");
		
		//Test
		r1.run();
		r2.run();
	}
}
