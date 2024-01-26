package Section05;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class L13_HiddenElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Resources Selenium\\Driver-V1\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/hiddenElements.html");
		
	
	System.out.println(driver.findElement(By.cssSelector("#main [class] p:nth-child(3)")).isDisplayed());
	System.out.println(driver.findElement(By.cssSelector("#main .inner [class] p:nth-child(4)")). isDisplayed());
		
	}
}


