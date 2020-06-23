package Test.trendyol;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchClass {
	static WebDriverWait wait = null;
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\MERAL\\eclipse-workspace\\TrendyolTest\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.trendyol.com");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement SearchBox= driver.findElement(By.className("search-box"));
		SearchBox.sendKeys("Bilgisayar");
		Thread.sleep(4000);
		WebElement SearchIcon=driver.findElement(By.className("search-icon"));	
		SearchIcon.click();
		Thread.sleep(4000);
		
		String image="11";
		WebElement SearchImage=driver.findElement(By.xpath("//*[@id]/div/div/div[2]/div[2]/div/div["+image+"]/div[1]/a/div[1]/div/img"));
		SearchImage.click();
		WebElement Addbs=driver.findElement(By.className("add-to-bs-tx"));
		Addbs.click();
		Thread.sleep(4000);
		
		WebElement Product=driver.findElement(By.className("headerBasketContentArea"));
		Product.click();
		Thread.sleep(4000);
		
		WebElement ProductBox=driver.findElement(By.className("productPriceBox"));
		ProductBox.click();
		Thread.sleep(4000);
		
		
	  

		
		
	}
	
}
