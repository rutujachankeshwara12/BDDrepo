//package stepDefination;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Jdsearchpagestepdefination {
//	WebDriver driver;
//
//	@Given("Navigate to url")
//	public void navigate_to_url() {
//		driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("https://beta.amazjobs.com/");
//	}
//
//	@And("click on find jobs link")
//	public void click_on_find_jobs_link() {
//		driver.findElement(By.linkText("Find Jobs")).click();
//	}
//
//	@When("Click on every job card")
//	public void click_on_every_job_card() throws Exception {
//		List<WebElement> cards= driver.findElements(By.xpath("//div[@class='col-12 col-lg-5 job_title']/div"));
//	System.out.println(cards.size());
//	for(int i=1; i<cards.size(); i++) {
//      cards.get(i).click();
//		
////      Thread.sleep(3000);
////      apply_to_the_job();
//	}
//}
//				
//	@Then("apply to the job")
//	public void apply_to_the_job() throws Exception {
//		driver.findElement(By.id("name")).sendKeys("rutuja");
//		driver.findElement(By.id("mail")).sendKeys("tester@grr.la");
//		driver.findElement(By.id("phoneNumber")).sendKeys("1234567890");
//		Thread.sleep(3000);
//		WebElement p= driver.findElement(By.xpath("//button[@id='submit-apply']"));
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].scrollIntoView();", p);
//		jse.executeScript("arguments[0].click();", p);
//		driver.findElement(By.xpath("//button[@class='close_popup btn btn-primary']")).click();
//		
//	}
//}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		