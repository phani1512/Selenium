package phani.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://is.rediff.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn_go")).click();
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		//a.accept();
		//a.dismiss();
	    //a.getText();
		//a.sendKeys("what should be written");

	}

}
