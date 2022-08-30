package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.getCurrentUrl();
String url=driver.getCurrentUrl();
if (url=="https://www.flipkart.com/")
{
	System.out.println("ur sucssesfull");
}
else 
{
	System.out.println("not sucssesful");
}
System.out.println(url);
driver.getTitle();
String Title=driver.getTitle();
System.out.println("title of brower"+Title);
driver.getTitle().length();
int Len=driver.getTitle().length();
System.out.println("Lenth of title"+Len);
driver.manage().window();

 
driver.navigate().to("http:\\www.google.com\\");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
// driver.close();

	}

}
