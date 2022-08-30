package TestNG;


import java.io.IOException;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class ZerodhaFundAddModule {
	WebDriver driver;
	ZerodhaPOM obj1= new ZerodhaPOM(driver,driver.getCurrentUrl());
	@BeforeMethod
	public void FundDeposit() throws InterruptedException, IOException {
		ZerodhaTest obj= new ZerodhaTest();
		obj.CheckFundsClickAddModule();
		Set<String >X=driver.getWindowHandles();
		Iterator <String> A=X.iterator();
		String handle=A.next();
		driver.switchTo().window(handle);
		while(A.hasNext()){
		String pageTitle=	driver.getTitle();
			if (pageTitle.equals("Zerodha")) {
				Thread.sleep(2000);
				ZerodhaPOM obj1= new ZerodhaPOM(driver,driver.getCurrentUrl());
       String curnttitle= driver.getTitle();
       System.out.println(curnttitle);
				Thread.sleep(4000);

				obj1.FundDeposite("10000");
			
		}
	}
	}
}

