package remoteTesting.DockerValidation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StartDocker 
{

/*
	@Test
//	public void startDockerFile() throws IOException, InterruptedException
	//{

	//	Runtime r = Runtime.getRuntime();
		//r.exec("cmd /c start dockerup.bat");
		Thread.sleep(10000);
	}

*/	
	
	public void startDockerFile() throws IOException, InterruptedException
	{
		boolean flag = false;
		Runtime r = Runtime.getRuntime();
		r.exec("cmd /c start dockerup.bat");

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
			BufferedReader reader = new BufferedReader(new FileReader(f));
			String currentLine = reader.readLine();

			while(currentLine!= null && !flag)
			{
				if(currentLine.contains("Node has been added"));

				{
					System.out.println("found my text");
					flag = true;
					break;
				}
			}
			reader.close();
		}
		Assert.assertTrue(flag);
	//	r.exec("cmd /c start scale.bat");
		Thread.sleep(13000);
	}
}
