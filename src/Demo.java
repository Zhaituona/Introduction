import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		//create driver object for chrome browser
		//we will strictly implement methods of webdriver
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		//using this property and this is the path 
		//this is we are using for let the selenium find the location .
		
		WebDriver driver = new ChromeDriver();//create an object for ChromeDriver , 
		driver.get("http://www.google.com");//driver object can take method get means can open the url we want to 
		//open . 
		System.out.println(driver.getTitle());

	}

}
