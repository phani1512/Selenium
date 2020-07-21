package MountainGearTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Constaints.Constaints;

public class Logout extends Constaints{
	@Test
	public void LogOut() throws InterruptedException {
		test = extent.createTest("LogOut");
		WebElement element = driver.findElement(By.xpath("//a[@title='Logout']"));
		element.click();
		Thread.sleep(5000);
		System.out.println("Logout successfull ");

	}
}
