package Section08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L0_TravelWebsitePt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Resources Selenium\\Driver-V1\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.easyjet.com/en/");
		
		driver.findElement(By.id("ensCloseBanner")).click();
		
		driver.findElement(By.cssSelector("input[name='origin']")).click();
		
		driver.findElement(By.cssSelector("input[name='origin']")).sendKeys("London");
		
		//List<WebElement> origins = driver.findElements(By.cssSelector("#ui-id-1 li>a>span"));
		
		List<WebElement> origins = new WebDriverWait(driver,2000)
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-1 li>a>span")));
		
		for(WebElement origin:origins) {
			//gives the list of the places starts with london
			//System.out.println(origin.getText());
			
			if(origin.getText().contains("Southend")) {
				origin.click();
			}
		}
	}

}
