package nirmala.shoeshop.shopping;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import nirmala.shoeshop.browser.Browser;
import nirmala.shoeshop.menu.TopNavigationBar;
//import nirmala.shoeshop.menu.TopNavigationBar.Women.Heels.HighHeels;
import nirmala.shoeshop.pages.HomePage;
import nirmala.shoeshop.pages.WomenPage;
import nirmala.shoeshop.pages.women.HighHeelsPage;
import nirmala.shoeshop.pages.women.CartPage;

public class HighHeelWomenShoeShopping {

	@Before
	public void Init(){
		Browser.Open();
	}
	
	@After
	public void CleanUp(){
		//Browser.Close();
	}	
	
	@Test
	public void Can_buy_Women_HighHeelsShoe_Test() 
	{
		HomePage.GoTo();
		TopNavigationBar.Women.Heels.HighHeels.Select();
		Assert.assertTrue(WomenPage.HeelsPage().HighHeelsPage().IsAt());
		HighHeelsPage.AddToCart("Black Heels");
		Assert.assertTrue(WomenPage.HeelsPage().HighHeelsPage().IsAt());
		HighHeelsPage.BlackHeelsPage().AddtoCart().ContinueShopping();
		Assert.assertTrue(CartPage.IsAt());
		//Assert.assertTrue(CartPage.IsAddedSuccessfully());		
		//Assert.assertTrue(FlotingCart.IsAddedSuccessfully());
		//Thread.sleep(2000);
		HighHeelsPage.BlackHeelsPage().AddtoCart().ProceedToCheckOut();
		Assert.assertTrue(CartPage.IsAt());
	}		
}
