package nirmala.shoeshop.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import nirmala.shoeshop.browser.Browser;
import nirmala.shoeshop.menu.MenuBar.SubMenu;

public class MenuSelector {
	
	// Elements xPath
	static String women_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a";
	static String women_heels_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/a";
	static String women_heels_highheels_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[1]/a";
	static String women_heels_lowheels_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[2]/a";
	static String women_heels_pointedheels_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[3]/a";
	static String women_heels_wedgeheels_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[4]/a";
	static String women_sandals_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/a";
	static String women_sandals_kitten_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[2]/a";
	static String women_sandals_regular_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[1]/a";
	static String women_shoes_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[3]/a";
	static String women_shoes_casualshoes_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[3]/ul/li[1]/a";
	static String women_shoes_ethinicshoes_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[3]/ul/li[4]/a";
	static String women_shoes_formalshoes_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[3]/ul/li[3]/a";
	static String women_shoes_sportshoes_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[3]/ul/li[2]/a";
	static String men_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a";
	static String men_shoes_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[1]/a";
	static String men_shoes_causualshoes_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[1]/ul/li[1]/a";
	static String men_shoes_formalshoes_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[1]/ul/li[2]/a";
	static String men_shoes_semiformals_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[1]/ul/li[3]/a";
	static String men_sneakers_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[2]/a";
	static String men_sneakers_regulars_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[2]/ul/li/a";
	static String men_atheletics_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/a";
	static String men_atheletics_indoorsportshoes_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/ul/li[3]/a";
	static String men_atheletics_outdoorandhikingshoes_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/ul/li[1]/a";
	static String men_atheletics_runningshoes_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/ul/li[2]/a";
	static String men_atheletics_tranningshoes_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/ul/li[4]/a";
	static String men_loafers_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[4]/a"; 
	static String kids_xPath ="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a";
	static String kids_boys_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/a";
	static String kids_boys_boots_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[1]/a";
	static String kids_boys_casualshoe_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[2]/a";
	static String kids_boys_flipflops_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[3]/a";
	static String kids_boys_sandels_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[4]/a";
	static String kids_boys_schoolshoes_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[5]/a";
	static String kids_boys_sportshoes_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[6]/a";
	static String kids_girls_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[2]/a";
	static String kids_girls_clogs_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[2]/ul/li[2]/a";
	static String kids_girls_flatandbellies_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[2]/ul/li[3]/a";
	static String kids_girls_sandels_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[2]/ul/li[1]/a";
	static String kids_girls_sportsandcasualshoes_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[2]/ul/li[4]/a";
	static String kids_kid_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[3]/a";
	static int maxSecond = 5000;
	
