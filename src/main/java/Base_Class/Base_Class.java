package Base_Class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static WebDriver driver;
	public static WebDriverWait wait;

	
	public static WebDriver browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/?utm_source");
		driver.manage().window().maximize();
	
		return driver;

	}

	
	public static void click (WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		element.click();
		
	}
	
	public static String getText(WebElement e) {
		return e.getText();
	}
	
	public static void sendKeys(WebElement e, String text) {
		e.sendKeys(text);
	}
	
	public static String geturl() {
		return driver.getCurrentUrl();
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}
	
	public boolean isDisplayed(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
	}	
		
	public static void back() {
		driver.navigate().back();
		
	}
		
		
		
	}
	

