package jdbcpac;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.CustomerDetails;

public class JsonToJava 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, JsonGenerationException, JsonMappingException, IOException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); 	//initial stages for connecting DB
		//This class takes all JDBC inbuilt methods and help us to connect to DB
		//This class is loaded dynamically in our Test
		//present is jdbc package

		Connection conn = null;
		//CustomerDetails cd = new CustomerDetails();
		ArrayList<CustomerDetails> al = new ArrayList<CustomerDetails>();

		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TestProject", "root", "Amit@2010");

		Statement st = conn.createStatement(); //object of Statement class will help us to execute queries
		//ResultSet rs = st.executeQuery("select * from CustomerDetails where Location ='Asia' and PurchasedDate = current_date() limit 1;");
		ResultSet rs = st.executeQuery("select * from CustomerDetails where Location ='Asia' and PurchasedDate = current_date();");

		while(rs.next())
		{
			CustomerDetails cd = new CustomerDetails();//Creating 3 different json file using 3 different java objects
			cd.setCourseName(rs.getString(1));
			cd.setPurchasedDate(rs.getString(2));
			cd.setAmount(rs.getInt(3));
			cd.setLocation(rs.getString(4));
			
			al.add(cd);

			/*					
			System.out.println(cd.getCourseName());
			System.out.println(cd.getAmount());

			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getString(4));
			 */
		}

		for(int i=0;i<al.size();i++)
		{
			ObjectMapper om = new ObjectMapper();
			//			om.writeValue(new File("D:\\Software\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\WorkSpace\\JsonJava\\customerInfo.json"),cd);
			om.writeValue(new File("D:\\Software\\eclipse-jee-2019-06-R-win32-x86_64"
					+ "\\eclipse\\WorkSpace\\JsonJava\\customerInfo"+i+".json"),al.get(i));
		}


		conn.close();

	} 

}
