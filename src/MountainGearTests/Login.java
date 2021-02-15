package MountainGearTests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Constaints.Constaints;

public class Login extends Constaints{

	@Parameters({"emailId","password"})
	@Test
	public void Login(String emailId,String password) throws InterruptedException {
		test = extent.createTest("Login");
		try {
			WebElement element = driver.findElement(By.xpath("//a[@title='Account']"));
			element.click();
			Thread.sleep(5000);
			driver.findElement(By.id("dwfrm_login_username")).sendKeys(emailId);
			Thread.sleep(5000);
			driver.findElement(By.id("dwfrm_login_password")).sendKeys(password);
			driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}

