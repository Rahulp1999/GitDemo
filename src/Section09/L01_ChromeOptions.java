package Section09;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class L01_ChromeOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Resources Selenium\\Driver-V1\\chromedriver.exe");

ChromeOptions options = new ChromeOptions();

options.addArguments("--start-maximized");
options.addArguments("--incognito");

WebDriver driver =new ChromeDriver(options);

//driver.manage().window().maximize();


driver.get("https://automationtesting.co.uk");
	}

}
