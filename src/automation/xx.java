package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xx {
public static void main(String[] args) {
	WebDriver A=new ChromeDriver();

	A.get("https://www.amazon.com/");
	WebElement B=A.findElement(By.xpath("//*[@id=\"menu-item-1923\"]/a"));

	((JavascriptExecutor)A).executeScript("window.scrollBy[100,200]");
}
}
