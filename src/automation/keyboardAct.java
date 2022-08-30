package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class keyboardAct {
	public static void main(String[] args) {
		WebDriver obj=brawsor.accBrawsor("https://mozilla.github.io/form-fill-examples/basic.html");
		WebElement form=obj.findElement(By.xpath("/html/body/form/label[1]/input"));
		form.sendKeys("ashutosh");
		Actions act=new Actions(obj);
act.sendKeys(Keys.TAB);
act.sendKeys("ardak");
act.sendKeys(Keys.TAB);
act.sendKeys("ap angar talghdjchdbkb bdb");
act.keyDown(Keys.CONTROL);
act.sendKeys("a");
act.keyUp(Keys.CONTROL);
act.keyDown(Keys.CONTROL);
act.sendKeys("c");
act.keyUp(Keys.CONTROL);
act.sendKeys(Keys.TAB);
act.keyDown(Keys.CONTROL);
act.sendKeys("v");
act.keyUp(Keys.CONTROL);
act.sendKeys(Keys.TAB);
act.sendKeys(Keys.TAB);
act.sendKeys(Keys.TAB);
act.sendKeys(Keys.TAB);
act.sendKeys(Keys.TAB);

act.sendKeys("8888981760");
act.sendKeys(Keys.TAB);
act.sendKeys(Keys.ENTER);

act.build().perform();
//WebElement sub=obj.findElement(By.xpath("/html/body/form/p/input"));

//act.click(sub);
//act.perform();



	
		
	}

}
