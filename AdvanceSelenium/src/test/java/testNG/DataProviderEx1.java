package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {
	//executing same method with different set of data
	@Test(dataProvider = "getData")
public void bookTickets(String src,String dest,int noOfPeople)
{
	System.out.println("Book tickets from "+src+" to "+dest+" no of people are "+noOfPeople);
}
	@DataProvider
public Object[][] getData()
{
	Object[][] objArr = new Object[3][3];
	
	objArr[0][0]="Goa";
	objArr[0][1]="Bangalore";
	objArr[0][2]=25;
	
	objArr[1][0]="Goa";
	objArr[1][1]="Mangalore";
	objArr[1][2]=60;
	
	objArr[2][0]="Goa";
	objArr[2][1]="Mysore";
	objArr[2][2]=50;
	
	return objArr;
	}
}
//object[][]==>it accepts all set of data
