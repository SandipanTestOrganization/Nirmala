package nirmala.shoeshop.menu;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import nirmala.shoeshop.browser.Browser;
import nirmala.shoeshop.pages.HomePage;
import nirmala.shoeshop.pages.KidsPage;
import nirmala.shoeshop.pages.MenPage;
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
		Assert.assertTrue(WomenPage.IsAt());
		
		TopNavigationBar.Women.Heels.Select();
		Assert.assertTrue(WomenPage.HeelsPage().IsAt());
		
		TopNavigationBar.Women.Heels.HighHeels.Select();
		Assert.assertTrue(WomenPage.HeelsPage().HighHeelsPage().IsAt());
		
		TopNavigationBar.Women.Heels.LowHeels.Select();
		Assert.assertTrue(WomenPage.HeelsPage().LowHeelsPage().IsAt());
		
		TopNavigationBar.Women.Heels.PointedHeels.Select();
		Assert.assertTrue(WomenPage.HeelsPage().PointedHeels().IsAt());
		
		TopNavigationBar.Women.Heels.WedgeHeels.Select();
		Assert.assertTrue(WomenPage.HeelsPage().WedgeHeels().IsAt());
		
		TopNavigationBar.Women.Sandals.Select();
		Assert.assertTrue(WomenPage.SandalsPage().IsAt());
		
		TopNavigationBar.Women.Sandals.Regular.Select();
		Assert.assertTrue(WomenPage.SandalsPage().Regular().IsAt());
		
		TopNavigationBar.Women.Sandals.Kitten.Select();
		Assert.assertTrue(WomenPage.SandalsPage().Kitten().IsAt());
		
		TopNavigationBar.Women.Shoes.Select();
		Assert.assertTrue(WomenPage.ShoesPage().IsAt());
		
		TopNavigationBar.Women.Shoes.CasualShoes.Select();
		Assert.assertTrue(WomenPage.ShoesPage().CasualShoesPage().IsAt());
		
		TopNavigationBar.Women.Shoes.SportsShoes.Select();
		Assert.assertTrue(WomenPage.ShoesPage().SportsShoes().IsAt());
		
		TopNavigationBar.Women.Shoes.FormalShoes.Select();
		Assert.assertTrue(WomenPage.ShoesPage().FormalShoes().IsAt());
		
		TopNavigationBar.Women.Shoes.EthnicShoes.Select();
		Assert.assertTrue(WomenPage.ShoesPage().EthnicShoes().IsAt());
			
		TopNavigationBar.Men.Select();
		Assert.assertTrue(MenPage.IsAt());
		
		TopNavigationBar.Men.Shoes.Select();
		Assert.assertTrue(MenPage.MenShoesPage().IsAt());
		
		TopNavigationBar.Men.Shoes.CasualShoes.Select();
		Assert.assertTrue(MenPage.MenShoesPage().CasualShoes().IsAt());
		
		TopNavigationBar.Men.Shoes.FormalShoes.Select();
		Assert.assertTrue(MenPage.MenShoesPage().FormalShoes().IsAt());
		
		TopNavigationBar.Men.Shoes.SemiFormals.Select();
		Assert.assertTrue(MenPage.MenShoesPage().SemiFormals().IsAt());
		
		TopNavigationBar.Men.Sneakers.Select();
		Assert.assertTrue(MenPage.Sneakers().IsAt());
		
		TopNavigationBar.Men.Sneakers.Regulars.Select();
		Assert.assertTrue(MenPage.Sneakers().Regulars().IsAt());
		
		TopNavigationBar.Men.Atheletics.Select();
		Assert.assertTrue(MenPage.Atheletics().IsAt());
		
		TopNavigationBar.Men.Atheletics.OutDoorAndHikingShoes.Select();
		//Assert.assertTrue(MenPage.Atheletics().OutDoorAndHikingShoes().IsAt());
		
		TopNavigationBar.Men.Atheletics.RunningShoes.Select();
		Assert.assertTrue(MenPage.Atheletics().RunningShoes().IsAt());
		
		TopNavigationBar.Men.Atheletics.InDoorSportsShoes.Select();
		Assert.assertTrue(MenPage.Atheletics().InDoorSportsShoes().IsAt());
		
		TopNavigationBar.Men.Atheletics.TrainingShoes.Select();
		Assert.assertTrue(MenPage.Atheletics().TrainingShoes().IsAt());
		
		TopNavigationBar.Men.Lofers.Select();
		Assert.assertTrue(MenPage.Lofers().IsAt());
		
		TopNavigationBar.Kids.Select();
		Assert.assertTrue(KidsPage.IsAt());		
		
		TopNavigationBar.Kids.Boys.Select();
		Assert.assertTrue(KidsPage.BoysPage().IsAt());
		
		TopNavigationBar.Kids.Boys.Boots.Select();
		Assert.assertTrue(KidsPage.BoysPage().Boots().IsAt());
		
		TopNavigationBar.Kids.Boys.CausualShoes.Select();
		Assert.assertTrue(KidsPage.BoysPage().CausualShoes().IsAt());
		
		TopNavigationBar.Kids.Boys.FlipFlops.Select();
		Assert.assertTrue(KidsPage.BoysPage().FlipFlops().IsAt());
		
		TopNavigationBar.Kids.Boys.Sandels.Select();
		Assert.assertTrue(KidsPage.BoysPage().Sandels().IsAt());
		
		TopNavigationBar.Kids.Boys.SchoolShoes.Select();
		Assert.assertTrue(KidsPage.BoysPage().SchoolShoes().IsAt());
		
		TopNavigationBar.Kids.Boys.SportsShoes.Select();
		Assert.assertTrue(KidsPage.BoysPage().SportsShoes().IsAt());
		
		TopNavigationBar.Kids.Girls.Select();
		Assert.assertTrue(KidsPage.GirlsPage().IsAt());
		
		TopNavigationBar.Kids.Girls.Sandels.Select();
		Assert.assertTrue(KidsPage.GirlsPage().Sandels().IsAt());
			
		TopNavigationBar.Kids.Girls.Clogs.Select();
		Assert.assertTrue(KidsPage.GirlsPage().Clogs().IsAt());
		
		TopNavigationBar.Kids.Girls.FlatsAndBellies.Select();
		Assert.assertTrue(KidsPage.GirlsPage().FlatsAndBellies().IsAt());
		
		TopNavigationBar.Kids.Girls.SportsAndCasualShoes.Select();
		Assert.assertTrue(KidsPage.GirlsPage().SportsAndCasualShoes().IsAt());
		
		TopNavigationBar.Kids.Kid.Select();
		Assert.assertTrue(KidsPage.Kids().IsAt());
	}
}
