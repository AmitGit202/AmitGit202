package jdbcpac;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.CustomerDetailsAppium;

public class extractJson
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
	{
		//Json will be the response of API
		//Update and Read the Json file 
		ObjectMapper om = new ObjectMapper();
		//			om.writeValue(new File("D:\\Software\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\WorkSpace\\JsonJava\\customerInfo.json"),cd);
		CustomerDetailsAppium cda = om.readValue(new File("D:\\Software\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse"
				+ "\\WorkSpace\\JsonJava\\customerInfo0.json"),CustomerDetailsAppium.class);
	
		System.out.println(cda.getCourseName());
		System.out.println(cda.getStudentName());
		//Validate records in the web Table are correct or not
		//getText()--Appium
	}

}
