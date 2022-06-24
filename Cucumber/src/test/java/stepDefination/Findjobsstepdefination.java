//package stepDefination;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Findjobsstepdefination {
//WebDriver driver;
//private static String[] links = null;
//private static int linksCount = 0;
//
//	@Given("Navigate to url")
//	public void navigate_to_url() {
//		driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("https://amazjobs.com/");
//	   
//	}
//
//	@And("click on find jobs link")
//	public void click_on_find_jobs_link() {
//	   driver.findElement(By.linkText("Find Jobs")).click();
//	    
//	}
//
//	@When("Click on every job")
//	public void click_on_every_job() throws InterruptedException {
//		 List<WebElement> e=driver.findElements(By.xpath("//h2[@class='h5 fs-6 text-capitalize letter-spacing-1 mb-1 jd-job-title']/a"));
//		    linksCount = e.size();
//		    System.out.println("Total no of links Available: "+linksCount);
//		    links= new String[linksCount];
//		    System.out.println("List of links Available: ");  
//		 // print all the links from webpage 
//		 for(int i=0;i<linksCount;i++)
//		 {
//		 links[i] = e.get(i).getAttribute("href");
//		 System.out.println(e.get(i).getAttribute("href"));
//		 } 
//		 // navigate to each Link on the webpage
//		 for(int i=0;i<linksCount;i++)
//		 {
//		 driver.navigate().to(links[i]);
//		 Thread.sleep(3000);
//		 driver.findElement(By.name("name")).sendKeys("Rutuja");
//		 driver.findElement(By.name("email")).sendKeys("tester@grr.la");
//		 driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
//		 driver.findElement(By.id("submit-apply")).click();
//		 Thread.sleep(3000);
//		 driver.navigate().back();
//		
//		 }	
//		System.out.println("hi");
//	    
//	}
//
//	@Then("Check on every page")
//	public void check_on_every_page() throws InterruptedException {
//		
//		try {
//			driver.findElement(By.xpath("(//*[@class='pagination justify-content-end secondary-font']/li)[1]")).click();
//		} catch (Exception e) {
//			driver.findElement(By.xpath("(//*[@class='pagination justify-content-end secondary-font']/li)[1]")).click();
//		}
//		
//		String url= driver.getCurrentUrl();
//		String mainurl= url.substring(0, url.length()-1);
//		int counter =2;
//		boolean flag = true;
//		
//		while(flag)
//		{
//			String s= mainurl+String.valueOf(counter);
//			driver.get(s);
//			System.out.println(s);
//			 List<WebElement> e=driver.findElements(By.xpath("//h2[@class='h5 fs-6 text-capitalize letter-spacing-1 mb-1 jd-job-title']/a"));
//			    linksCount = e.size();
//			    System.out.println("Total no of links Available: "+linksCount);
//			    links= new String[linksCount];
//			    System.out.println("List of links Available: ");  
//			 // print all the links from webpage 
//			 for(int i=0;i<linksCount;i++)
//			 {
//			 links[i] = e.get(i).getAttribute("href");
//			 System.out.println(e.get(i).getAttribute("href"));
//			 } 
//			 // navigate to each Link on the webpage
//			 for(int i=0;i<linksCount;i++)
//			 {
//			 driver.navigate().to(links[i]);
//			 Thread.sleep(3000);
//			 driver.findElement(By.name("name")).sendKeys("Rutuja");
//			 driver.findElement(By.name("email")).sendKeys("tester@grr.la");
//			 driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
//			 driver.findElement(By.id("submit-apply")).click();
//			 Thread.sleep(3000);
//			 driver.navigate().back();
//			
//			 }	
//			 
//			 Thread.sleep(3000);
//			if (driver.findElements(By.xpath("(//*[text()='No Jobs Found'])[2]")).size() > 0) {
//				flag = false;
//
//			} else {
//				counter++;
//			}
//
//		}
//		System.out.println(mainurl);
//		driver.close();
//	}
//}
