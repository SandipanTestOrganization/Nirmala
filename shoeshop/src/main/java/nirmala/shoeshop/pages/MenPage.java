package nirmala.shoeshop.pages;

import nirmala.shoeshop.browser.Browser;
import nirmala.shoeshop.pages.men.AtheleticsPage;
import nirmala.shoeshop.pages.men.LofersPage;
import nirmala.shoeshop.pages.men.MenShoesPage;
import nirmala.shoeshop.pages.men.MenSneakersPage;


public class MenPage {

	public static boolean IsAt() {
		return Browser.Driver().getTitle().equals("Men - ShoeFactory");
	}

	public static MenShoesPage MenShoesPage() {
		// TODO Auto-generated method stub
		return new MenShoesPage();
	}

	public static MenSneakersPage Sneakers() {
		// TODO Auto-generated method stub
		return new MenSneakersPage();
	}

	public static AtheleticsPage Atheletics() {
		// TODO Auto-generated method stub
		return new AtheleticsPage();
	}

	public static LofersPage Lofers() {
		// TODO Auto-generated method stub
		return new LofersPage();
	}

}
