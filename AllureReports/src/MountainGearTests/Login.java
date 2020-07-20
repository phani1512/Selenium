package MountainGearTests;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
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
public class Login extends Constaints{

	@Parameters({"emailId","password"})

	@Test(priority=2)
	@Description("verify valid Login ") 
	@Epic("EP001")                        
	@Feature("Feature1 : Login")        
	@Story("Story :Valid Login")       
	@Step("Verify Login")        
	@Severity (SeverityLevel.BLOCKER)  
	
	public void Login(String emailId,String password) throws InterruptedException {
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

