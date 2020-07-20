package MountainGearTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Constaints.Constaints;
import Listener.AllureListener;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Listeners({AllureListener.class})
public class Title extends Constaints {

	@Test(priority=1, description = "verify Title presence")
	@Description("verify Title presence ") // Description
	@Epic("EP001")                         // which epic the test belongs too
	@Feature("Feature1 : Title")          // which feature the test case belongs too
	@Story("Story :Title Presence")       // Which story the test case belongs too
	@Step("Verify Title Presence")        // mainly uses to describe steps to execute the case
	@Severity (SeverityLevel.MINOR)       // show the SeverityLevel of the test case
	public void verifyPageTitle() throws InterruptedException{
		String Title = driver.getTitle();
		System.out.println("The page title is :" + Title);
		Assert.assertEquals(Title, "MountainGear.com outdoor gear & clothing for climbing, hiking, skiing and backpacking");

	}
}
