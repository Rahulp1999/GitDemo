package Section04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L02_LocatingByID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Resources Selenium\\Driver-V1\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://uat-ebranchnxt.pnbmetlife.com/ebranch-nxt/");
		driver.get("https://uat-ebranchnxt.pnbmetlife.com/ebranch-nxt/login");
		
		driver.findElement(By.cssSelector(".cdk-text-field-autofill-monitored.mat-form-field-autofill-control.mat-input-element.ng-invalid.ng-pristine.ng-tns-c101-0.ng-untouched")).sendKeys("3164466");
			}
	}


