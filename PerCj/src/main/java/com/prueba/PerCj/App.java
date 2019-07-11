package com.prueba.PerCj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
    	
        WebDriver driver=new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        
        
        driver.get("http://172.168.10.46:81/Collaborator/Collaborator");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("jessicaandrearojasdiaz@gmail.com");
        
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("311315294");
        
        driver.findElement(By.xpath("//*[@id=\"btnLog\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[7]/a/span[1]")).click();
        
        js.executeScript("window.scrollBy(0,1000)");
        
        driver.findElement(By.xpath("//*[@id=\\\\\\\"side-menu\\\\\\\"]/li[7]/ul[4]/li/a/span")).click();
        
        
        
      
        
        
    }
}
