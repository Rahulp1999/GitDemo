package Section09;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class L04_ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Resources Selenium\\Driver-V1\\chromedriver.exe");


WebDriver driver =new ChromeDriver();

driver.manage().window().maximize();


driver.get("http://automationtesting.co.uk/");


takeSnapshot(driver);
     }
	
	public static void takeSnapshot(WebDriver webdriver) throws IOException {
		
		File srcFile=((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("C:\\Users\\Dell\\Desktop\\Resources Selenium\\Screenshots\\ " + timeStamp()+  " .png");
		
		FileUtils.copyFile(srcFile, destFile);
		
	}
	
	public static String timeStamp()
	{
		return new SimpleDateFormat("yyyy-MM-dd HH-MM-ss").format(new Date());
	}
}
