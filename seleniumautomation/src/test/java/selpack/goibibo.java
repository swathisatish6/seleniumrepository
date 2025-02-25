package selpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class goibibo 
{

	public static void main(String[] args) throws Exception 
	{
		
		 WebDriver driver;
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.goibibo.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(10000);
		 
		/*List<WebElement> dep = driver.findElements(By.xpath("//span[@class=\"sc-12foipm-3 dtSKny fswWidgetLabel\"]"));
		System.out.println("Elements size : " + dep.size());
		for(int i=0;i<dep.size();i++)
		{
			if(dep.get(i).getText().contains("Departure"))
			{
				dep.get(i).click();
				break;
			}
		}*/
		 
	    
	   
		//WebElement navi = driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']"));
		 driver.findElement(By.xpath("//span[text()='Departure']")).click();
		 Thread.sleep(10000);
		  WebElement nav = driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']"));


}
	}

