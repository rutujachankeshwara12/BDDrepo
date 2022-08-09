//package stepDefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import Pages.LoginPage;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//public class stepDefination  {
//    public static WebDriver driver;
//	LoginPage l1=new LoginPage(driver);
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
//	    driver.get(string);
//	}
//
//	@When("^Login with Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
//	public void login_with_Email_as_and_Password_as (String arg1, String arg2) throws Exception  {
//		Thread.sleep(3000);
//		l1.setTextInBox1(arg1);
//		l1.setTextInBox2(arg2);
//		Thread.sleep(3000);
//	}
//	
//
//	@Then("Click on login button")
//	public void click_on_login_button() {
//	   
//		l1.clickOnButton();	  
//	}
//
//	
//
//	
//}
