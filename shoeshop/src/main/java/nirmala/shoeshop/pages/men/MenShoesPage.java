package nirmala.shoeshop.pages.men;

import nirmala.shoeshop.browser.Browser;
import nirmala.shoeshop.pages.MenPage;

public class MenShoesPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Shoes - ShoeFactory");
	}

	public MenCasualShoesPage CasualShoes() {
		// TODO Auto-generated method stub
		return new MenCasualShoesPage();
	}

	public MenFormalShoesPage FormalShoes() {
		// TODO Auto-generated method stub
		return new MenFormalShoesPage();
	}

	public MenSemiFormalsPage SemiFormals() {
		// TODO Auto-generated method stub
		return new MenSemiFormalsPage();
	}

	
}
