package nirmala.shoeshop.smoketest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample {
	
	WebDriver driver;
	@Before
	public void Init(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();		
		
	}
	@After
	public void CleanUp(){
		//driver.close();
	}
	@Test
	public void login_page_test(){
		driver.navigate().to("http://182.72.246.194/prestashop_1.6.1.1/prestashop/5-high-heels");
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input")).sendKeys("sandipan@proconstructor.com");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/input")).sendKeys("password12!@");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button")).click();
	}

}
