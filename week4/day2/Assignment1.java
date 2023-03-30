package week4.day2;


/**Assignment 1*
===============

1) Go to https://www.nykaa.com/
2) Mouseover on Brands and Search L'Oreal Paris
3) Click L'Oreal Paris
4) Check the title contains L'Oreal Paris(Hint-GetTitle)
5) Click sort By and select customer top rated
6) Click Category and click Hair->Click haircare->Shampoo
7) Click->Concern->Color Protection
8)check whether the Filter is applied with Shampoo
9) Click on L'Oreal Paris Colour Protect Shampoo
10) GO to the new window and select size as 175ml
11) Print the MRP of the product
12) Click on ADD to BAG
13) Go to Shopping Bag 
14) Print the Grand Total amount
15) Click Proceed
16) Click on Continue as Guest
17) Check if this grand total is the same in step 14
18) Close all windows
*/

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
        
		
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		 
	        // Mouseover on Brands and Search L'Oreal Paris
		 
		 	Actions actions = new Actions(driver);
		 	
		 	////*[@id="headerMenu"]/div[1]/ul[2]/li/a
		 	///html/body/div[1]/header/div/div[2]/div/div[1]/div/div[1]/ul[2]/li/a
		 	// WebElement brandsMenu = driver.findElement(By.xpath("//*[@id=\"headerMenu\"]"));
		 	
	        WebElement brandsMenu = driver.findElement(By.xpath("//a[text()='brands']"));
	        actions.moveToElement(brandsMenu).perform();
	        WebElement searchBox = driver.findElement(By.id("brandSearchBox"));
	        searchBox.sendKeys("L'Oreal Paris");	       
	        searchBox.click();

	        // Click L'Oreal Paris and check title
	        driver.findElement(By.linkText("L'Oreal Paris")).click();
	        String title = driver.getTitle();
	        if (title.contains("L'Oreal Paris")) {
	            System.out.println("Title contains L'Oreal Paris");
	        }

				
		// Click sort By and select customer top rated
        WebElement sortByDropdown = driver.findElement(By.xpath("//span[contains(text(),'Sort By')]"));
        sortByDropdown.click();
        WebElement customerTopRatedOption = driver.findElement(By.xpath("//span[contains(text(),'Customer Top Rated')]"));
       // WebElement customerTopRatedOption = driver.findElement(By.class.
        
        //("//span[@class='ic-cod']"));
        customerTopRatedOption.click();
        
        WebElement category = driver.findElement(By.xpath("//span[contains(text(),'Category')]"));
        category.click();
        
        WebElement categoryHair = driver.findElement(By.xpath("//span[contains(text(),'Hair')]"));
        categoryHair.click();
        
        WebElement hairCare = driver.findElement(By.xpath("//span[contains(text(),'Hair Care')]"));
        hairCare.click();
        
        WebElement hairShampoo = driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]"));
        hairShampoo.click();
        
        WebElement hairConcern = driver.findElement(By.xpath("//span[contains(text(),'Concern')]"));
        hairConcern.click();
        
        WebElement hairColor = driver.findElement(By.xpath("//span[contains(text(),'Color Protection')]"));
        hairColor.click();
        
     // Check whether the Filter is applied with Shampoo
        WebElement filterText = driver.findElement(By.xpath("//span[contains(text(),'Filters Applied')]"));
        String filterApplied = filterText.getText();
        if (filterApplied.contains("Shampoo")) {
            System.out.println("Filter is applied with Shampoo");
            }    else {System.out.println("Filter not applied");
                }
               
        
     // Click on L'Oreal Paris Colour Protect Shampoo
        WebElement lorealShampooLink = driver.findElement(By.xpath("//a[contains(text(),'L'Oreal Paris Colour Protect Shampoo')]"));
        lorealShampooLink.click();

        String parentwindow = driver.getWindowHandle();
        for (String window : driver.getWindowHandles()) {
            driver.switchTo().window(window);
        }
        
        WebElement sizeDropdown = driver.findElement(By.xpath("//span[contains(text(),'Size')]"));
        sizeDropdown.click();
        WebElement sizeOption = driver.findElement(By.xpath("//a[contains(text(),'175ml')]"));
        
       // WebElement sizeOption = driver.findElement(By.xpath("//a[contains(text(),'175ml')]"));
        
        WebElement cost = driver.findElement(By.xpath("//a[contains(text(),'css-1jczs19')]"));
        
       String prize = cost.getText();
             
       System.out.println(prize);
        
       

       WebElement addbag = driver.findElement(By.xpath("//span[contains(text(),'Add to Bag')]"));
       addbag.click();
        
        
       WebElement cartbag = driver.findElement(By.xpath("//span[contains(text(),'Bag')]"));
       cartbag.click();
       
       WebElement ttotal = driver.findElement(By.xpath("//span[contains(text(),'css-1um1mkq e171rb9k3')]"));
       String gtotal = ttotal.getText();
        System.out.println(gtotal);
        
        
        
        
        
			
		
				
				
	}
}
