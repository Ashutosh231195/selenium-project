package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locater {
	public static void main(String[] args) {
	WebDriver obj=brawsor.accBrawsor("");// this user defined method takn frm brwsr class whs rtn typ is webdriver
		WebElement email= obj.findElement(By.name("email"));
	email.sendKeys("");
	WebElement pass=obj.findElement(By.name("pass"));
		pass.sendKeys("Raviraj");
		WebElement log=obj.findElement(By.tagName("button"));
		log.click();
		//WebElement password= obj.findElement(By.className("_56be"));
		//password.sendKeys("ashuuu");
		
	}

}
