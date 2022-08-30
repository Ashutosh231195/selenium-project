package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDawon {
public static void main(String[] args) {
	WebDriver obj=brawsor.accBrawsor("https://chercher.tech/practice/dropdowns");
WebElement sel=	obj.findElement(By.xpath("//select[@ id=\"order-changed\"]"));
	Select tab=new Select(sel);
	//tab.selectByIndex(2);
	//tab.selectByValue("Google");
	tab.selectByVisibleText("Bing");
	List<WebElement> A=tab.getOptions();
	int count =A.size();
	System.out.println(count);
}

}


