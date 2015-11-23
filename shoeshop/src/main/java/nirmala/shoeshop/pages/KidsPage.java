package nirmala.shoeshop.pages;

import nirmala.shoeshop.browser.Browser;
import nirmala.shoeshop.pages.kids.BoysPage;
import nirmala.shoeshop.pages.kids.GirlsPage;
import nirmala.shoeshop.pages.kids.KidsKidsPage;

public class KidsPage {

	public static boolean IsAt() {
		return Browser.Driver().getTitle().equals("Kids - ShoeFactory");
	}

	public static BoysPage BoysPage() {
		// TODO Auto-generated method stub
		return new BoysPage();
	}

	public static GirlsPage GirlsPage() {
		// TODO Auto-generated method stub
		return new GirlsPage();
	}

	public static KidsKidsPage Kids() {
		// TODO Auto-generated method stub
		return new KidsKidsPage();
	}

}
