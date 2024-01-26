import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell\\Desktop\\Resources Selenium\\Driver-V1\\geckodriver.exe");

	WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk");
	}

}
