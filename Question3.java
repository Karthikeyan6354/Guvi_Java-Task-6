package guviassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) {
			
		WebDriver driver=new ChromeDriver();  //Opening the chrome browser
		driver.get("https://www.wikipedia.org/"); //navigate to wikipedia
		driver.manage().window().maximize();  //Maximize the window
		
		//Search the 'Artificial Intelligence in Search Query' by passing the msg through Xpath locator 
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Artificial intelligence");
		
		//After Input, click the search button using Xpath
		driver.findElement(By.xpath("//i[@data-jsl10n='search-input-button']")).click();
		
		//After the result, click the History title through linktext locator 
		driver.findElement(By.linkText("History")).click();
		
		//Storing the title of the section through get text method by xpath locator
		String sectiontitle=driver.findElement(By.xpath("//h2[@id='History']")).getText();
		System.out.println("Section title: "+ sectiontitle);  //printing the section title
	}
}
