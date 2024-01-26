package Section08;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class L11_JavaScriptExcecutorPt2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Resources Selenium\\Driver-V1\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/contactForm.html");
		
		
		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Jhon");
		driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Smith");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("JhonSmith@gmail.com");
		driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys("Jhonsmith are you fine");
		
		WebElement submit = driver.findElement(By.cssSelector("[type='submit']"));
		WebElement reset = driver.findElement(By.cssSelector("[type='reset']"));
		
//		submit.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click(), arguments[1].click()" ,reset, submit);
	}

}
