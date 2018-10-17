package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCByCss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bbc.com");
		driver.findElement(By.cssSelector("span[id*='username']")).click();
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//p[contains(@class,'text')]")).getText());
		driver.navigate().back();
		driver.close();
	}

}
