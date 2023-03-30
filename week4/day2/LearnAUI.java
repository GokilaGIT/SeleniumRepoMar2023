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
import org.openqa.selenium.interactions.Actions;

public class LearnAUI {
	
public static void main(String[] args) throws IOException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
        
        
        driver.manage().window().maximize();
        driver.get("https://www.ajio.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        WebElement scrollele = driver.findElement(By.xpath("//span[@class='ic-cod']"));
        
        Actions builder = new Actions(driver);
        builder.scrollToElement(scrollele).perform();
        File codeScreen = driver.getScreenshotAs(OutputType.FILE);
        File destination = new File("./snaps/ajioco.png");
        FileUtils.copyFile(codeScreen, destination);
        driver.quit();
        System.out.println("scrolldown done");
        
        
        
        
        
        
}

}
