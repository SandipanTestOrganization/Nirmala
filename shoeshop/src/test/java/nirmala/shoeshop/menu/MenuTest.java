package nirmala.shoeshop.menu;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import nirmala.shoeshop.browser.Browser;
import nirmala.shoeshop.pages.HomePage;
import nirmala.shoeshop.pages.WomenPage;

public class MenuTest {
	@Before
	public void Init(){
		Browser.Open();
	}
	@After
	public void CleanUp(){
		//Browser.Close();
	}	
	@Test
	public void Can_Go_to_All_Menu_Link(){		
		HomePage.GoTo();
		TopNavigationBar.Women.Select();
		//Write verify
		Assert.assertTrue(WomenPage.IsAt());
		TopNavigationBar.Women.Heels.Select();
		Assert.assertTrue(WomenPage.HeelsPage().IsAt());
		TopNavigationBar.Women.Heels.HighHeels.Select();
		Assert.assertTrue(WomenPage.HeelsPage().HighHeelsPage().IsAt());
		// write verify
		//TopNavigationBar.Women.Heels.LowHeels.Select();
		// write verify
		//TopNavigationBar.Women.Heels.PointedHeels.Select();
		// write verify
		//TopNavigationBar.Women.Heels.WedgeHeels.Select();
		// write verify
		//TopNavigationBar.Women.Sandals.Select();
		// write verify
		//TopNavigationBar.Women.Sandals.Regular.Select();
		// write verify
		//TopNavigationBar.Women.Sandals.Kitten.Select();
		// write verify
		//TopNavigationBar.Women.Shoes.Select();
		// write verify
		//TopNavigationBar.Women.Shoes.CasualShoes.Select();
		// write verify
		//TopNavigationBar.Women.Shoes.SportsShoes.Select();
		// write verify
		//TopNavigationBar.Women.Shoes.FormalShoes.Select();
		// write verify
		//TopNavigationBar.Women.Shoes.EthnicShoes.Select();
		// write verify		
		//TopNavigationBar.Men.Shoes.Select();
		// write verify
		//TopNavigationBar.Men.Shoes.CasualShoes.Select();
		// write verify
		//TopNavigationBar.Men.Shoes.FormalShoes.Select();
		// write verify
		//TopNavigationBar.Men.Shoes.SemiFormals.Select();
		// write verify
		//TopNavigationBar.Men.Sneakers.Select();
		// write verify
		//TopNavigationBar.Men.Sneakers.Regulars.Select();
		// write verify
		//TopNavigationBar.Men.Atheletics.Select();
		// write verify
		//TopNavigationBar.Men.Atheletics.OutDoorAndHikingShoes.Select();
		// write verify
		//TopNavigationBar.Men.Atheletics.RunningShoes.Select();
		// write verify
		//TopNavigationBar.Men.Atheletics.InDoorSportsShoes.Select();
		// write verify
		//TopNavigationBar.Men.Atheletics.TrainingShoes.Select();
		// write verify
		//TopNavigationBar.Men.Lofers.Select();
		// write verify
		//TopNavigationBar.Kids.Boys.Select();
		// write verify
		//TopNavigationBar.Kids.Boys.Boots.Select();
		// write verify
		//TopNavigationBar.Kids.Boys.CausualShoes.Select();
		// write verify
		//TopNavigationBar.Kids.Boys.FlipFlops.Select();
		// write verify
		//TopNavigationBar.Kids.Boys.Sandels.Select();
		// write verify
		//TopNavigationBar.Kids.Boys.SchoolShoes.Select();
		// write verify
		//TopNavigationBar.Kids.Boys.SportsShoes.Select();
		// write verify
		//TopNavigationBar.Kids.Girls.Select();
		// write verify
		//TopNavigationBar.Kids.Girls.Sandels.Select();
		// write verify	
		//TopNavigationBar.Kids.Girls.Clogs.Select();
		// write verify	
		//TopNavigationBar.Kids.Girls.FlatsAndBellies.Select();
		// write verify	
		//TopNavigationBar.Kids.Girls.SportsAndCasualShoes.Select();
		// write verify	
		//TopNavigationBar.Kids.Kid.Select();		
	}
}
