
package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_page;
import generic.Reusablemethods;

public class OnlineShoppingSitePage extends Base_page
{
     public OnlineShoppingSitePage(WebDriver driver) {
		super(driver);
}

    @FindBy(xpath ="(//input[@type='text'])[2]")
    private WebElement uname;
    @FindBy(xpath ="//input[@type='password']")
    private WebElement pword;
    @FindBy(xpath ="(//button[@type='submit'])[2]")
    private WebElement login;
    @FindBy(xpath = "//div[.='Fashion']")
	private WebElement fashion;
	@FindBy(xpath = "//a[@class='_6WOcW9 _2-k99T']")
	private WebElement mentopwear;
	@FindBy(xpath = "(//img[@class='_2r_T1I'])[2]")
	private WebElement Raymond;
    public void setusername(String username)
    {
         uname.sendKeys(username);
         
     }
    public void setpassword(String password)
    {
         pword.sendKeys(password);
    }
    public void clicklogin()
    {
    	login.click();
    	
    }
   
    public void title(WebDriver driver)
    {
    	String title = "Online Shopping Site for Mobiles";
        verifyTitle(title,40);
        
    }
    public void hover(WebDriver driver)
	{
		verifyElement(fashion, 20);
		Reusablemethods obj = new Reusablemethods();
		obj.mousehover(driver,fashion);
	}
	
	public void mentopwear(WebDriver driver)
	{
		verifyElement(mentopwear, 10);
		mentopwear.click();
	}   
	public void Click(WebDriver driver)
	{
		verifyElement(Raymond, 10);
		Raymond.click();
	}
	public void switchwindow()
	{
		Reusablemethods childbrowser = new Reusablemethods();
		childbrowser.windowhandler(driver);
	}
	
}
