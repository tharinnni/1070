package pagecucumberpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepexec {
public static WebDriver driver;
public  Robot robot;
pagefac pg = new pagefac();

@Given("Open the Chrome browser")
public void open_the_chrome_browser() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	option.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver(option);
	driver.manage().window().maximize();
     driver.get("https://www.google.com");
     
}

@When("send keys")
public void send_keys() {
	pg.searchBox.sendKeys("flipkat");
}


}
