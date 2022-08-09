//package stepDefination;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class TopCompanies {
//	public static WebDriver driver;
//
//	@Given("Open the browser")
//	public void open_the_browser() {
//		driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@When("Go to the home page")
//	public void go_to_the_home_page() {
//		driver.get("https://beta.amazjobs.com/");
//	}
//
//	@Then("Get list of all top companies names")
//	public void get_list_of_all_top_companies_names() throws Exception {
//		Thread.sleep(3000);
//    WebElement a= driver.findElement(By.xpath("//h5[contains(text(),'Top Companies')]"));
//    JavascriptExecutor jse = (JavascriptExecutor) driver;
//	jse.executeScript("arguments[0].scrollIntoView(true);", a);
//    List<WebElement> link= a.findElements(By.xpath("//body/div[1]/section[2]/div[1]/div[2]/div[2]/div[1]/a"));
//    System.out.println(link.size());
//    
//    for(WebElement links:link){
//    	 System.out.println(links.getText() + " - " + links.getAttribute("href"));
//    	 
//    	 }
////    for(int i = 0; i<link.size(); i++) {
////    System.out.println(link.get(i).getAttribute("href")); 
////  
////   
////    }
////         
////   driver.findElement(By.xpath("//span[contains(text(),'Show more')]")).click();
////    List<WebElement> b=driver.findElements(By.xpath("//body/div[1]/section[2]/div[1]/div[2]/div[2]/div[2]/div[1]/a"));
////	System.out.println(b.size());
//	}
//
//	@And("Click on each company name")
//	public void click_on_each_company_name() {
//
//	}
//
//}
