package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mock {
	public static WebDriver runBrwser(String url) {
		WebDriver obj= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");
		
		obj.get(url);
		return obj;
		
	}
	public static void main(String[] args) {
		String url="http://www.google.com";
		mock.runBrwser(url);
	}
	}


