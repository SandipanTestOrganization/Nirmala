package nirmala.shoeshop.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	int maxSecond;
	static WebDriver driver;
	public static WebElement waitForPageUntilElementIsVisible(By locator, int maxSecond){
		return (new WebDriverWait(driver, maxSecond))
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
