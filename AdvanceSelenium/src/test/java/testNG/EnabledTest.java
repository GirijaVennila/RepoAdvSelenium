package testNG;

import org.testng.annotations.Test;

public class EnabledTest {
	@Test(priority=0)
	public void createProduct()
{
		System.out.println("Product created");
	}
	
	@Test(enabled=false)
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
//to avoid execution of one particular method we go for enabled=false