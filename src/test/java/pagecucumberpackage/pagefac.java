package pagecucumberpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagecucumberpackage.*;
public class pagefac {
	
	
	
	public WebDriver driver;
	@FindBy (id="APjFqb")
	public WebElement searchBox;
	
	@FindBy (xpath ="(//*[text()='Flipkart'])[1]")
	public WebElement flipkart;
	
	String url ="https://www.google.com";
	
	@FindBy (xpath ="//input[@type=\"text\"]")
	public WebElement searchFlipkart;
	
	@FindBy (xpath ="(//*[@class=\"_30jeq3 _1_WHN1\"])[1]")
	public WebElement xphoneprice;
	
	public void enter(WebElement e,String s) {
		e.sendKeys("s");
		
		
	}
	
	
}
