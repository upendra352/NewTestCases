package vendor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VendorActe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "./driver/chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	      driver.get("http://acme-test.uipath.com/account/login");
	      driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
	      driver.findElementById("password").sendKeys("leaf@12",Keys.ENTER);
	      driver.findElementById("buttonLogin").click();
	      Actions action = new Actions(driver);
	      WebElement element = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
	      action.moveToElement(element).perform();
	      driver.findElementByXPath("//a[text()='Search for Vendor']").click();
	      driver.findElementById("vendorName").sendKeys("Blue Lagoon");
	      driver.findElementByXPath("//button[@id='buttonSearch']").click();
	      
//	      List<WebElement> allOptions= driver.findElements(By.xpath("//table[@class='table']"));
//	      List<String> listDetails = new ArrayList<String>();
//	      for(WebElement e: allOptions)
//	      {
//	        String vDetails=e.getText();
//	        listDetails.add(vDetails);
//	        //System.out.println(vDetails);
//	        String str=listDetails.get(3);
//	        //System.out.println(str);
//	        
//	        for(int i=0;i<listDetails.size();i++){
//	            System.out.println(str);
//	        } 
//	      }
	      
	    //  WebElement Coun = driver.findElementByXPath("//table[@class='table']/tbody/tr[2]/td[5]");
	      String str=driver.findElementByXPath("//table[@class='table']/tbody/tr[2]/td[5]").getText();
	      System.out.println(str);
	      
	      driver.findElementByXPath("//a[text()='Log Out']").click();
}
}
