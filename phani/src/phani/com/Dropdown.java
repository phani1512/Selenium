package phani.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
	
		 {
		 
		 driver.get("https://www.facebook.com/");
		 
		 driver.manage().window().maximize();
		 
		 WebElement day=driver.findElement(By.id("day"));
		 WebElement month=driver.findElement(By.id("month"));
		 WebElement year=driver.findElement(By.id("year"));
	
		 selectValueFromDropDown(day,"15");
		 selectValueFromDropDown(month,"Dec");
		 selectValueFromDropDown(year,"1995");
		 }

	}
	public static void selectValueFromDropDown(WebElement element,String value) {
		
		Select select=new Select(element);
		select.selectByVisibleText(value);
		

}
}