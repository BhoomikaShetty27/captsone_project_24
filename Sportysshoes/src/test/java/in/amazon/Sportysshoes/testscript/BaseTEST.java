package in.amazon.Sportysshoes.testscript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseTEST {

ChromeDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		//1.open the browser
		
				driver=new ChromeDriver();
				//2.maximize it
				driver.manage().window().maximize();
				
				//3. navigate to url
				driver.get("http://localhost:9010/");
}
}
