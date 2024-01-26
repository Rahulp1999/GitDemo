import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Resources Selenium\\Driver-V1\\chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://uat-ebranchnxt.pnbmetlife.com/ebranch-nxt/");
	}

}
