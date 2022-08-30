package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class practice {
	public static void main(String[] args) throws IOException {  // throws intruption exscption
		System.setProperty("webdriver.chrome.driver", "C:\\\\automation\\\\chromedriver.exe");
		WebDriver obj= new ChromeDriver();
	obj.navigate().to("https://www.amazon.com/");
TakesScreenshot shot=	(TakesScreenshot)obj;
	File save=shot.getScreenshotAs(OutputType.FILE);
	File path= new File("C:\\Datta\\selenium sc.PNG");
	FileHandler.copy(save, path);
	}

}
