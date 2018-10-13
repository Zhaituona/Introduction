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
		//open . hit url on the browser
		System.out.println(driver.getTitle());//get the title of that page
		System.out.println(driver.getCurrentUrl());
		driver.get("http://www.facebook.com");//this is for open the new url and go back to the first url .
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();//it will close open browser
		driver.quit();// it will close all browser open by selenium script
		
		
		//validate if you are get in to the right url
		//System.out.println(driver.getPageSource());
// some Webside they don't allow to right click to see page source , at that time we are using getPageSource method
	}

}
