package PMO;

import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import automation.brawsor;
import automation.exeledata;

public class FBPMOtest {

	Scanner S=new Scanner(System.in);
	
	public void FBloginWithVallidData(WebDriver driver) throws EncryptedDocumentException, IOException, InterruptedException {
		//WebDriver driver=brawsor.accBrawsor("https://www.facebook.com/login/");
		FBloginTest A= new FBloginTest(driver);
		//String EData=exeledata.data("Sheet1", 1, 0);

		A.EnterEmailIdTest("8888981760");
		String EData1=exeledata.data("Sheet1", 3, 1);

		A.EnterPasswordtest(EData1);
		A.LoginClickTest();
		Thread.sleep(2000);
		
		
			
			//A.PROFILECheck();
		}
	
		public void OTP(WebDriver driver) throws InterruptedException {
			FBloginTest A= new FBloginTest(driver);
			PageFactory.initElements(driver,driver.getCurrentUrl());
	
				Thread.sleep(2000);
				Thread.sleep(10000);
			
		
		}
		public void confirmotp(WebDriver driver) throws InterruptedException {
			FBloginTest A= new FBloginTest(driver);
			int OTP=S.nextInt();

		 A.checkOTP(OTP);
		Thread.sleep(2000);

	  A.ConfirmOTPClick();
		Thread.sleep(2000);
		}
public void testMenu(WebDriver driver) {
	FBloginTest A= new FBloginTest(driver);
	PageFactory.initElements(driver,driver.getCurrentUrl());

	A.clickMenu();

}
	public void FBloginWithInvallidData(WebDriver driver) throws EncryptedDocumentException, IOException {
		//WebDriver driver=brawsor.accBrawsor("https://www.facebook.com/login/");

		FBloginTest A= new FBloginTest(driver);
		String EData=exeledata.data("Sheet1", 1, 0);
		A.EnterEmailIdTest(EData);
		A.LoginClickTest();

	}
	public void ForgottenPassTabTest() {
		WebDriver driver=brawsor.accBrawsor("https://www.facebook.com/login/");
		FBloginTest A= new FBloginTest(driver);
		A.ForgtpassClick();
	}
	public void SignUpClickTest(WebDriver driver) {
	//	WebDriver driver=brawsor.accBrawsor("https://www.facebook.com/login/");
		FBloginTest A= new FBloginTest(driver);
		A.SignupClickTest();
	}
	 
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver=brawsor.accBrawsor("https://www.facebook.com/login/");

		FBPMOtest obj=new FBPMOtest();
		obj.FBloginWithVallidData(driver);
		//obj.FBloginWithInvallidData(driver);
		//obj.ForgottenPassTabTest();
		//obj.SignUpClickTest();
		obj.OTP(driver);
		obj.confirmotp(driver);
	}

}
