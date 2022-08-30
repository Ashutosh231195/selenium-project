package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class mouseAct {
	public static void main(String[] args) {
	WebDriver obj=	brawsor.accBrawsor("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement Rclick=obj.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act= new Actions(obj);
		act.contextClick(Rclick);
		act.perform();
		WebElement Dclick=obj.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
act.doubleClick(Dclick);
	act.perform();	
		
		
		
		
	}

}
