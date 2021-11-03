package jdbcpac;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.commons.text.StringEscapeUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import pojo.CustomerDetails;

public class OneSingleJson 
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
		JSONArray js = new JSONArray();

		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TestProject", "root", "Amit@2010");

		java.sql.Statement st = conn.createStatement(); //object of Statement class will help us to execute queries
		//		ResultSet rs = st.executeQuery("select * from CustomerInfo where Location ='Asia' and PurchasedDate = current_date() limit 1;");
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
			om.writeValue(new File("D:\\Software\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\WorkSpace\\JsonJava\\customerInfo"+i+".json"),al.get(i));
			
			Gson g = new Gson();
			String jsonString = g.toJson(al.get(i));
			js.add(jsonString);

		}
		//Create Json String from Java Object

		JSONObject jo = new JSONObject();
		jo.put("data",js);
		System.out.println(jo.toJSONString());

		String unescapeString = StringEscapeUtils.unescapeJava(jo.toJSONString());
		System.out.println(unescapeString);

		String String1 = unescapeString.replace("\"{", "{");
		String finalString = String1.replace("}\"", "}");
		System.out.println(finalString);
		try
		(FileWriter file = new FileWriter("D:\\Software\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\WorkSpace\\JsonJava\\SingleJson.json"))
		{
			file.write(finalString);

		}
		catch (IOException e) 
		{
        	e.printStackTrace();

    	}

/*	//Not working code
 		try 
			{
            	// Constructs a FileWriter given a file name, using the platform's default char set
				FileWriter file2 = new FileWriter("D:\\Software\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\WorkSpace\\JsonJava\\Customerdetails2.json");
            	file2.write(finalString);
        	} 
			catch (IOException e) 
			{
            	e.printStackTrace();
 
        	}
*/
		conn.close();

	} 

}
