package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;

//import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class dimemtions {
	public static void main(String[] args) throws IOException {
		String A="https:www.amazon.com/";
		WebDriver obj=brawsor.accBrawsor(A);
		Dimension a= new Dimension(1280,720);
		System.out.println(a);
		obj.manage().window().setSize(a);;

	 //    Point b= new Point (50,100);
		//obj.manage().window().setPosition(b);
		//obj.findElement(By.)
		TakesScreenshot shot= ((TakesScreenshot)obj);
		 File source = shot.getScreenshotAs(OutputType.FILE);
		File path = new File("C/dshhhd.png"); 
		FileHandler.copy(source, path);
		
		
	WebElement sel =	obj.findElement(By.xpath("//button[@ class=\"_2KpZ6l _2doB4z\"]"));
	sel.click();
	 WebElement D=obj.findElement(By.xpath("//a[@class=\"_2XoPFN\"]"));
	 
 String x=D.getText(); 
 System.out.println(x);
//boolean A=	sel.isSelected();
//System.out.println(A);
//boolean B=sel.isDisplayed();
//System.out.println(B);

		}

	}


