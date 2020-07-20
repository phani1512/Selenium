package MountainGearTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
public class Logout extends Constaints{
	@Test(priority=3)
	@Description("verify Logout ") 
	@Epic("EP001")                        
	@Feature("Feature1 : Logout")        
	@Story("Story : verify Logout")       
	@Step("Verify Logout")        
	@Severity (SeverityLevel.NORMAL)  
	public void LogOut() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//a[@title='Logout']"));
		element.click();
		Thread.sleep(5000);
		System.out.println("Logout successfull ");

	}
}
