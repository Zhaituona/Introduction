package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Iphone");
		//driver.findElement(By.cssSelector("input[type='submit'])")).click();
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("span[aria-hidden='true'])")).click();
		driver.close();

	}

}
