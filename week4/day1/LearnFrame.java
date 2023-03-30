package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrame {
	
	public static void main(String[] args) {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
        
        driver.manage().window().maximize();
        
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);
        WebElement eleframe = driver.findElement(By.xpath("//html/body/button[text()='Try it')"));
        		
        		//xpath("//html/body/button[text()='Try it')")).click();
        
       String textbutton = eleframe.getText();
         eleframe.click();
        		System.out.println(textbutton);
	}

}
