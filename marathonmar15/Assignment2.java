package marathonmar15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment2 {
	
	public static void main(String[] args) {
		
		
		
		
		EdgeDriver driver = new  EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("sc-hCaUpS.cLnzvB")).sendKeys("Hyderabad");
		driver.findElement(By.cssSelector("sc-hCaUpS.cLnzvB")).click();		
		driver.findElement(By.cssSelector("sc-hycgNl hOHPck")).sendKeys("Balagam");
		driver.findElement(By.cssSelector("sc-cmIlrE fMfggA")).click();
		//CommonContainers__ButtonComponent-sc-8f9mtj-0 CommonContainers__CtaComponent-sc-8f9mtj-1 styles__CtaButtonContainer-sc-1vmod7e-0 emIChW
		//driver.findElement((By.class("styles__CtaText-sc-1vmod7e-2 bBLrVT")).
		//		driver.findElement(By.xpath("//*[@id="page-cta-container"]/button/div"))
				
				
				driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[5]")).click();
		
		
		
		
	}

}
