import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("zaytuna128@gmail.com");

	}

}
