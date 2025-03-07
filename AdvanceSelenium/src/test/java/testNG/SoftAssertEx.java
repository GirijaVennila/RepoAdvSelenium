package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	
	//SoftAssert:-
	//* All methods are non static in nature
	//* If assert fails does not stops the execution,it continues the execution
	//* AssertAll() method is mandatory-->code/method required to track the fail status
	//* If Assert fails throws AssertError Exception
	//* Used for Non mandatory fields

	@Test
	public void m1()
	{
		System.out.println("step1");
		System.out.println("step2");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(true, false);
		System.out.println("step3");
		System.out.println("step4");
		soft.assertAll();
	
	}

}
