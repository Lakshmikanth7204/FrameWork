package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtowishlist 
{
	@FindBy(xpath="//a[text()='X']")
	private WebElement cookies;
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowish;
	
	public Addtowishlist(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void playbutton()
	{
		playbtn.click();
	}
	
	public void pausebutton()
	{
		pausebtn.click();
	}
	
	public void addtowishlist()
	{
		addtowish.click();
	}
	
	public void cookiesbtn()
	{
		cookies.click();
	}
	

}
