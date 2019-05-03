package com.Naukri.Maven_Naukri;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Cv_Uplod {
@Test
public static void naukri() throws InterruptedException, FindFailed {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='Login']")).click();
	driver.findElement(By.name("email")).sendKeys("nayakchiranjeeb@outlook.com");
	driver.findElement(By.name("PASSWORD")).sendKeys("9938710433");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	Thread.sleep(50000);
	//WebDriverWait wait = new WebDriverWait(driver, 50);
	//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'My Naukri')]")));
	WebElement we= driver.findElement(By.xpath("//div[contains(text(),'My Naukri')]"));
	Actions act = new Actions(driver);
	act.moveToElement(we).build().perform();
	driver.findElement(By.linkText("Edit Profile")).click();
	 Screen sc=new Screen();
	 Pattern att= new Pattern("C:\\Users\\Virat\\Pictures\\att.png");  
     Pattern fn = new Pattern("C:\\Users\\Virat\\Pictures\\fn.png");
     Pattern op = new Pattern("C:\\Users\\Virat\\Pictures\\op.png");
     sc.click(att);
     String s="C:\\Users\\Virat\\Desktop\\Chiranjeeb 3+ year.docx";
     sc.type(fn, s);
     sc.click(op);


}
  }
