package nirmala.shoeshop.smoketest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import nirmala.shoeshop.browser.Browser;
import nirmala.shoeshop.pages.HomePage;

public class HomePageTest {
	
	@Before
	public void Init(){
		Browser.Open();
	}
	
	@After
	public void CleanUp(){
		Browser.Close();
	}
	
	@Test
	public void Can_Go_To_HomePage(){
		HomePage.GoTo();
		Assert.assertTrue(HomePage.IsAtHomePage());		
	}
}
