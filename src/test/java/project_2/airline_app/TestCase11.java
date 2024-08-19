package project_2.airline_app;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import resources.DatePicker;
import resources.LaunchnQuit;
import resources.Test_Data;

public class TestCase11 extends  LaunchnQuit 
{
	@Test(retryAnalyzer =resources.RetryFailed.class )
	public void validations2() throws  Exception
	{
		Search_Page search=new Search_Page(driver);
		Test_Data ddt=new Test_Data();
		ddt.data_fetching();
		search.ClickFrom();
		search.enterFrom("hyd");
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOf(search.autosugg_from));
		Thread.sleep(500);
		search.selectFrom();
		search.enterTo("goa");
//		WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait2.until(ExpectedConditions.visibilityOf(search.autosugg_To));
		Thread.sleep(500);
		search.selectTo();
		DatePicker.selectDate(driver, "25/oct/2024", "dd/MMM/yyyy");
		search.clickSearch();
		SeatSelection seat=new SeatSelection(driver);
		seat.clickBookNow();
		seat.selectInsurance();
		assertEquals(seat.insuranceRadioBTN.isEnabled(), true);
		seat.enterContactEmail();
		assertEquals(seat.contactInfo.isEnabled(), true);
		seat.clickVerifyEmail();
		seat.titleSelection();
		seat.enterFN();
		assertEquals(seat.firstName1.isEnabled(), true);
		seat.enterLN();
		assertEquals(seat.lastName1.isEnabled(), true);
		seat.enterPh();
		assertEquals(seat.contactPH.isEnabled(), true);
		seat.selectcouponCodeRadio();
		assertEquals(seat.selectcouponCode.isEnabled(), true);
	}
}
