package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderConcept {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
Thread.sleep(3000);

driver.get("https://jqueryui.com/slider/");

Actions action =new Actions(driver);

driver.switchTo().frame(0);
WebElement sliderButton = driver.findElement(By.xpath("//*[@id='slider']/span"));

action.moveToElement(sliderButton).dragAndDropBy(sliderButton, 300, 0).build().perform();



Thread.sleep(3000);
driver.quit();
	}
}
