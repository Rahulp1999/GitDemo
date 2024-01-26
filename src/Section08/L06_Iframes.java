package Section08;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class L06_Iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Resources Selenium\\Driver-V1\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/iframes.html");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector(".toggle")).click();
		
		driver.switchTo().parentFrame();
		
        Thread.sleep(3000);
        
		driver.findElement(By.cssSelector(".toggle")).click();
		
         driver.switchTo().frame(1);
         
         Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("[aria-label='Play']")).click();
		
	}

}
