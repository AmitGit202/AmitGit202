package remoteTesting.DockerValidation;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeTest1 

{

	@BeforeTest
	public void startDockerScale() throws IOException, InterruptedException
	{
		File f2 = new File("output.txt");
		if(f2.delete())
		{
			System.out.println("File deleted successfully");
		}
		Thread.sleep(20);
		StartDocker sd = new StartDocker();
		sd.startDockerFile();
	}


	@Test
	public void test1() throws MalformedURLException	
	{
		// TODO Auto-generated method stub

		DesiredCapabilities cap = DesiredCapabilities.chrome();
		URL u = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(u,cap);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}



	@AfterTest
	public void stopDockerDeleteFile() throws IOException, InterruptedException
	{
		Thread.sleep(20);
		StopDocker sdd = new StopDocker();
		sdd.stopDockerFile();
	}


}
