package tests;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
 
public class NewTest {
 
public WebDriver driver;
 
  @Test
  public void main() {

		 WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
		  email.sendKeys("guptaabhijeet1989@gmail.com");
		  
		  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Rakshak@261989");
		  driver.findElement(By.xpath("//input[@value='Log In']")).click();	 
		  driver.findElement(By.xpath("//div[text()='Account Settings']")).click();
		  driver.findElement(By.xpath("//span[@class='_54nh' and  text()='Log Out']")).click();
		
	  }
  
  @BeforeClass
  public void beforeClass() {
   ChromeOptions options = new ChromeOptions();
   options.addArguments("--disable-notifications");
   System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.11.0\\Drivers\\chromedriver.exe");
  driver =new ChromeDriver(options);
  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  driver.get("https://www.facebook.com");
  driver.manage().window().maximize();
  System.out.println("Successfully opened the website facebook.com");
   
  }
 
  @AfterClass
  public void afterClass() {
   driver.quit();
  }
 
}