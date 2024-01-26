package Section06;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L04_ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Resources Selenium\\Driver-V1\\chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //ypu have set it only onces

driver.get("https://www.automationtesting.co.uk/loader.html");

WebDriverWait wait = new WebDriverWait(driver,10);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#loaderBtn")));


driver.findElement(By.cssSelector("button#loaderBtn")).click();
	}

}
