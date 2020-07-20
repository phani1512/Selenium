package Listener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import io.qameta.allure.Allure;

import Constaints.Constaints;
import io.qameta.allure.Attachment;


public class AllureListener implements ITestListener {

	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();

	}

	@Attachment
	public byte[] saveFailureScreenShot(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}

	@Attachment(value ="{0}", type = "text/plain") 
	public static String saveTextLog(String message) {
		return message;

	}


	@Override
	public void onFinish(ITestContext iTestContext) {
		System.out.println("I am in onFinish method " + iTestContext.getName());

	}

	@Override
	public void onStart(ITestContext iTestContext) {
		System.out.println("Iam in onstart method " + iTestContext.getName());
		iTestContext.setAttribute("WebDriver", Constaints.getDriver());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		System.out.println("Test failed but it is in defined success ratio" + getTestMethodName(iTestResult) + "Skipped");

	}

	@Override
	public void onTestFailure(ITestResult iTestResult) {
		System.out.println("Iam onTestFailure method " + getTestMethodName(iTestResult)+ "failed");
		Object testClass = iTestResult.getInstance();
		WebDriver driver = ((Constaints)testClass).getDriver();

		// Allure ScreenShot and SaveTestLog
		if(driver instanceof WebDriver) {
			System.out.println("ScreenShot captured for the test case : " + getTestMethodName(iTestResult));
			saveFailureScreenShot(driver);
		}
		saveTextLog(getTestMethodName(iTestResult) + "failed and screenshot taken!");
	}


	@Override
	public void onTestSkipped(ITestResult iTestResult) {
		System.out.println("Iam in onTestSkipped method " + getTestMethodName(iTestResult) + "Skipped");

	}

	@Override
	public void onTestStart(ITestResult iTestResult) {
		System.out.println("Iam in onTestStart method " + getTestMethodName(iTestResult) + "start");

	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		System.out.println("Iam in onTestSuccess method " + getTestMethodName(iTestResult) + "Success");

	}


}