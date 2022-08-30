package TestNG;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.Screenshot;
import automation.brawsor;


public class ZerodhaTest {
	static WebDriver driver=brawsor.accBrawsor("https://kite.zerodha.com/");
	ZerodhaPOM obj;
	@BeforeMethod
	public static ZerodhaPOM ZerodhaVallidLogIn() throws InterruptedException{
			ZerodhaPOM obj= new ZerodhaPOM(driver,driver.getCurrentUrl());
			 driver.manage().window().maximize();

		obj.KiteIdEnter("OKP3355");
		obj.KiteEnterPass("ZAQ1234567");
		obj.KiteLodinclick();
		Thread.sleep(2000);

		obj.EnterKitePIN("234567");
		Thread.sleep(1000);
		obj.clickonContinue();
		PageFactory.initElements(driver, driver.getCurrentUrl());
		Thread.sleep(3000);
return obj;
	}
	
	@Test(priority=1)
	public void CheckFundsClickAddModule() throws InterruptedException, IOException {
		Thread.sleep(1000);
		ZerodhaPOM obj= ZerodhaTest.ZerodhaVallidLogIn( );
	PageFactory.initElements(driver, driver.getCurrentUrl());

obj.ClickOnFUNDS();
obj.ClickOnFUNDS();
obj.ClickOnFUNDSADD();
Thread.sleep(2000);

Screenshot.Sshot(driver );

		}
	@Test(priority=2)
	public void FundWithdrawClickCheck() throws InterruptedException, IOException {
		Thread.sleep(1000);
		ZerodhaPOM obj= ZerodhaTest.ZerodhaVallidLogIn( );
	PageFactory.initElements(driver, driver.getCurrentUrl());
	Thread.sleep(2100);

obj.FundWithdrawClick();
Thread.sleep(2000);

Screenshot.Sshot(driver );
	}


}


