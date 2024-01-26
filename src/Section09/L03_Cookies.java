package Section09;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class L03_Cookies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Resources Selenium\\Driver-V1\\chromedriver.exe");


WebDriver driver =new ChromeDriver();

driver.manage().window().maximize();


driver.get("http://teststore.automationtesting.co.uk/");

driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
//Thread.sleep(1000);
driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("automation@test.com");

driver.findElement(By.cssSelector("[name='password']")).sendKeys("Light@123");
driver.findElement(By.cssSelector("[data-link-action='sign-in']")).click();
driver.findElement(By.linkText("CLOTHES")).click();
driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();
driver.findElement(By.cssSelector("[data-button-action]")).click();
Thread.sleep(3000);
driver.findElement(By.cssSelector(".cart-content-btn .btn-primary")).click(); //unable to click this button

driver.manage().deleteAllCookies();

	}

}
