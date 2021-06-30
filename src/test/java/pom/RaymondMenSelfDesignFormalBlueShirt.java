package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_page;
import generic.Reusablemethods;

public class RaymondMenSelfDesignFormalBlueShirt extends Base_page
{

	public RaymondMenSelfDesignFormalBlueShirt(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//li[@id='swatch-1-size']")
	private WebElement size;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addtocart;
	@FindBy(xpath="//div[.='Remove']")
	private WebElement Remove;
	@FindBy(xpath="//div[@class='_3dsJAO _24d-qY FhkMJZ']")
	private WebElement Removepopup;
	@FindBy(xpath="//div[@class='_28p97w']")
	private WebElement account;
	@FindBy(xpath="//div[.='Logout']")
	private WebElement lout;
	
	
	
	 public void title(WebDriver driver)
	    {
	    	String title = "Raymond Men Self Design Formal Blue Shirt - Buy Raymond Men Self Design Formal Blue Shirt Online at Best Prices in India | Flipkart.com";
	        verifyTitle(title,40);
	    }
	 
	public void productsize()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 600)");
		verifyElement(size, 15);
		size.click();
	}
	public void Click()
	{   JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 900)");
		verifyElement(addtocart, 15);
		addtocart.click();
	}
		
	public void removefromcart()
	{
	verifyElement(Remove,30);
	Remove.click();
	}
	public void removecartpopup() 
	{
   verifyElement(Removepopup,20);
   Removepopup.click();
	}
	public void Myaccount()
	{
	verifyElement(account,20);
	Reusablemethods obj = new Reusablemethods();
	obj.mousehover(driver,account);
	}
	public void Logout()
	{
		verifyElement(lout,20);
		lout.click();
	}
	
}







