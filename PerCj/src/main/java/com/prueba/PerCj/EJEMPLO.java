package com.prueba.PerCj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EJEMPLO  {
	WebDriver driver;
	String url="";   
	JavascriptExecutor js;
    

	public EJEMPLO(String url) {
	this.url=url;
	driverSet();
}

	public void driverSet() {
	System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	

}

public void login() throws Exception{
	
	  js = (JavascriptExecutor) driver;
	
	   driver.manage().window().maximize();
	   
	   driver.get(url);
       
       driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("jessicaandrearojasdiaz@gmail.com");
       
       driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("311315294");
       
       driver.findElement(By.xpath("//*[@id=\"btnLog\"]")).click();
    		  
       Thread.sleep(2000);
	   
	   //Thread.sleep(5000);
	   
}
public void medicina_prepagada()throws AWTException, InterruptedException {
    File file = new File("chromedriver.exe");
    File file_img = new File("img.jpg");
    System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());	
    	/*WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://172.168.10.46:81/DashBoard");
    	driver.findElement(By.id("Email")).sendKeys("jessicaandrearojasdiaz@gmail.com");
    	driver.findElement(By.id("Password")).sendKeys("311315294");
    	driver.findElement(By.id("btnLog")).click();*/
    	Robot robot = new Robot();
    	robot.keyPress(KeyEvent.VK_DOWN);
    	robot.keyRelease(KeyEvent.VK_DOWN);
    	robot.keyPress(KeyEvent.VK_DOWN);
    	robot.keyRelease(KeyEvent.VK_DOWN);
    	robot.keyPress(KeyEvent.VK_DOWN);
    	robot.keyRelease(KeyEvent.VK_DOWN);
    	robot.keyPress(KeyEvent.VK_DOWN);
    	robot.keyRelease(KeyEvent.VK_DOWN);
    	robot.keyPress(KeyEvent.VK_DOWN);
    	robot.keyRelease(KeyEvent.VK_DOWN);
    	
    	//driver.switchTo().frame(driver.findElement(By.xpath("//li[11]")));
    	//driver.findElement(By.linkText("Help Care")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Desprendible Nómina'])[1]/following::a[1]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//ul[@id='side-menu']/li[11]/ul/li/a/span")).click();
    	driver.findElement(By.id("Vincularse")).click();
    	Thread.sleep(2000);
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	robot.keyPress(KeyEvent.VK_DOWN);
    	robot.keyRelease(KeyEvent.VK_DOWN);
    	Thread.sleep(2000);
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	robot.keyPress(KeyEvent.VK_DOWN);
    	robot.keyRelease(KeyEvent.VK_DOWN);
    	
    	Thread.sleep(2000);
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	robot.keyPress(KeyEvent.VK_DOWN);
    	robot.keyRelease(KeyEvent.VK_DOWN);
    	
    	Thread.sleep(2000);
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	/*Select dropdown = new Select(driver.findElement(By.id("PorcentajeCub")));
    	dropdown.selectByIndex(1);*/
    	
    	Thread.sleep(2000);
    	robot.mouseMove(300, 340);
    	robot.mousePress(InputEvent.BUTTON1_MASK);
    	robot.keyPress(KeyEvent.VK_DOWN);
    	robot.keyRelease(KeyEvent.VK_DOWN);
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	
    	Thread.sleep(2000);
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	robot.keyPress(KeyEvent.VK_DOWN);
    	robot.keyRelease(KeyEvent.VK_DOWN);
    	Thread.sleep(2000);
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	robot.keyPress(KeyEvent.VK_DOWN);
    	robot.keyRelease(KeyEvent.VK_DOWN);
    	Thread.sleep(2000);
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	robot.keyPress(KeyEvent.VK_DOWN);
    	robot.keyRelease(KeyEvent.VK_DOWN);
    	Thread.sleep(2000);
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	robot.keyPress(KeyEvent.VK_DOWN);
    	robot.keyRelease(KeyEvent.VK_DOWN);
    	
    	Thread.sleep(3000);
    	
    	/*((JavascriptExecutor)driver).executeScript ("driver.getElementById('AppliesBeneficiary').removeAttribute('readonly',0);");
    	WebElement input = driver.findElement(By.xpath("//div[@id='validator']/div/div/div[6]/div/div[2]/input"));
    	new Actions(driver).moveToElement(input).sendKeys(Keys.ENTER); */
    	
    	
    	//driver.findElement(By.xpath("id(\"AppliesBeneficiary\")[count(. | //*[@onclick = 'functionChange()' and @name = 'AppliesBeneficiary']) = count(//*[@onclick = 'functionChange()' and @name = 'AppliesBeneficiary'])]")).click();

    		
    	
    	//driver.findElement(By.cssSelector("input[type=\"radio\"], input[type=\"checkbox\"]")).click();
    	
    	robot.mouseMove(237, 442);
    	Thread.sleep(2000);
    	robot.mousePress(InputEvent.BUTTON1_MASK);
    	robot.mouseRelease(InputEvent.BUTTON1_MASK);
    	
    	Thread.sleep(2000);
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	
    	
    	StringSelection selection = new StringSelection(file_img.getAbsolutePath());
    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
    	robot.setAutoDelay(1000);
    	robot.keyPress(KeyEvent.VK_CONTROL);
    	robot.keyPress(KeyEvent.VK_V);
    	robot.keyRelease(KeyEvent.VK_CONTROL);
    	robot.keyRelease(KeyEvent.VK_V);
    	robot.setAutoDelay(1000);
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	
    	Thread.sleep(2000);
    	//driver.findElement(By.xpath("//button[@id='save']")).click();
    	
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	Thread.sleep(2000);
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	Thread.sleep(2000);
    	//driver.findElement(By.xpath("//body[@id='bodyGeneral']/div[3]/div/div/a/span")).click();
    	
    	robot.mouseMove(1347, 128);
    	Thread.sleep(2000);
    	robot.mousePress(InputEvent.BUTTON1_MASK);
    	robot.mouseRelease(InputEvent.BUTTON1_MASK);
    	
    	//Caso Editar
    	
    	
    	
    	driver.findElement(By.xpath("//button[@id='Edit']/i")).click();
    	Thread.sleep(2000);
    	/*robot.mouseMove(840, 400);
    	Thread.sleep(2000);
    	robot.mousePress(InputEvent.BUTTON1_MASK);
    	robot.mouseRelease(InputEvent.BUTTON1_MASK);*/
    	driver.switchTo().frame(0);
    	driver.findElement(By.id("AppliesBeneficiary")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("save")).click();
    	//Assert.assertEquals("Operacion exitosa", driver.getTitle());
    	Thread.sleep(2000);
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	/*Thread.sleep(2000);
    	
    	driver.findElement(By.cssSelector(".k-i-closes")).click();*/
    	
    	robot.mouseMove(1347, 128);
    	Thread.sleep(2000);
    	robot.mousePress(InputEvent.BUTTON1_MASK);
    	robot.mouseRelease(InputEvent.BUTTON1_MASK);
    	
    	
    	//Caso Desvincular
    	driver.findElement(By.xpath("//button[@id='Delete']/i")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    	
    	
    	//Volver al inicio
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//ul[@id='side-menu']/li[3]/a/span")).click();
    	
    	Thread.sleep(15000);
    
    	
    }

	   public void talento_humano() throws Exception, AWTException, InterruptedException{
		   
		   driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[7]/a/span[1]")).click();
           
			  
		   js.executeScript("window.scrollBy(0,1000)");
		  
		   Thread.sleep(2000);
	       
		   driver.findElement(By.xpath("//*[(text() = 'Colaboradores' or . = 'Colaboradores')]")).click();
		   
		  js.executeScript("window.scrollBy(0,350)");
		  
		  Thread.sleep(60000);
		   
	      driver.findElement(By.xpath("//*[(text() = 'Nombre' or . = 'Nombre')]")).click();
	      
	      Thread.sleep(2000);
	      
	      WebElement Element = driver.findElement(By.xpath("//*[@id=\"Grid\"]/div[2]/table/tbody/tr[3]/td[20]/div/i"));
	      
	      Thread.sleep(2000);
	      
	      js.executeScript("arguments[0].scrollIntoView();",Element );
	      
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("//*[@id=\"Grid\"]/div[2]/table/tbody/tr[3]/td[20]/div/i")).click();
	      
	      //Thread.sleep(40000);
	      
	      Robot robot = new Robot();
	      Thread.sleep(20000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(2000);
	      robot.keyPress(KeyEvent.VK_DOWN);
	      robot.keyRelease(KeyEvent.VK_DOWN);
	      Thread.sleep(2000);
	      robot.keyPress(KeyEvent.VK_DOWN);
	      robot.keyRelease(KeyEvent.VK_DOWN);
	      Thread.sleep(2000);
	      robot.keyPress(KeyEvent.VK_DOWN);
	      robot.keyRelease(KeyEvent.VK_DOWN);
	      Thread.sleep(2000);
	      robot.keyPress(KeyEvent.VK_DOWN);
	      robot.keyRelease(KeyEvent.VK_DOWN);
	      Thread.sleep(2000);
	      robot.keyPress(KeyEvent.VK_DOWN);
	      robot.keyRelease(KeyEvent.VK_DOWN);
	      Thread.sleep(2000);
	   
	     //Siguiente edicion
	     
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(2000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(2000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(2000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(2000);
	      
	      //Edicion de caja de texto
	      
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);

	      //
	      
	      robot.keyPress(KeyEvent.VK_1);
	      robot.keyRelease(KeyEvent.VK_1);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_1);
	      robot.keyRelease(KeyEvent.VK_1);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_1);
	      robot.keyRelease(KeyEvent.VK_1);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_1);
	      robot.keyRelease(KeyEvent.VK_1);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_1);
	      robot.keyRelease(KeyEvent.VK_1);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_1);
	      robot.keyRelease(KeyEvent.VK_1);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_1);
	      robot.keyRelease(KeyEvent.VK_1);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_1);
	      robot.keyRelease(KeyEvent.VK_1);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_1);
	      robot.keyRelease(KeyEvent.VK_1);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_1);
	      robot.keyRelease(KeyEvent.VK_1);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_1);
	      robot.keyRelease(KeyEvent.VK_1);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_1);
	      robot.keyRelease(KeyEvent.VK_1);
	      Thread.sleep(500);
	      
	      //
	      
	      
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      
	      
	     //
	   
	      robot.keyPress(KeyEvent.VK_MINUS);
	      robot.keyRelease(KeyEvent.VK_MINUS);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_1);
	      robot.keyRelease(KeyEvent.VK_1);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_0);
	      robot.keyRelease(KeyEvent.VK_0);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_0);
	      robot.keyRelease(KeyEvent.VK_0);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_0);
	      robot.keyRelease(KeyEvent.VK_0);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_0);
	      robot.keyRelease(KeyEvent.VK_0);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_0);
	      robot.keyRelease(KeyEvent.VK_0);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_0);
	      robot.keyRelease(KeyEvent.VK_0);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_ENTER);
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      Thread.sleep(20000);
	      
	      //
	      
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_DOWN);
	      robot.keyRelease(KeyEvent.VK_DOWN);
	      Thread.sleep(2000);
	      
	      //
	      
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_DOWN);
	      robot.keyRelease(KeyEvent.VK_DOWN);
	      Thread.sleep(2000);
	      robot.keyPress(KeyEvent.VK_DOWN);
	      robot.keyRelease(KeyEvent.VK_DOWN);
	      Thread.sleep(2000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_UP);
	      robot.keyRelease(KeyEvent.VK_UP);
	      Thread.sleep(2000);
	      robot.keyPress(KeyEvent.VK_UP);
	      robot.keyRelease(KeyEvent.VK_UP);
	      Thread.sleep(2000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
		  robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_ENTER);
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      Thread.sleep(20000);
	      
	      //
	      
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(5000);
	      
	      //
	      
	      robot.keyPress(KeyEvent.VK_DOWN);
	      robot.keyRelease(KeyEvent.VK_DOWN);
	      Thread.sleep(2000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_DELETE);
	      robot.keyRelease(KeyEvent.VK_DELETE);
	      Thread.sleep(500);
	   
	      //
	      
	      
	      robot.keyPress(KeyEvent.VK_MINUS);
	      robot.keyRelease(KeyEvent.VK_MINUS);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_5);
	      robot.keyRelease(KeyEvent.VK_5);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_5);
	      robot.keyRelease(KeyEvent.VK_5);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_5);
	      robot.keyRelease(KeyEvent.VK_5);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_5);
	      robot.keyRelease(KeyEvent.VK_5);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_5);
	      robot.keyRelease(KeyEvent.VK_5);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_ENTER);
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      Thread.sleep(20000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      Thread.sleep(500);
	      robot.keyPress(KeyEvent.VK_TAB);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      robot.keyPress(KeyEvent.VK_ENTER);
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      Thread.sleep(20000);
	      
	      //driver.quit();
	      
}
	  
	public static void main(String[] args) throws Exception{
	EJEMPLO demo=new EJEMPLO("http://172.168.10.46:81/Account/Login");
    demo.login();
    demo.medicina_prepagada();
    demo.talento_humano();
    
	}
}

//js.executeScript("window.scrollBy(0,380)");

//js.executeScript("arguments[0].scrollIntoView();",Element );

//Thread.sleep(3000);	  

//driver.findElement(By.xpath("//*[@id=\"2c002ccb-2cdb-4500-a090-a52be0137931\"]/a[2]")).click();

//System.out.println("Resultado exitoso");



//s demo.menu();