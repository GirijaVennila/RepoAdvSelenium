package testNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
	//executing same method with same set of data
	@Test(priority=1,invocationCount=2)
	public void createProduct()
{
		System.out.println("Product created");
	}
	
	@Test(priority=0)
	public void modifyProduct()
	{
		System.out.println("Modify Product");
	}
	
	@Test(priority=2)
	public void deleteProduct()
{
	System.out.println("Delete Product");	
}
}//1st execute-dependsonmethod,2-priority,3-invocationCount