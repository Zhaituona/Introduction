package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonCssFireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.cssSelector("input[dir='auto']")).sendKeys("IphoneX");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[class='nav-a')")).click();

	}

}
