package org.mainclass;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebElement check;
	public static Select s;
	public static void browserlaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void sendkeys(By locator, String s) throws Exception {
		try {
			WebElement element = driver.findElement(locator);
			element.sendKeys(s);
		} catch (Exception e) {
			throw new Exception("unable to send the data" + locator);

		}
	}

	public static void click(By locator) throws Exception {
		try {
			WebElement element = driver.findElement(locator);
			element.click();

		} catch (Exception e) {
			throw new Exception("unable to click the element");

		}
	}

	public static void clear(By locator) throws Exception {
		try {
			WebElement element = driver.findElement(locator);
			element.clear();

		} catch (Exception e) {
			throw new Exception("unable to clear the element" + locator);

		}
	}

	public static void implicitWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}

	public static void action(By locator) throws Exception {
		try {
			WebElement src = driver.findElement(locator);
			Actions action = new Actions(driver);
			action.moveToElement(src).build().perform();
		} catch (Exception e) {
			throw new Exception("unable to move the element");
		}
	}
	public static String captureScreenshot() throws IOException {

		File srcFiler = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] encoded;
		try {
			encoded = Base64.encodeBase64(FileUtils.readFileToByteArray(srcFiler));
			String shot = new String(encoded, StandardCharsets.US_ASCII);
			return shot;

		} catch (IOException e) {
			e.printStackTrace();

		}
		return null;
	}

	public static void ScrollDown() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public static void Frameid(String s) {
		driver.switchTo().frame(s);
	}

	public void DefaultFrame() {
		driver.switchTo().defaultContent();
	}

	public static void fluentwait(By locator) {
		Wait<WebDriver> waits = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		waits.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public static boolean IsElementDisplayed(By Locator) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement ElementDisplay = wait.until(ExpectedConditions.elementToBeClickable(Locator));
		return ElementDisplay.isDisplayed();
	}

	public static void waitForElement(By Locator) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 240);
		wait.until(ExpectedConditions.elementToBeClickable(Locator));
	}
	public static void elementtobeclick(By Locator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Locator));
	}

	public static void pageRefresh(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	   public static void selectIndex(By locator, int i) {
	       s = new Select((WebElement) locator);
	       s.selectByIndex(i);

	}
	    public static void selecttxt(By locator , String str) {
	        s = new Select((WebElement) locator);
	        s.selectByVisibleText(str);
	    }
	    
		public static void ToQuit() {
			driver.quit();
		}
}