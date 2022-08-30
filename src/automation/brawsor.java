package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class brawsor  {
	public static WebDriver accBrawsor(String url) {
		
		System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	 driver.get(url);
	 driver.getTitle();
	 driver.navigate().to(url);
	 return driver;
	 
	}
public static void main(String[] args) {
	String url="https://www.flipkart.com/";
	brawsor.accBrawsor(url);
}
}
