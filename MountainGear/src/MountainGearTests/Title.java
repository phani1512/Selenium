package MountainGearTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Constaints.Constaints;

public class Title extends Constaints {

	@Test
	public void verifyPageTitle() throws InterruptedException{
		test = extent.createTest("verifyPageTitle");
		String Title = driver.getTitle();
		System.out.println("The page title is :" + Title);
		Assert.assertEquals(Title, "MountainGear.com outdoor gear & clothing for climbing, hiking, skiing and backpacking");

	}
}
