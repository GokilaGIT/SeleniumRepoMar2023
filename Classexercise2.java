package marweek2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Classexercise2 {
	
	public static void main(String[] args ) {
		
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps");
			driver.findElement(By.id("username")).sendKeys("demoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCSF");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokila");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gangatharan");
			
			WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select emp = new Select(sourceDD);
			emp.selectByIndex(4);
			
			WebElement campDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select camp = new Select(campDD);
			camp.selectByVisibleText("Automobile");
			
			WebElement ownerDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select owner = new Select(ownerDD);
			owner.selectByValue("OWN_CCORP");
			
			
			driver.findElement(By.className("smallSubmit")).click();
			
			String title= driver.getTitle();
			System.out.println(title);	
		
				
	}

}
