package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitAssert {
static WebDriver driver;
@Test	
public void login() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
String currentUrl = driver.getCurrentUrl();
boolean b = currentUrl.equals("https://www.facebook.com/");
Assert.assertTrue("Verify URL", b);
String title = driver.getTitle();
boolean c = title.contains("log in");
Assert.assertTrue("Verify Title", c);
WebElement txtUserName = driver.findElement(By.id("email"));
txtUserName.sendKeys("hello@gmail.com");
String username = txtUserName.getAttribute("value");
Assert.assertEquals("Verify UserName", "hello@gmail.com", username);
WebElement txtPassword = driver.findElement(By.id("pass"));
txtPassword.sendKeys("welcome123");
String password = txtPassword.getAttribute("value");
Assert.assertEquals("Verify Password", "welcome123", password);
driver.findElement(By.name("login")).click();
System.out.println("Done");

	}

}
