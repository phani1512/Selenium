package Constaints;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class Constaints {

	public static WebDriver driver;
	public static String url= "https://www.mountaingear.com/";
	
	public static ThreadLocal<WebDriver> tdriver =new ThreadLocal<WebDriver>();

	@BeforeSuite
	public WebDriver SetUrl() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().window().maximize();
		
		tdriver.set(driver);
		return getDriver();

	}

	public synchronized static WebDriver getDriver() {
		return tdriver.get();
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}




}









