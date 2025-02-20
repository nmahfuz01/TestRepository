package testJava;

import org.testng.annotations.Test;

public class TestClass{
	
	
	public static void main (String[] args) {
	
	System.out.println("Hello");
	}
	
	@Test
	public void a() {
		System.out.println(" a Test ");
	}
	

	@Test
	public void b() {
		System.out.println(" a Main Task ");
	}
	
	
}


