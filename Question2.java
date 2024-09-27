package guviassessment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {
				
		WebDriver driver=new ChromeDriver();     //Opening the Chrome Browser
		driver.navigate().to("https://www.demoblaze.com/");  //navigate to the Demoblaze site
		driver.manage().window().maximize();        //Maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //implicit wait for the web page
		String title=driver.getTitle();          //Storing the title of webpage
		if (title.equals("STORE"))               //to check the title of page is Store or not
          System.out.println("Page Landed on Correct Website");         //If its correct print this msg
		else
		 System.out.println("Page not Landed on Correct Website");      //If its not correct, print this msg
	}

}
