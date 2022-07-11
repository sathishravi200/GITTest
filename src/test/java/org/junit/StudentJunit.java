package org.junit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StudentJunit {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public static void afterClass() {
		driver.quit();
	}
	@Before
	public void before() {
		Date d= new Date();
		System.out.println(d);
		
	}
	@After 
	public void after() {
		Date d=new Date();
		System.out.println(d);
	}
	@Test
	public void test() {
		driver.findElement(By.name("email")).sendKeys("Greens123@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("12478545");
		driver.findElement(By.name("login")).click();
	}
}