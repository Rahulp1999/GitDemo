package Section06;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L05_FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Resources Selenium\\Driver-V1\\chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //ypu have set it only onces

driver.get("https://www.automationtesting.co.uk/loadertwo.html");

Wait<WebDriver> fluent = new FluentWait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(5))
.pollingEvery(Duration.ofSeconds(1))
.ignoring(NoSuchElementException.class);

WebElement para = fluent.until(new Function<WebDriver, WebElement>(){
	public WebElement apply(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("#appears"));
	}
});
System.out.println(para.getText());


	}

}
