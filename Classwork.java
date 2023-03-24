package week3.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Classwork {
	
	public static void main(String[] args) {
		
		ChromeDriver driver1 = new ChromeDriver();
		
		
		
		driver1.manage().window().maximize();
		
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver1.get("https://www.Amazon.in");
		driver1.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		driver1.findElement(By.id("twotabsearchtextbox")).click();
		String phoneprice = driver1.findElement(By.className("a-price-whole")).getText();
		
		System.out.println(phoneprice);
		

		
	}

    
    
    
    
    
 
  
       
    
    
 
}