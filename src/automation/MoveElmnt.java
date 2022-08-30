package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MoveElmnt {
	public static void main(String[] args) {
		WebDriver obj=brawsor.accBrawsor("https://www.amazon.com/");
		WebElement move=obj.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		
		Actions A=new Actions(obj);
		obj.manage().window().maximize();
		A.moveToElement(move);
		A.perform();
	
		//WebElement move1=obj.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
move.click();

		Select down=new Select(move);
down.selectByIndex(5);
 

		
	}

}
