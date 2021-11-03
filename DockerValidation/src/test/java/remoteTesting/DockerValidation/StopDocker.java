package remoteTesting.DockerValidation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StopDocker 
{

	/*
	 
 // 	@Test
	//public void stopDockerFile() throws IOException, InterruptedException

	//{

		//Runtime r = Runtime.getRuntime();
		//r.exec("cmd /c start dockerdown.bat");
		Thread.sleep(3000);	
	}
	
	 */
	
	public void stopDockerFile() throws IOException, InterruptedException
	{
		boolean flag = false;
		Runtime r = Runtime.getRuntime();
		r.exec("cmd /c start dockerdown.bat");

		String f = "output.txt";

		Calendar cal = Calendar.getInstance();	//ex- 2:44:15 sec
		cal.add(Calendar.SECOND, 45);			//2:44:45 sec
		long stopnow = cal.getTimeInMillis();
		Thread.sleep(3000);

		while(System.currentTimeMillis()<stopnow)
		{
			if(flag)
			{
				break;

			}
			BufferedReader reader;
			reader = new BufferedReader(new FileReader(f));
			String currentLine;
			currentLine = reader.readLine();

			while(currentLine!= null && !flag)
			{
				if(currentLine.contains("Shutdown complete"));
				{
					System.out.println("found my text");
					flag = true;
					break;
				}
			}
			reader.close();
		}

		Assert.assertTrue(flag);
		Thread.sleep(10000);



	}


}
