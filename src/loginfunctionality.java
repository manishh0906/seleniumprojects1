import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginfunctionality {
	  WebDriver driver = new ChromeDriver();
	  
	  
	  void login_navigate() throws InterruptedException {
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123"); 
//			orangehrm.screenshot(driver);
			System.out.println("screenshot capture");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(5000);
//			orangehrm.screenshot(driver);
//		  
		  
		  
		  
		  
	  }
	  

}
