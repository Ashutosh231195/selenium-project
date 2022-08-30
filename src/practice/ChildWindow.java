package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.brawsor;

public class ChildWindow {
	public static void main(String[] args) {
	WebDriver driver=	brawsor.accBrawsor("https://vctcpune.com/");
	WebElement page=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
	page.click();
	int iframe=driver.findElements(By.tagName("iframe")).size();
	System.out.println(iframe);
	Set<String> Z=driver.getWindowHandles();
	Iterator<String> A=Z.iterator();
	while (A.hasNext()) {
		String handl=A.next();
		driver.switchTo().window(handl);
		if (driver.getTitle().equals("Practice Page")) {
			WebElement radio=		driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			radio.click();
		}
	}
	}

}
