import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//*[@id=\'react-root\']/section/main/article/div[2]/div[1]/div/form/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\'forgot-password-link\']")).click();
		driver.navigate().back();
		driver.close();
		//driver.findElement(By.id("f1ca74182727ca4")).sendKeys("zabc");
		//driver.findElement(By.xpath("//*[@id=\'f2077c13fc010c8\']")).sendKeys("123456");
		//driver.findElement(By.xpath("//*[@id=\'f2b07e5ae7494d8\']")).sendKeys("almi");
		//driver.findElement(By.xpath("//*[@id=\'f1394ddafc1bd18\']")).sendKeys("1234569");
		//driver.findElement(By.xpath("//*[@id=\'react-root\']/section/main/article/div[2]/div[1]/div/form/div[7]/div/button")).click();
		//System.out.println(driver.findElement(By.xpath("//*[@id=\'ssfErrorAlert\']")).getText());
	}

}
