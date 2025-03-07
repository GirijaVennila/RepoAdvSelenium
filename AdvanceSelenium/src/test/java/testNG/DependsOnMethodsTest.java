package testNG;

import org.testng.annotations.Test;

public class DependsOnMethodsTest {
	@Test()
	public void createProduct()
{
		//*--.if it fails depends on method will skip that method
		System.out.println("Product created");
	}
	
	@Test(dependsOnMethods="createProduct")
	public void modifyProduct()
	{
		System.out.println("Modify Product");
	}
	
	@Test(dependsOnMethods="createProduct")
	public void deleteProduct()
{
	System.out.println("Delete Product");	
}
}
