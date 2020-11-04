package GrootanTask;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Website {
	
	@Test
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			new WebDriverWait(driver, 30);
			driver.get("https://www.grootan.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	
		   //Click on Home
			
			driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Taking a screenshot of Homepage
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File(".//screenshot2//Home.jpg"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		//Click on Services
			
			driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Taking a screenshot of Services
            File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot1, new File(".//screenshot2//Services.jpg"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
            
		//Click on OpenSource
			
			driver.findElement(By.xpath("//a[contains(text(),'Open Source')]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Take a screenshot
			File screenshot2 =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot2, new File(".//screenshot2//opensource.jpg"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//  click on opensourceblog
			
			driver.findElement(By.xpath("//a[contains(text(),'Blog')]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			// Take a Screenshot
			File screenshot3 =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot3, new File(".//screenshot2//opensourceblog.jpg"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			// click on team
			
	      	driver.findElement(By.xpath("//a[contains(text(),'Team')]")).click();
	      	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      	// Take a Screenshot 
            File screenshot4 =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot4, new File(".//screenshot2//team.jpg"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
            
            
            // Click on careers
			driver.findElement(By.xpath("//a[contains(text(),'Careers')]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Take a Screenshot 
			File screenshot5 =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot5, new File(".//screenshot2//Careers.jpg"));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
	            
			
		//	 Click on contactus
			driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// Take a Screenshot	
			File screenshot6 =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot6, new File(".//screenshot2//Contactus.jpg"));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
	            
			
			
			//driver.close(); Close the Current browser 
            // driver.quit();Close all the browser
	}

}
