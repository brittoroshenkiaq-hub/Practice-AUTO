package Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class {
	WebDriver driver;

	public Pom_Class(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
}


	

@FindBy(xpath = "//a[text()='click here']")
public WebElement Clickhere;

@FindBy(xpath = "//a[text()='Dynamic Content']")
public WebElement content;

@FindBy(xpath = "//a[text()='Dynamic Controls']")
public WebElement DynamicControls;

@FindBy(xpath = "//input[@type='checkbox']")
public WebElement checkbox;

@FindBy(xpath = "//button[text()='Remove']")
public WebElement RemoveBox;
  
@FindBy(xpath = "(//button[@autocomplete='off'])[2]")
  public WebElement EnableButton;
  
  @FindBy(xpath = "//p[@id='message']") 
  public WebElement ItsDisabledText;
  
  @FindBy(xpath = "(//button[@autocomplete='off'])[2]")
  public WebElement DisableButton;
  
  @FindBy(xpath = "(//button[@autocomplete='off'])[2]")
  public WebElement ItsEnabledText;
  
  @FindBy(xpath = "//*[@id='message']") 
  public WebElement ItsgoneText;
  
  @FindBy(xpath = "(//button[@autocomplete='off'])[1]") 
  public WebElement addbox;
  
  @FindBy(xpath = "//p[@id='message']")
  public WebElement itsbackText;
  
  //<scenario3//
  
  
  
 @FindBy(xpath = "//a[text()='Entry Ad']")
 public WebElement EntryAd;
  
  @FindBy(xpath = "//a[text()='click here']")
  public WebElement clickHere;
  
  @FindBy(xpath = "//p[text()='Close']")
  public WebElement Close;
  
  
  
  
  }
 
