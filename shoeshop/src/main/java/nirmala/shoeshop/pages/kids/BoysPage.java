package nirmala.shoeshop.pages.kids;

import nirmala.shoeshop.browser.Browser;
import nirmala.shoeshop.pages.KidsPage;

public class BoysPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Boys - ShoeFactory");
	}

	public BootsPage Boots() {
		// TODO Auto-generated method stub
		return new BootsPage();
	}

	public CausualShoesPage CausualShoes() {
		// TODO Auto-generated method stub
		return new CausualShoesPage();
	}

	public FlipFlopsPage FlipFlops() {
		// TODO Auto-generated method stub
		return new FlipFlopsPage();
	}

	public SandelsPage Sandels() {
		// TODO Auto-generated method stub
		return new SandelsPage();
	}

	public SchoolShoesPage SchoolShoes() {
		// TODO Auto-generated method stub
		return new SchoolShoesPage();
	}

	public SportsShoesPage SportsShoes() {
		// TODO Auto-generated method stub
		return new SportsShoesPage();
	}

}
