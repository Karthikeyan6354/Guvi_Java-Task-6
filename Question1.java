package guviassessment;

import org.openqa.selenium.WebDriver;            //importing the webdriver package
import org.openqa.selenium.firefox.FirefoxDriver; //importing the firefoxdriver package

public class Question1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();  //opening the Firefox browser
		driver.manage().window().maximize();  //Maximizing the window
		driver.get("http://www.google.com");   //navigating to Google Page
		//driver.navigate().to("http://gfoogle.com");
		String url=driver.getCurrentUrl();     //Storing the Url for the current webpage
		System.out.println("Current URL of the page:" + url); //Printing the URl on the console
		driver.navigate().refresh();           //Reload the current webpage
		driver.close();                        //Closing the browser
	}
}
