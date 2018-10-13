import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("zaytuna128@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.cssSelector("#pass")).sendKeys("123466");
		driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();// is working 
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		//driver.navigate().back();
		//driver.findElement(By.linkText("Data Policy")).click();
		driver.findElement(By.id("reg-link")).click();
		driver.findElement(By.xpath("//*[@id=\'u_0_11\']")).getText();
		driver.close();
		//there is the six ways to locate the web element .
		

	}

}