	public static  WebElement waitForPageUntilElementIsVisible(By locator, int maxSecond){
		return (new WebDriverWait(Browser.Driver(), maxSecond))
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void Select(MenuBar topMenuItem, SubMenu subMenuItem) {
		switch (topMenuItem) {
		case WOMEN:
			Actions womenAction = new Actions(Browser.Driver()).moveToElement(waitForPageUntilElementIsVisible(By.xpath(women_xPath), maxSecond));
			womenAction.build().perform();
			switch (subMenuItem) {
			case NONE:
				womenAction.click().build().perform();
				break;
			case WOMEN_HEELS:
				womenAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(women_heels_xPath), maxSecond)).click().build().perform();
				break;			
			case WOMEN_HEELS_HIGHHEELS:
				womenAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(women_heels_highheels_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_HEELS_LOWHEELS:
				womenAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(women_heels_lowheels_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_HEELS_POINTEDHEELS:
				womenAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(women_heels_pointedheels_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_HEELS_WEDGEHEELS:
				womenAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(women_heels_wedgeheels_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_SANDALS:
				womenAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(women_sandals_xPath), maxSecond)).click().build().perform();
				break;			
			case WOMEN_SANDALS_KITTEN:
				womenAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(women_sandals_kitten_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_SANDALS_REGULAR:
				womenAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(women_sandals_regular_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_SHOES:
				womenAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(women_shoes_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_SHOES_CASUALSHOE:
				womenAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(women_shoes_casualshoes_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_SHOES_ETHINICSHOES:
				womenAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(women_shoes_ethinicshoes_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_SHOES_FORMALSHOES:
				womenAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(women_shoes_formalshoes_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_SHOES_SPORTSHOES:
				womenAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(women_shoes_sportshoes_xPath), maxSecond)).click().build().perform();
				break;
			default:
				break;
			}
			break;
		case MEN:
			Actions menAction = new Actions(Browser.Driver()).moveToElement(waitForPageUntilElementIsVisible(By.xpath(men_xPath), maxSecond));
			menAction.build().perform();
			switch (subMenuItem) {
			case NONE:
				menAction.click().build().perform();
				break;
			case MEN_SHOES:
				menAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(men_shoes_xPath), maxSecond)).click().build().perform();
				break;			
			case MEN_SHOES_CASULASHOES:
				menAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(men_shoes_causualshoes_xPath), maxSecond)).click().build().perform();
				break;
			case MEN_SHOES_FORMALSHOES:
				menAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(men_shoes_formalshoes_xPath), maxSecond)).click().build().perform();
				break;
			case MEN_SHOES_SEMIFORMALS:
				menAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(men_shoes_semiformals_xPath), maxSecond)).click().build().perform();
				break;
			case MEN_SNEAKERS:
				menAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(men_sneakers_xPath), maxSecond)).click().build().perform();
				break;	
			case MEN_SNEAKERS_REGULARS:
				menAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(men_sneakers_regulars_xPath), maxSecond)).click().build().perform();
				break;			
			case MEN_ATHELETICS:
				menAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(men_atheletics_xPath), maxSecond)).click().build().perform();
				break;
			case MEN_ATHELETICS_INDOORSPORTSHOES:
				menAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(men_atheletics_indoorsportshoes_xPath), maxSecond)).click().build().perform();
				break;
			case MEN_ATHELETICS_OUTDOORANDHIKINGSHOES:
				menAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(men_atheletics_outdoorandhikingshoes_xPath), maxSecond)).click().build().perform();
				break;
			case MEN_ATHELETICS_RUNNINGSHOES:
				menAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(men_atheletics_runningshoes_xPath), maxSecond)).click().build().perform();
				break;
			case MEN_ATHELETICS_TRANNINGSHOES:
				menAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(men_atheletics_tranningshoes_xPath), maxSecond)).click().build().perform();
				break;
			case MEN_LOAFERS:
				menAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(men_loafers_xPath), maxSecond)).click().build().perform();
				break;			
			default:
				break;
			}
			break;
		case KIDS:
			Actions kidsAction = new Actions(Browser.Driver()).moveToElement(waitForPageUntilElementIsVisible(By.xpath(kids_xPath), maxSecond));
			kidsAction.build().perform();
			switch (subMenuItem) {
			case NONE:
				kidsAction.click().build().perform();
				break;
			case KIDS_BOYS:
				kidsAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(kids_boys_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_BOYS_BOOTS:
				kidsAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(kids_boys_boots_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_BOYS_CASUALSHOE:
				kidsAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(kids_boys_casualshoe_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_BOYS_FLIPFLOPS:
				kidsAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(kids_boys_flipflops_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_BOYS_SANDELS:
				kidsAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(kids_boys_sandels_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_BOYS_SCHOOLSHOES:
				kidsAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(kids_boys_schoolshoes_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_BOYS_SPORTSHOES:
				kidsAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(kids_boys_sportshoes_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_GIRLS:
				kidsAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(kids_girls_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_GIRLS_CLOGS:
				kidsAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(kids_girls_clogs_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_GIRLS_FLATANDBELLIES:
				kidsAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(kids_girls_flatandbellies_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_GIRLS_SANDELS:
				kidsAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(kids_girls_sandels_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_GIRLS_SPORTSANDCASUALSHOES:
				kidsAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(kids_girls_sportsandcasualshoes_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_KID:
				kidsAction.moveToElement(waitForPageUntilElementIsVisible(By.xpath(kids_kid_xPath), maxSecond)).click().build().perform();
				break;
			default:
				break;			
			}	
			break;
		} 
	}
}
