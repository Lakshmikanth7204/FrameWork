package pomPages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	WebDriver driver =new ChromeDriver();
	@FindBy(id="add")
	private WebElement addbtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addcart;
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void addtocartbtn()
	{
		addcart.click();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	public WebElement getAddbtn() {
		return addbtn;
	}
	
	
	
}
