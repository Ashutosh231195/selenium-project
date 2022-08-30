package automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class childbrwser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=brawsor.accBrawsor("https://vctcpune.com/");
		WebElement meet =obj.findElement(By.xpath("//*[@id=\"top-menu\"]/li[4]/a[2]"));
		Thread.sleep(2000);

		meet.click();
	String A=	obj.getWindowHandle();
	System.out.println(A);
	
	Set <String> B=obj.getWindowHandles();
	
	Iterator<String> Z= B.iterator();

	//String C=Z.next();
	//String D=Z.next();
	//System.out.println(C);
//System.out.println(D);
while(Z.hasNext()) {
	 String i=Z.next();
	 System.out.println(i);
	 obj.switchTo().window(i);
	String currntTitle=obj.getTitle();
	if (currntTitle.equals("Practice Page")) {
	WebElement selct=	obj.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));
	selct.click(); 
	Select dopdwn=new Select(selct);
	dopdwn.selectByIndex(1);
		
	

	}
	
}
		
	}
	

}
