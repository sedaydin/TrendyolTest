package Test.trendyol;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MERAL\\eclipse-workspace\\TrendyolTest\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.trendyol.com/sepetim#/basket");
		driver.manage().window().maximize();

	}

}
