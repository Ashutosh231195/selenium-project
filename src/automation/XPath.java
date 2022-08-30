package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XPath {
	public static void main(String[] args) {
	WebDriver obj= brawsor.accBrawsor("");
	obj.manage().window().maximize();
	//WebElement log= obj.findElement(By.xpath("//input[@name='email']"));
	//log.sendKeys("ashu");
// WebElement email =obj.findElement(By.xpath("//html//body//a//a"));
// email.click();
WebElement search= obj.findElement(By.xpath("/html/body//form//input[1]"));
search.sendKeys("ashutosh");
 
	//WebElement email =obj.findElement(By.xpath("//input[@id=\"email\"]")); 
	//email.sendKeys("asmita");  
	}

}
