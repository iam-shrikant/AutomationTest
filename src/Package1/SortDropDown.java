package Package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/testingIframe/dropDown.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement lang = driver.findElement(By.id("SingleDD"));
		
		Select selectLang = new Select(lang);
		
		List<WebElement> allOptions= selectLang.getOptions();
		List<String> optionsText = new ArrayList<String>();
		
		for(WebElement option : allOptions) {
			optionsText.add(option.getText());
		}
		
		optionsText.remove("Select");
		System.out.println("Options in dropdown with Default order :"+optionsText);
		
		List<String> assendingOrder = new ArrayList<>(optionsText);
		List<String> decsOrder = new ArrayList<>(optionsText);
		
		Collections.sort(assendingOrder);
		Collections.sort(decsOrder,Collections.reverseOrder());
		
		
		System.out.println("Options in dropdown with asc order :"+assendingOrder);
		boolean isSorted = optionsText.equals(assendingOrder);
		boolean isDescSort = optionsText.equals(decsOrder);
		if(isSorted) {
			System.out.println("Options are sorted");
		}else if(isDescSort){
			System.out.println("Options are desc sorted");
		}else{
			System.out.println("Options are not sorted");
		}				
	}
}
