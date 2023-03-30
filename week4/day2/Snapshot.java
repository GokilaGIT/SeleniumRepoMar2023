package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Snapshot {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
        
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");
        //driver.findElement(By.className("a")).click();
        
        String parentWindowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//div[@class='iconsection']//label[text()='FLIGHTS']")).click();
        Set<String>windowHandles = driver.getWindowHandles();
        List<String>windowHandlesList = new ArrayList<String>(windowHandles);
        driver.switchTo().window(windowHandlesList.get(1));
                
               
        System.out.println(driver.getTitle());
        		
        		//to take snapshot
        
        File source = driver.getScreenshotAs(OutputType.FILE);
        File destination = new File("./screenshot/flights.png");
        FileUtils.copyFile(source, destination);
        driver.quit();
        
        
	}
}
