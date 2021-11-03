package remoteTesting.DockerValidation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxStandAlone 
{

	public static void main(String[] args) throws MalformedURLException 
	{
		// TODO Auto-generated method stub

		DesiredCapabilities cap = DesiredCapabilities.firefox();
		URL u = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(u,cap);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

}
