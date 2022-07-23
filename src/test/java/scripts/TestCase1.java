package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1()
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		driverutilities.switchtabs(driver);
		driverutilities.mouseHover(driver,sd.getCoursebtn());
		sd.seleniumtrainingtab();
		
		AddToCartPage a=new AddToCartPage(driver);
		driverutilities.doubleClick(driver,a.getAddbtn());
		a.addtocartbtn();
		driverutilities.alertpopup(driver);
			
	}

}
