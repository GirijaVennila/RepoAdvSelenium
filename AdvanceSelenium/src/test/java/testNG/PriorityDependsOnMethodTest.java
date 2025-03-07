package testNG;

import org.testng.annotations.Test;

public class PriorityDependsOnMethodTest {
	@Test(priority=0)
	public void createProduct()
{
		System.out.println("Product created");
	}
	
	@Test(priority=-1,dependsOnMethods="createProduct")
	public void modifyProduct()
	{
		System.out.println("Modify Product");
	}
	
	@Test(priority=2,dependsOnMethods="createProduct")
	public void deleteProduct()
{
	System.out.println("Delete Product");	
}
}
//if we give both it takes first dependsOnMethods then go for priority
