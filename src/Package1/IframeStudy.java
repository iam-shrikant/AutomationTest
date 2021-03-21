package Package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/testingIframe/index.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> iframElemt = driver.findElements(By.tagName("iframe"));
		
		System.out.println("Total iframe in page is "+iframElemt.size());		
		//System.out.println(iframElemt.toString());		
		
		int iframeCount = iframElemt.size();
		for(int i = 0;i<iframeCount;i++) {
			driver.switchTo().frame(i);
			System.out.println(i);
			  try {
				  
			  }catch(Exception e) {
				  //System.out.println("Throwing exception"+e.getMessage()); 
			  }
			  driver.switchTo().defaultContent();			 
		}
	}
}
