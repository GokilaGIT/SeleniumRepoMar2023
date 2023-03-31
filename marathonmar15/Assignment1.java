package marathonmar15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Assignment1 {
	
	
	public static void main(String[] args ) {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
        
        driver.manage().window().maximize();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.get("https://redbus.in");
        driver.findElement(By.id("src")).sendKeys("Chennai");
        driver.findElement(By.xpath("//li[text()='Chennai']")).click();
        driver.findElement(By.id("dest")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[5]")).click();
		
		
		driver.findElement(By.id("search_btn")).click();
		
		String seat = driver.findElement(By.className("f-bold busFound")).getText();
		
		System.out.println(seat);        
		driver.findElement(By.id("bt_SLEEPER")).click();
		
		String title= driver.getTitle();
		System.out.println(title);	
	
	}

}
