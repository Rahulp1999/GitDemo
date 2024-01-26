package Section08;



import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class L07_Browsertabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Resources Selenium\\Driver-V1\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/browserTabs.html");
		
		for(int i=0;i<3;i++) {
			
			driver.findElement(By.xpath("//input[@value='Open Tab']")).click();
		}
		
		ArrayList<String> windowsHandles = new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println("There are "+ windowsHandles.size() +" tabs open");
		
		for(String item : windowsHandles) {
			Thread.sleep(1500);
			driver.switchTo().window(item);
		}
		
		driver.switchTo().window(windowsHandles.get(0));
		
	
	}

}
