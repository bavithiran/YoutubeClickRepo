package mainActionFolder;

import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MainAction {
	
	public WebDriver driver;
	
	
	
	public void LaunchBrowerAction() throws InterruptedException
	{
		String BaseUrl = "https://www.youtube.com/";
		System.out.println("Launching Started ............");

		System.setProperty("webdriver.chrome.driver", "C://ChromeDriver_test//chromedriver.exe");
		
		// to start chrome browers in incognito browser.....
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		
		
	    driver = new ChromeDriver(options);

		driver.get(BaseUrl);
		String title = driver.getTitle();
		TimeUnit.SECONDS.sleep(3);
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(5);

		System.out.println("Title Of the Website " + title);

		TimeUnit.SECONDS.sleep(5);
		
		
	}
	
	public void YoutubeSearchAction() throws InterruptedException
	{
		System.out.println("Youtube Search.................");
		
		WebElement SearchField = driver.findElement(By.xpath("//form//div//div//input[@id=\"search\"]"));
		SearchField.sendKeys("Diya's best");
		TimeUnit.SECONDS.sleep(1);
		
		WebElement SearchFieldButton = driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon"));
		SearchFieldButton.click();
		TimeUnit.SECONDS.sleep(8);
		
		WebElement SearchFieldVideo = driver.findElement(By.xpath("//div[@id=\"items\"]//ytd-video-renderer//div[@id=\"title-wrapper\"]"));
		SearchFieldVideo.click();
		TimeUnit.SECONDS.sleep(40);
		
		WebElement VideoText = driver.findElement(By.xpath("//h1[@class=\"title style-scope ytd-video-primary-info-renderer\"]//yt-formatted-string[@class=\"style-scope ytd-video-primary-info-renderer\"]"));
		String TextValue =  SearchFieldVideo.getText();
		
		System.out.println("Selected Video Name"+ " " + "=" + " " +TextValue);
		

	}

	public void QuitBrowserAction() {
		
		driver.close();
		System.out.println("Quitting the Browser............");
	}
	
}
