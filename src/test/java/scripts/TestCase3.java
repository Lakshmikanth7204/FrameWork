package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Addtowishlist;
import pomPages.CoreJava;
import pomPages.SkillraryLoginPage;

public class TestCase3 extends BaseClass
{
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.searchbutton(pdata.getPropertyFile("coursename"));
		s.submitbutton();
		
		CoreJava cj=new CoreJava(driver);
		cj.corejavacourse();
		
		
		Addtowishlist wish=new Addtowishlist(driver);
		Thread.sleep(3000);
		wish.cookiesbtn();
		driverutilities.switchtoframe(driver);
		Thread.sleep(3000);
		wish.playbutton();
		Thread.sleep(8000);
		wish.pausebutton();
		driverutilities.switchback(driver);
		wish.addtowishlist();
		
	}

}
