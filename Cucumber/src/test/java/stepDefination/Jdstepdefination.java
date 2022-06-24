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
//public class Jdstepdefination {
//	public static WebDriver driver;
//
//	@Given("Open the browser")
//	public void open_the_browser() {
//		driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		driver.manage().window().maximize();  
//	}
//
//	@And("Navigate to {string}")
//	public void navigate_to(String string) {
//		driver.get(string);
//	}
//
//	@When("Apply with Name as {string} and Email as {string} and PhoneNo as {string}")
//	public void apply_with_name_as_and_email_as_and_phone_no_as(String string, String string2, String string3) {
//		driver.findElement(By.id("name")).sendKeys(string); 
//		driver.findElement(By.id("mail")).sendKeys(string2);
//		driver.findElement(By.id("phoneNumber")).sendKeys(string3); 
//	}
//
//	@Then("Click on apply button")
//	public void click_on_apply_button() {
//		Boolean enable= driver.findElement(By.id("submit-apply")).isEnabled();
//		System.out.println(enable);
//		if(enable==true) {
//			driver.findElement(By.id("submit-apply")).click();
//		}
//	}
//
//}
