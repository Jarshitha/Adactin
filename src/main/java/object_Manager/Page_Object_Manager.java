package object_Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pojoclass.Check_List;
import com.pojoclass.Dress_Details;
import com.pojoclass.Home_Page;
import com.pojoclass.Login_Page;
import com.pojoclass.Payment;

public class Page_Object_Manager {

	public static WebDriver driver;
	
	private Home_Page hp;
	private Login_Page lp;
	private Dress_Details dd;
	private Check_List cl;
	private Payment pay;
	
	
	
	public Home_Page getHp() {
		Home_Page hp=new Home_Page(driver);
		return hp;
	}
	
	
	public Login_Page getLp() {
		Login_Page lp=new Login_Page(driver);
		return lp;
	}
	
	
	public Dress_Details getDd() {
		Dress_Details dd=new Dress_Details(driver);
		return dd;
	}
	
	
	public Check_List getPro() {
		Check_List cl=new Check_List(driver);
		return cl;
	} 
	
	public Payment getPay() {
		Payment pay=new Payment(driver);
		return pay;
	}
	
}
