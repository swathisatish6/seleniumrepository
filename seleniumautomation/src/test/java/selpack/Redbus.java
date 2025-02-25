package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus extends DateDemo
{

	public static void main(String[] args)  
	{
		
		WebDriver driver;
		
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();  
		 driver.get("https://www.redbus.in/");
		 driver.manage().window().maximize();		 
		 driver.findElement(By.id("onwardCal")).click();
		 
		 
		 
		  
		 String input = "May 2025 "
	        		+ "2 holidays";
		  String date = extractDate(input);
		  while(true)
		  {
			  WebElement monthyear = driver.findElement(By.className(input));
			  String monthyeartext = monthyear.getText();

			  
		  }
		  
		  
		 
	}

}
