package PMO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBloginTest {
	@FindBy(xpath="//*[@id=\"email\"]") private WebElement email;
	@FindBy(xpath="//*[@id=\"pass\"]") private WebElement pass1;
	@FindBy(xpath="//button[@value='1']") private WebElement login;
	@FindBy(xpath="//*[@id=\"login_link\"]/a[1]") private WebElement forrgtPss;
	@FindBy(xpath="//button [@value='1']") private WebElement SignUp;
	@FindBy(xpath="(//span[@class=\"a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5\"])[17]") private WebElement ashuprofile;
	@FindBy(xpath="//*[@id=\"approvals_code\"]") private WebElement OTP;
	@FindBy(xpath="//*[@id=\"checkpointSubmitButton\"]") private WebElement confirmOTP;
	@FindBy(xpath="//i[@class=\"hu5pjgll lzf7d6o1\"])[1]") private WebElement Menu;

	//i[@class="hu5pjgll lzf7d6o1"])[1]	
	
public  FBloginTest(WebDriver obj) {
 PageFactory.initElements(obj ,this);
}
	public void EnterEmailIdTest(String Id) {
		email.sendKeys(Id);
	}
	public void EnterPasswordtest(String code) {
		pass1.sendKeys(code);
	}
	public void LoginClickTest() {
		login.click();
	}
	public void ForgtpassClick() {
		forrgtPss.click();
	}
	public void SignupClickTest() {
		SignUp.click();
	}
	public void PROFILECheck() {
		ashuprofile.click();
	}
	public void checkOTP(int OTP2) {
		OTP.sendKeys("OTP2");
	}
	public void ConfirmOTPClick() {
		confirmOTP.click();
	}
	public void clickMenu() {
	Menu.click();
	}
}

