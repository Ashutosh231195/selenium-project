package automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
//public static void main (String[] args) {
	public static WebDriver runchrome(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");
		WebDriver obj= new ChromeDriver();
		obj.get(url);
		return obj;
	}
	public static TakesScreenshot  doblbrws (String url1) throws InterruptedException, IOException{
		
		WebDriver B=practice.runchrome(url1);
WebElement flip=	B.findElement(By.xpath("//input[@ type='text']"));
flip.sendKeys("ashutosh");
Thread.sleep(3000);
TakesScreenshot x=Screenshot.Sshot(url1);
return x;

	}
	
public static TakesScreenshot nextbrwsr(String urlb) throws InterruptedException, IOException {
	Thread.sleep(2000);
WebDriver A=practice.runchrome(urlb);
WebElement c=A.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
//c.click();
// WebElement V=A.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
 c.sendKeys("AShu");
 Thread.sleep(2000);
 TakesScreenshot y=Screenshot.Sshot(urlb);
 return y;
 
	}
public static void main(String[] args) throws InterruptedException, IOException {
	String url1="https://www.flipkart.com/";
	 String urlb="https://www.amazon.com/";
	 practice.doblbrws(url1);
	 practice.nextbrwsr(urlb);
}	
}

