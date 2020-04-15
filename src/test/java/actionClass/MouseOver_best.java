package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_best {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
Thread.sleep(3000);

driver.get("https://opensource.com/");


Actions action =new Actions(driver);

WebElement artical =driver.findElement(By.xpath("//*[@id=\"menu-1906-1\"]/a"));
WebElement hardware = driver.findElement(By.xpath("//*[@id=\"menu-12351-1\"]/a"));
WebElement  Print = driver.findElement(By.xpath("//*[@id=\"menu-12376-1\"]/a"));

//action.moveToElement(artical).build().perform();
//action.moveToElement(hardware).build().perform();
//action.moveToElement(Print).click().build().perform();

// or you can write
action.moveToElement(artical).moveToElement(hardware).moveToElement(Print).click().build().perform();

Thread.sleep(3000);
driver.quit();





}

}
