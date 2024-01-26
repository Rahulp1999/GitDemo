package Section05;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L03_SendingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Resources Selenium\\Driver-V1\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/contactForm.html");
		//input[name='first_name']
		//input[name='last_name']
		//input[name='email']
		//textarea[name='message']
		
		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Jhon");
		driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Smith");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("JhonSmith@gmail.com");
		driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys("Jhonsmith are you fine");
			}
	}


