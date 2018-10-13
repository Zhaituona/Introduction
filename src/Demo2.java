import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) {


		//create driver object for firefox browser
		//we will strictly implement methods of webdriver
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		//using this property and this is the path 
		//this is we are using for let the selenium find the location .
		
		//gecko driver
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();//create an object for ChromeDriver , 
		driver.get("http://www.google.com");//driver object can take method get means can open the url we want to 
		//open . 
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("http://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
	

}
}