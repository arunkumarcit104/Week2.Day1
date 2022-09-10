package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        //chrome browser  
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		//Check  chrome download path
		String path=System.getProperty("webdriver.chrome.driver");
		System.out.println(path);
		
		//open the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//screen Maximize 
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CH");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("test");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Test");
	
		WebElement depDrp = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select drp=new Select(depDrp);
		
		drp.selectByValue("LEAD_CONFERENCE");
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Sample Testprogram");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Test@gmail.com");
		
        WebElement stateDrp = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select drp1=new Select(stateDrp);
		
		drp1.selectByValue("FL");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		
		System.out.println("Heading: "+title);
		
	}

}
