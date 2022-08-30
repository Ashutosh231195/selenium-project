package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) {
		WebDriver obj=brawsor.accBrawsor("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement A=obj.findElement(By.xpath("//*[@id=\"menu-item-1923\"]/a"));
       //    ((JavascriptExecutor)obj).executeScript("window.scrollBy(100,200)");
       ((JavascriptExecutor)obj).executeScript("arguments[0].scrollIntoview(true)",A) ;
    
       
      
       
	}

}
