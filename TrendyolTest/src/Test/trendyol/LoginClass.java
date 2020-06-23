package Test.trendyol;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MERAL\\eclipse-workspace\\TrendyolTest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trendyol.com");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;

		WebElement icon=driver.findElement(By.className("icon-container"));
		icon.click();
		Thread.sleep(4000);
		WebElement se=driver.findElement(By.className("icon navigation-icon-basket"));
		se.click();
		Thread.sleep(4000);
		WebElement s2e=driver.findElement(By.className("nav-span"));
		s2e.click();
		Thread.sleep(4000);
		
       
		
		
	}

}
