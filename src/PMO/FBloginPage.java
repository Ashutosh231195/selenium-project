package PMO;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import automation.brawsor;

public class FBloginPage {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	WebDriver driver=brawsor.accBrawsor("https://www.facebook.com/login/");

FBPMOtest obj= new FBPMOtest();
obj.FBloginWithVallidData(driver);
obj.OTP(driver);

}
}