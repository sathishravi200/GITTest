package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitOne {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver(); 
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

	}
	
	@AfterClass
	public static void afterClass() {
driver.quit();
	}
	@Before
	public void beforeMethod() {
Date d  = new Date();
System.out.println(d);
	
	}
	@After
	public void afterMethod() {
Date d  = new Date();
System.out.println(d);
	}
	@Test
public void login() {
driver.findElement(By.id("email")).sendKeys("greens123@gmail.com");
driver.findElement(By.id("pass")).sendKeys("periyavar@123");
driver.findElement(By.name("login")).click();
}	

}
