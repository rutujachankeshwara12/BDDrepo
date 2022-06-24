//package stepDefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Loginstepdefination {
//	public static WebDriver driver;
//	
//	@Given("Open the browser")
//	public void open_the_browser() { 
//		driver= new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//	driver.manage().window().maximize();
//	    }
//
//	@And("Navigate to {string}")
//	public void navigate_to(String string) {
//	   driver.get(string);
//	    
//	}
//
//	@When("Login with Email as {string} and Password as {string}")
//	public void login_with_email_as_and_password_as(String string, String string2) {
//	    driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys(string);
//	    driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys(string2);
//	    
//	}
//
//	@Then("Click on login button")
//	public void click_on_login_button() {
//		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
//	    
//	}
//
//
//}
