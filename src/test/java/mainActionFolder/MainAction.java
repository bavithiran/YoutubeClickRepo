package mainActionFolder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainAction {
	
	public WebDriver driver;
	
	public void LaunchBrowerAction() throws InterruptedException
	{
		String BaseUrl = "https://www.youtube.com/";
		System.out.println("Launching Started ............");
		// SS.sendMail();

		System.setProperty("webdriver.chrome.driver", "C://ChromeDriver_test//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(BaseUrl);
		String title = driver.getTitle();
		TimeUnit.SECONDS.sleep(3);
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(5);

		System.out.println("Title Of the Website " + title);

		TimeUnit.SECONDS.sleep(5);
	}
	
	public void YoutubeSearchAction()
	{
		System.out.println("Youtube Search.................");
		
		WebElement UN = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		//UN.sendKeys(UserName);
		System.out.println("Entered UserName");

	}

	public void QuitBrowserAction() {
		driver.close();
		System.out.println("Quitting the Browser............");
	}
	
}
