package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Screenshot {
	
	public static TakesScreenshot Sshot (WebDriver obj )throws InterruptedException, IOException {
		DateTimeFormatter aa= DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		LocalDateTime time=LocalDateTime.now(); 
	String currnttime=	aa.format(time);
		 String file="ashutosh";

	TakesScreenshot shot=((TakesScreenshot)obj);//  
	
File save=shot.getScreenshotAs(OutputType.FILE);	
	File path1=new File("C:\\Datta\\selenium sc\\"+file+""+currnttime+".PNG");
	FileHandler.copy(save, path1);
		return shot;
	}
	
public static void main(String[] args) throws InterruptedException, IOException {
	String url="https://www.flipkart.com/";
	WebDriver obj=brawsor.accBrawsor(url);


	
 // Scanner A = new Scanner(System.in);
 //  int c= A.nextInt();
    
   
   
	Screenshot.Sshot(obj);
	
}
}
