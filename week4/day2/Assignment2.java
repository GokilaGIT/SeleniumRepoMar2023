package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {

	
	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
        
        driver.manage().window().maximize();        
        driver.get("https://www.snapdeal.com/");        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		       	 
	 	Actions actions = new Actions(driver);          	 	
        WebElement mensfash = driver.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[1]/a/span[2]"));
        actions.moveToElement(mensfash).perform();
        WebElement sports = driver.findElement(By.xpath("//span[contains(text(),'Sports Shoes')]"));          
        sports.click();
                   
        WebElement shoecount = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[2]/div[2]/div[3]/span"));
        String countshoe = shoecount.getText();
        
        System.out.println(countshoe);
        
        driver.close();
        driver.quit();
            
		
	}
}
