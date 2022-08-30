package TestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


import automation.brawsor;
import PMO.FBPMOtest;
import automation.Screenshot;
public class TestNgFB extends FBPMOtest {
	WebDriver driver;
	FBPMOtest obj= new FBPMOtest();
	
	@Test(priority=0)
	public void FbloginInvallid() throws EncryptedDocumentException, IOException, InterruptedException {

	 driver =brawsor.accBrawsor("https://www.facebook.com/");

obj.FBloginWithInvallidData(driver);
driver.manage().window().maximize();
	}
	@AfterMethod
	public void TakeSs() throws InterruptedException, IOException {
Thread.sleep(5000);
Screenshot.Sshot( driver);
driver.close();

}


	@Test(priority=-1,invocationCount=2)
	public void FbloginVallid () throws EncryptedDocumentException, IOException, InterruptedException {

	driver =brawsor.accBrawsor("https://www.facebook.com/");

		obj.FBloginWithVallidData(driver);
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	public void signUpclick() throws InterruptedException, IOException {
	 driver =brawsor.accBrawsor("https://www.facebook.com/");

		
		obj.SignUpClickTest(driver);
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	public void forgottpassClick() throws InterruptedException, IOException {
 driver =brawsor.accBrawsor("https://www.facebook.com/");

		
		obj.ForgottenPassTabTest();
		driver.manage().window().maximize();
		
	}
	@ AfterClass
	public void close() {
		WebDriver driver =brawsor.accBrawsor("https://www.facebook.com/");

		driver.close();
	}
	
}
	
		
	
	
	


