package Section05;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L07_Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Resources Selenium\\Driver-V1\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/popups.html");
		
		driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();
		
		Thread.sleep(5000);  //Slows down the alert pop up timing
		
		driver.switchTo().alert().accept(); //if i have to click Ok on the alert pop-up
		
		driver.switchTo().alert().dismiss(); //if i have to click cancel on the alert pop-up
	
	
	
			}
	}


