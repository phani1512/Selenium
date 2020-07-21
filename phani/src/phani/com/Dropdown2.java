package phani.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 driver.manage().window().maximize();
		 
		 WebElement day=driver.findElement(By.id("day"));
		//WebElement month=driver.findElement(By.id("month"));

		 //WebElement year=driver.findElement(By.id("year"));
         
		 Select select1= new Select(day);
		 
		 
		// select1.selectByIndex(10);
		 
		 System.out.println(select1.isMultiple());
		 
		List<WebElement> listDays = select1.getOptions();
		 
		 System.out.println(listDays.size());
		 
		 int TotalDays=listDays.size()-1;
		 
		 System.out.println("total days are: "+TotalDays);
		 
		 for(int i=0;i<listDays.size();i++) {
		 String dayVal = listDays.get(i).getText();
		 System.out.println(dayVal);
		 
		 if(dayVal.equals("15")) {
		 
		 listDays.get(i).click();
		 break;
		 }
		 }
		 WebElement month=driver.findElement(By.id("month"));
		 Select select2= new Select(month);
		List<WebElement> listmonths = select2.getOptions();
		
			 
		int Totalmonths=listmonths.size();
		 System.out.println("total listmonths are: "+Totalmonths);
			 
			 int Totalmonth=listmonths.size()-1;
			 
			 System.out.println("total months are: "+Totalmonth);
			 
			 for(int j=0;j<listmonths.size();j++) {
			 String monthVal = listmonths.get(j).getText();
			 System.out.println(monthVal);
			 
			 if(monthVal.equals("Jun")) {
			 
			 listmonths.get(j).click();
			 break; 
		 } 
		 
	}

			 WebElement year=driver.findElement(By.id("year"));
			 Select select= new Select(year);
			List<WebElement> listyear = select.getOptions();
			
				  int Totalyears=listyear.size();
				 System.out.println("total listyears are: "+Totalyears);
				 
				 int Totalyear=listyear.size()-1;
				 
				 System.out.println("total years are: "+Totalyear);
				 
				 for(int k=0;k<listyear.size();k++) {
				 String yearVal = listyear.get(k).getText();
				 System.out.println(yearVal);
				 
				 if(yearVal.equals("1995")) {
				 
				 listyear.get(k).click();
				 break; 
				 }
			 	 }

}
}



