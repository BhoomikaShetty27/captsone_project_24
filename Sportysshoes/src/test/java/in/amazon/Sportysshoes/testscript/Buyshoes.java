package in.amazon.Sportysshoes.testscript;

	import org.testng.annotations.Test;

import in.amazon.Sportysshoes.pages.Addtocart;
import in.amazon.Sportysshoes.pages.Cart;
import in.amazon.Sportysshoes.pages.Home;
import in.amazon.Sportysshoes.pages.LandingPage;
import in.amazon.Sportysshoes.pages.Loginpage;
import in.amazon.Sportysshoes.pages.Placeorder;

	

	
	 
	

	public class Buyshoes extends BaseTEST {
		@Test
		
		public void buyshoes() throws InterruptedException {
			
			LandingPage page=new LandingPage(driver);
			
			page.registerPage();
			
			page.EnterName();
			
			page.EnterEmail();
			
			page.EnterPassword();
			
			page.clickRegisterBtn();
			
			
			Loginpage page1= new Loginpage(driver);
			page1.EnterEmail();
			
			page1.EnterPassword();
			
			page1.clickLoginBtn();
			
			Addtocart addtocart=new Addtocart(driver);
			
			
			addtocart.clickaddtocart();
			
			Home home =new Home(driver);
			home.homebtn();
			
			Cart cart = new Cart(driver);
			cart.cartbtn();
			
			Placeorder placeorder = new Placeorder(driver);
			placeorder.clickplaceorderbtn();
			
					
		}
			 
	}

