package GrootanTask;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class Role {

	public static void main(String[] args) {
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
      	
      	
     List<WebElement> Roles=	driver.findElements(By.tagName("h5"));
    		 
    		
      System.out.println("Total no employee:"+Roles.size());
      
      System.out.println(Roles.get(9).getText());
      
      
      //System.out.println(Role.get(8).getAttribute("Role"));
     for (WebElement webElement : Roles)  {
      System.out.println(webElement.getText());
     	if(webElement.getText().trim().equals("Junior Engineer")); {
    	   {
    	     System.out.println("print the name");
    	   }
    	   /*File src=new File("./testdata/test.xlsx");

    	     // Load the file

    	     FileInputStream fis=new FileInputStream(src);

    	      // load the workbook

    	      XSSFWorkbook wb=new XSSFWorkbook(fis);

    	     // get the sheet which you want to modify or create

    	      XSSFSheet sh1= wb.getSheetAt(0);
*/
    	   
    	  //System.out.println(Role.get(i).getAttribute("Classname"));
      }
		
    	}

}
}