package project_2.airline_app;

import org.testng.annotations.Test;
import resources.LaunchnQuit;
import resources.Test_Data;

public class TestCase01  extends LaunchnQuit
{
	@Test (retryAnalyzer =resources.RetryFailed.class)
	public void registration() throws Exception 
	{
		Home_Page homepage = new Home_Page(driver);
		Test_Data ddt = new Test_Data();
		ddt.data_fetching();
		homepage.hoveroverOnLoginOrSignUp(driver);
		homepage.clickOnLogin();
		homepage.enterEmail();
		homepage.clickContinue();
	}
}
