package testNG;

import org.testng.annotations.Test;

public class SampleTest {

	@Test(priority=0)
	public void createProduct()
{
		System.out.println("Product created");
	}
	
	@Test(priority=1)
	public void modifyProduct()
	{
		System.out.println("Modify Product");
	}
	
	@Test(priority=2)
	public void deleteProduct()
{
	System.out.println("Delete Product");	
}
}
