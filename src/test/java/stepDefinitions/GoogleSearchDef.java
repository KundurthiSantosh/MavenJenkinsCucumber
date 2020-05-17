package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchDef {

	WebDriver driver;

	@Given("I launch google url")
	public void i_launch_google_url() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}


	@When("enter search query")
	public void enter_search_query() {
		driver.findElement(By.name("q")).sendKeys("Gmail");
	}

	@When("click on search")
	public void click_on_search() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
		driver.findElement(By.name("btnK")).click();
	}

	@Then("search results should appear")
	public void search_results_should_appear() {
		if(driver.getTitle().equalsIgnoreCase("Gmail - Google Search")) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		driver.quit();
	}

}
