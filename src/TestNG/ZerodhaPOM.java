package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.brawsor;

public class ZerodhaPOM {
	@FindBy (xpath="//*[@id=\"userid\"]") private WebElement KiteID;
	@FindBy (xpath="//input[@type='password']") private WebElement KitePass;
	@FindBy (xpath="//button[@type='submit']") private WebElement KiteLogin ;
	@FindBy (xpath="//a[@class='text-light forgot-link']") private WebElement KiteForgottPass;
	@FindBy (xpath="//button[@type='submit']") private WebElement KiteCONTINUE ;
	@FindBy (xpath="//input[@type='password']") private WebElement KitePIN  ;
	@FindBy (xpath="//span[text()='Funds']") private WebElement FUNDS  ;
	@FindBy (xpath="//button[@class='button-green']") private WebElement FUNDsADD  ;
	@FindBy (xpath="	//*[@id=\"addfunds_amount\"]") private WebElement FundDeposite  ;
	@FindBy (xpath="(//a[@ class='button button-blue'])[1]") private WebElement FundWithdraw  ;

	
	//(//a[@ class='button button-blue'])[1]
	public ZerodhaPOM(WebDriver driver,String url) {
	 driver=	brawsor.accBrawsor(url);
		PageFactory.initElements(driver, this);
	}
	public void KiteIdEnter(String ID) {
		KiteID.sendKeys(ID);
	}
	public void KiteEnterPass(String pass) {
		KitePass.sendKeys(pass);
		}
	public void KiteLodinclick() {
		KiteLogin.click();
	}
	public void KitePassForgotten () {
		KiteForgottPass.click();
	}
	public void clickonContinue() {
		KiteCONTINUE.click();
	}
	public void EnterKitePIN(String Pin) {
		KitePIN.sendKeys(Pin);
	}
	public void ClickOnFUNDS() {
FUNDS.click();
	}
	public void ClickOnFUNDSADD() {
		FUNDsADD.click();
			}
	public void FundDeposite(String Amount) {
		FundDeposite.sendKeys(Amount);
	}
	public void Fund(String Amount) {
		FundDeposite.sendKeys(Amount);
	}
	public void FundWithdrawClick() {
		FundWithdraw.click();
	}
}
