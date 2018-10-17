package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffRegularXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("hello");
		//driver.findElement(By.xpath("//input[contains(@name,'login')")).sendKeys("let us check");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.navigate().back();
		driver.close();
		

	}

}
