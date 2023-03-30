package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment3 {
	
public static void main(String[] args) throws IOException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
        
        
        driver.manage().window().maximize();        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.amazon.in/");
      
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
        driver.findElement(By.id("twotabsearchtextbox")).submit();
       
        
        
      
        WebElement phoneprize= driver.findElement(By.xpath("//div[@data-index='0']//span[@class='a-price-whole']"));
        
        
        String prize = phoneprize.getText();
        
        System.out.println(prize);
        
       WebElement cusreview = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[2]/div/span[2]/a/span)" ));
       cusreview.getText();
       
       System.out.println(cusreview);
       
       File source = driver.getScreenshotAs(OutputType.FILE);
       File destination = new File("./screenshot/onepluspro.png");
       FileUtils.copyFile(source, destination);
       
       //
       
       WebElement phoneselect = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img)"));
       phoneselect.click();
       
       String parentwindow = driver.getWindowHandle();
       for (String window : driver.getWindowHandles()) {
        driver.switchTo().window(window);
        
        driver.findElement(By.id("add-to-cart-button")).click();
        
        WebElement cart = driver.findElement(By.id("attach-accessory-cart-subtotal"));
        cart.getText();
        System.out.println(cart);
        
        driver.quit();
          
       
       
       }   
       
} 
        
        
}
