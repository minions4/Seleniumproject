package GrootanTask;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class imagecompare {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		new WebDriverWait(driver, 30);
		driver.get("https://www.grootan.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	// Click on team
		driver.findElement(By.xpath("//a[contains(text(),'Team')]")).click();
      	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      	
      	WebElement profile = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]"));//body/div[@id='root']/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]);
        
         File images = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         BufferedImage Fullimg = ImageIO.read(images);
         Point point =profile.getLocation();
        		 int profileWidth = profile.getSize().getWidth();
                 int profileHeight= profile.getSize().getHeight();
                 BufferedImage  profileimages =Fullimg.getSubimage(point.getX(),point.getY(),profileWidth,profileHeight);
                 ImageIO.write(profileimages, "jpg", images);
                 
                 File screenshot9 =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     		
                 FileUtils.copyFile(screenshot9, new File(".//screenshot3//CTO.jpg"));
                 
                 WebElement Hrimage = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/img[1]"));
                 File images1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                 BufferedImage Fullimg1 = ImageIO.read( (File) Hrimage);
                 Point point1 =Hrimage.getLocation();
                		 int HrimageWidth = Hrimage.getSize().getWidth();
                         int HrimageHeight= Hrimage.getSize().getHeight();
                         BufferedImage  Hrimage1 =Fullimg.getSubimage(point1.getX(),point1.getY(),HrimageWidth,HrimageHeight);
                         ImageIO.write(Hrimage1, "jpg", images1);
                         
                         File screenshot10 =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
             		
                         FileUtils.copyFile(screenshot10, new File(".//screenshot3//Hr.jpg"));
	}
	

	               public void comparetheimage() {  
          
                 /*BufferedImage expectedImage = ImageIO.read(new File(System.getProperty("user.dir") +"\Images\Hr manage.png"));
                 Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, Profileimage);
                 BufferedImage actualImage = logoImageScreenshot.getImage();
                          
                 ImageDiffer imgDiff = new ImageDiffer();
                 ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
                 Assert.assertFalse(diff.hasDiff(),"Images are Same");
*/                // driver.quit();
		}
                    	  
                         }


