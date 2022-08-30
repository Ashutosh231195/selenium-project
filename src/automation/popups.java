package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class popups {
public static void main(String[] args) throws InterruptedException {
	WebDriver obj= brawsor.accBrawsor("https://vctcpune.com/selenium/practice.html#serviceid");
	WebElement A= obj.findElement(By.xpath("//*[@id=\"confirmbtn\"]"));
	 A.click();
	Alert pop=obj.switchTo().alert();
	Thread.sleep(2000);
	 pop.accept();
	 
	 
}
}
