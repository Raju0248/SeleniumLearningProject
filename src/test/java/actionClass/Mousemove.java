package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemove {
	
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
Thread.sleep(3000);

driver.get("http://www.mrbool.com/");

Actions action = new Actions(driver);
action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
Thread.sleep(3000);

driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']")).click();


Thread.sleep(3000);
driver.quit();
}
}
