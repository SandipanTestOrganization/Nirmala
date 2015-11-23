package nirmala.shoeshop.pages.kids;

import nirmala.shoeshop.browser.Browser;
//import nirmala.shoeshop.pages.KidsPage;

public class GirlsPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Girls - ShoeFactory");
	}

	public GirlsSandelsPage Sandels() {
		// TODO Auto-generated method stub
		return new GirlsSandelsPage();
	}

	public ClogsPage Clogs() {
		// TODO Auto-generated method stub
		return new ClogsPage();
	}

	public FlatsAndBelliesPage FlatsAndBellies() {
		// TODO Auto-generated method stub
		return new FlatsAndBelliesPage();
	}

	public SportsAndCasualShoesPage SportsAndCasualShoes() {
		// TODO Auto-generated method stub
		return new SportsAndCasualShoesPage();
	}

}
