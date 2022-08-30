package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver obj=	brawsor.accBrawsor("https://www.globalsqa.com/demo-site/draganddrop/");
	WebElement frame=obj.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe"));
	
	obj.switchTo().frame(frame);
	List< WebElement> image=obj.findElements(By.xpath("//*[@id=\"gallery\"]/li"));
	int S=image.size();
	System.out.println(S);
	WebElement trash=obj.findElement(By.xpath("//*[@id=\"trash\"]"));
	
 Actions act=new Actions(obj);
 int i=S;
 for(i=0;i<S;i++) {
	WebElement move= image.get(i);
 act.dragAndDrop(move, trash);
	 act.perform();
	 Thread.sleep(2000);
 } 
List <WebElement> B= obj.findElements(By.xpath("//a[text()='Recycle image']"));
int S1=B.size();
for(int j=S1-1;j>=0;j--) {
	WebElement restore=B.get(j);
	act.click(restore);
	act.perform();
	 Thread.sleep(2000);
}
	
	
	}
	
	
	

}
