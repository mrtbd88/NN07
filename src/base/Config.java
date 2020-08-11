package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Config extends WDFunctions {


@BeforeMethod
public void beforeEachTestMethod(){
	
//	System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+"/drivers/chromedriver.exe"));
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahfuj Tuhin\\eclipse-workspace\\NN07\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	System.out.println (" chrome driver open------------------");
	driver.get("http://www.booking.com");
   }
}