package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver = new  ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://Amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		driver.findElement(By.className(" for boys")).click();
		WebElement bagscount = driver.findElement((By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]")));
		
		System.out.println(bagscount.getText());
		
		
		
		//*[@id="search"]/span/div/h1/div/div[1]/div/div/span[1]
		
		
	}

}
