package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class FetchDataFromDataBase {

	public static void main(String[] args) throws Throwable {
		//step1:register driver
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		
		//step2: get connection to database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata", "root", "root");
		
		//step3:create sql statement
		Statement state = conn.createStatement();
		String query = "select * from employee";
		
		//step4:execute statement/query
		ResultSet result = state.executeQuery(query);
		
		while(result.next()) {
			System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
		}
		
		//step5:close database connection
		conn.close();
		}

}
/*o/p:
	1	girija	vennila	spm
	1	vijay	vennila	chennai    */
