package Package1;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// For Firefox Driver
		// System.setProperty("webdriver.gecko.driver", "E:\\Selenium
		// Java\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("http://www.erokda.in/newinvest/productlist");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement filterSidebar = driver.findElement(By.id("filter-sidebar"));
		WebElement skipIntro = driver.findElement(By.xpath("//div[@class='introjs-tooltipbuttons']/a"));
		WebElement closeSignUp = driver.findElement(By.id("zh_close"));

		// Check if Skip is display and click on skip intro
		if (skipIntro.isDisplayed()) {
			skipIntro.click();
		}

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CONTACT_EMAIL")));

		// Check if any sign up popup appear; if any close.
		if (closeSignUp.isDisplayed()) {
			// driver.findElement(By.id("CONTACT_EMAIL")).sendKeys("");
			closeSignUp.click();
		}

		// Applying filter
		applyFilters(driver, filterSidebar);

		// select 3 funds
		Thread.sleep(2000);
		List<WebElement> searchResult = driver.findElements(By.className("mf-item"));
		System.out.println("Total Result count:" + searchResult.size());

		for (int i = 0; i < 3; i++) {
			WebElement ele = searchResult.get(i).findElement(By.name("compareFunds"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", ele);
		}
		// click on compare button
		driver.findElement(By.id("compareSelected")).click();
	}

	/*
	 * Def: Apply 2 filters; SIP from Mode and Growth from fund option Param: 1.
	 * WebDriver 2. WebElement
	 */
	public static void applyFilters(WebDriver d, WebElement filterSidebar) throws InterruptedException {
		Actions a = new Actions(d);
		a.moveToElement(filterSidebar).build().perform();

		WebElement modeFilter = d.findElement(
				By.xpath("//div[@id='filter-sidebar']/div[@class='filter-item']/a[@aria-controls='mode']"));
		modeFilter.click();
		WebElement sip = d.findElement(By.xpath(
				"//div[@id='filter-sidebar']/div[@class='filter-item']/div[@id='mode']/label[@data-search='SIP']"));
		sip.click();

		Thread.sleep(3000);

		a.moveToElement(filterSidebar).build().perform();

		WebElement fundoptFilter = d.findElement(
				By.xpath("//div[@id='filter-sidebar']/div[@class='filter-item']/a[@aria-controls='fundopt']"));
		fundoptFilter.click();
		WebElement Debt = d.findElement(By.xpath(
				"//div[@id='filter-sidebar']/div[@class='filter-item']/div[@id='fundopt']/label[@data-target='#Growth1']"));
		Debt.click();
	}
}
