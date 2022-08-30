package automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class iframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=brawsor.accBrawsor("https://vctcpune.com/");
		WebElement vctc=obj.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		vctc.click();
	Set<String>	P=obj.getWindowHandles();
Iterator<String> Q=P.iterator();
	while(Q.hasNext()) {
		String A=Q.next();
		System.out.println(A);
		obj.switchTo().window(A);
		obj.manage().window().maximize();
	String title=obj.getTitle();
	if (title.equals("Practice Page")) {
		obj.switchTo().frame("courses-iframe");
		String ifrmeTitle=obj.getTitle();
		System.out.println(ifrmeTitle);
	WebElement prctice=obj.findElement(By.xpath("//a[text()='Student Review']"));
		prctice.click();
	WebElement contact=	obj.findElement(By.xpath("//*[@id=\"ht-ctc-chat \"]/div"));
	contact.click();
	Set<String> Z=obj.getWindowHandles();
	Iterator<String> Y=Z.iterator();
	while(Y.hasNext()) {
		String X=Y.next();
	obj.switchTo().window(X);
	
	String wptitle=obj.getTitle();
	if(wptitle.equalsIgnoreCase("WhatsApp")) {
	
	WebElement V=obj.findElement(By.xpath("//div[@ class='_2wAIt']"));
	Thread.sleep(2000);
	
	V.click();
	
	obj.switchTo().parentFrame();
	String retun=obj.getTitle();
	System.out.println(retun);
	}
	
	}
	}
	
		
		
	}}}
