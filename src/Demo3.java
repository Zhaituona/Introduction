import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver" , "C:\\Users\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.get("http://www.facebook.com");
		driver.close();
		
		
		//make sure close IE then run 
	
		//driver.get("http://www.facebook.com");
		//driver.navigate().back();

	}

}
