package Sample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import GENERIC_UTILTY.B;
//import GENERIC_UTILTY.BASE;


//import Generic_utility.BaseClass;
import Generic_utility.FileUtility;
import OBJECTREPOSITORY.LoginPage;

public class LoginToVtigerTest extends B{
	@Test(groups = "regression")
public void loginVtiegr()  throws Throwable
{
System.out.println("logged in");
////	WebDriver driver=new EdgeDriver();
//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	FileUtility f=new FileUtility();
//	String URL = f.getKeyAndValue("url");
//	String USERNAME=f.getKeyAndValue("username");
//	String PASSWORD=f.getKeyAndValue("password");
//	driver.get(URL);
//	LoginPage login=new LoginPage(driver);
//	login.loginToVtiger(USERNAME, PASSWORD);
}
}
