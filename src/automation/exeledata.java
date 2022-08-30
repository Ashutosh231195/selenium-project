package automation;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.grid.Main;

public class exeledata {
	public static String data(String sheatname , int row ,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream A= new FileInputStream("C:\\Users\\Aashuu\\OneDrive\\Documents\\Book1.xlsx");
	String data1=	WorkbookFactory.create(A).getSheet(sheatname).getRow(row).getCell(cell).getStringCellValue();
//	System.out.println(data1);

		return data1;
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String unm=exeledata.data("Sheet1",1, 0);
		//System.out.println(unm);
		String pass=exeledata.data("Sheet1",3, 1);
       // System.out.println(pass);
        WebDriver obj=    brawsor.accBrawsor("https://www.facebook.com/login/");
        WebElement name=obj.findElement(By.xpath("//input[@type='text']"));
        name.sendKeys(unm);
        WebElement password=obj.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys(pass);
    
	}
}
