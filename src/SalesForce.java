import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesForce {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("zaytuna");
	   // driver.findElement(By.name("pw")).sendKeys("1234");
		driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		//driver.findElement(By.xpath("//*[@id=\'Login\'] ")).click();
		//driver.findElement(By.linkText("Forgot Your Password?")).click();
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[3]/td[2]/div/a")).click();
	//this will not working . we sometimes we locate webelement from firefox using Xpath that is not stale . if it is too long
		// not working .
	}

}
