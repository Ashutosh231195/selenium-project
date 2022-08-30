package PMO;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.brawsor;

public class BrokenLink {
	public static void main(String[] args) {
	WebDriver driver=brawsor.accBrawsor("https://www.zlti.com/");
	List <WebElement> A=driver.findElements(By.tagName("a"));
	for (int i=0; i<=A.size();i++) {
		WebElement tag=A.get(i);
		String url=tag.getAttribute("href");
	if(url==null || url.isEmpty()) {
		System.out.println("Url is not working or empty");
		continue;
	}
	try {
		HttpURLConnection huc=(HttpURLConnection)(new URL(url)).openConnection();
		System.out.println(huc.getResponseCode());
	if( huc.getResponseCode()>400) {
		System.out.println("its BrokenLink:"+url);
	}
	else {
		System.out.println("Link is Vallid :"+ url);
	}
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}
	
	
}

}
